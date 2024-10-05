import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Digite seu nome completo:");
        conta.setNomeCliente(scanner.nextLine());

        conta.setNumero(validarNumeroConta(scanner));
        conta.setAgencia(validarAgencia(scanner));
        conta.setSaldo(validarSaldo(scanner));

        System.out.println(
                "Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                        + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo()
                        + " já está disponível para saque.");

        scanner.close();
    }

    private static int validarNumeroConta(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Por favor, digite o número da sua conta!");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Por favor, insira um número válido para a conta.");
                scanner.next();
            }
        }
    }

    private static String validarAgencia(Scanner scanner) {
        while (true) {
            System.out.println("Por favor, digite o número da Agência (formato: 067-8)!");
            String agenciaInput = scanner.next();
            if (agenciaInput.matches("\\d{3}-\\d")) {
                return agenciaInput;
            } else {
                System.out.println("Valor inválido. A agência deve estar no formato 123-4.");
            }
        }
    }

    private static double validarSaldo(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Por favor, digite seu saldo!");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Por favor, insira um número decimal válido para o saldo.");

                scanner.next();
            }
        }
    }
}
