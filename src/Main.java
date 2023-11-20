import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.print("Введите пароль повторно: ");
        String confirmPassword = scanner.nextLine();
        try {
            ValidationService.check(login, password, confirmPassword);
            System.out.println("Вы успешно вошли в систему");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}