import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int usuario = 0001;
        String agencia = "055-5";

        System.out.println("Por favor digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Obrigado pela preferência " + nome
                + ". Agora digite o saldo que deseja depositar em sua conta:");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta "
                + usuario + " e seu saldo" + saldo + ", estará disponível para saque em 24hrs.");






        entrada.close();
    }
}