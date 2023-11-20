public class RegexpChecker implements Checker{
    private static final String REGEXP = "^\\w{1,20}$";
    @Override
    public void checkLogin(String login) throws WrongLoginException {
        if (!login.matches(REGEXP)) {
            throw new WrongLoginException("Длина или символы логина некорректны");
        }
    }

    @Override
    public void checkPassword(String password) throws WrongPasswordException {
        if (!password.matches(REGEXP)) {
            throw new WrongPasswordException("Длина или символы пароля некорректны");
        }
    }
}
