import java.util.Scanner;

public class TomadaDecisaoIF {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int seuAcesso;
        int acessoLiberar = 5555;
        System.out.println("Digite o seu acesso: ");
        seuAcesso = scaner.nextInt();

        if(seuAcesso == acessoLiberar) {
            System.out.println("Acesso liberado");
        }

        System.out.println("fale com o admistrador");

    }
}
