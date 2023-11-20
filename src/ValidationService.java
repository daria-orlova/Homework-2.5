import java.util.concurrent.ThreadLocalRandom;

public class ValidationService {
    private static final Checker CHECKER = ThreadLocalRandom.current().nextBoolean() ?
            new LoopChecker() :
            new RegexpChecker();
    private ValidationService() {
    }
    public static void check(String login,
                             String password,
                             String confirmPassword) throws WrongLoginException, WrongPasswordException {
        CHECKER.checkLogin(login);
        CHECKER.checkPassword(password);
        CHECKER.checkPasswords(password, confirmPassword);
    }
}
