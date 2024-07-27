//TODO: Conhecer e importar a classe scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuário
        //Obter pela classe Scanner, os valores digitados no terminal
        System.out.println("Por favor, digite seu nome ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, insira o número da conta ");
        int numero = scanner.nextInt();

        System.out.println("Insira a agência com digito (xxx-x) ");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o valor do saldo ");
        double saldo = scanner.nextDouble();


        //Exibir a mensagem final;
        System.out.println("Olá " + nome + " " + sobrenome
        + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
     }
}
