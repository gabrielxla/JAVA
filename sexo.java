import java.util.Scanner;

public class sexo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite a letra do seu genero ");;
        String genero = sc.nextLine();

        if (genero .equals("M")) {
            System.out.println("Voce é homen");
        }
        else if (genero .equals("F")){
            System.out.println("Voce é mulher");
        }
        else {
            System.out.println("Genero invalido");
        }
        sc.close();
    }    
}
