import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        
        // Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        
        // Compara os dois números e encontra o maior
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais.");
        }
        
        // Fecha o scanner para liberar recursos
        sc.close();
    }
}
