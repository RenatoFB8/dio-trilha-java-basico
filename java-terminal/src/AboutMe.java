import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String name = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String lastName = scanner.next();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("==============");
        System.out.println("Olá, me chamo " + name + " " + lastName);
        System.out.println("Tenho " + idade+ " anos");
        System.err.println("Minha altura é " + altura);
        System.out.println("==============");

        scanner.close();
    }
}
