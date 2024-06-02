import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Conta!");
        int numConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        int numAgencia = scanner.nextInt();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome do Cliente!");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite o saldo!");
        Double saldo= scanner.nextDouble();
    
        System.out.println("\n\nOlá " + nomeCliente + " " + sobrenomeCliente + "!! \n\n" + "Obrigado por criar uma conta em nosso banco! \n\nSua agência é " + numAgencia + ", conta: " + numConta + " e seu saldo de " + saldo + " já está disponível para saque!\n");
    }
}
