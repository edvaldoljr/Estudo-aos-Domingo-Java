import java.util.Scanner;

public class TomadaDesisaoIfElse {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = scaner.nextInt();

        //Operador ternario
       // System.out.println((idade >= 18) ? "Pode tirar CNH" : "Ainda não é o momento de tirar CNH.");
        if (idade >= 18) {
            System.out.println("Pode tirar CNH");
        } else if (idade == 17 ) {
            System.out.println("Calma meu jovem falta pouco");
        } else {
            System.out.println("Ainda não é o momento de tirar CNH.");
        }
    }
}
