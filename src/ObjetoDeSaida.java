import java.util.Scanner;

public class ObjetoDeSaida {
    public static void main(String[] args) {
        System.out.println("Edvaldo");
        //O método System.out.println()
        System.out.println("Seu texto aqui entre aspas duplas");

        //Caractere de escape
        /*
        \n - Nova linha. Posiciona o cursor de tela no início da próxima linha
        \t - Tabulação horizontal. Move o cursor de tela para a próxima parada de tabulação.
        \r - Posiciona o cursor da tela no início da linha atual - não avança para a próxima linha. Qualquer saída de caracteres gerada depois de algum retorno já gerado é sobrescrito os caracteres anteriores gerados na linha atual.
        \” - Aspas duplas. Utilizada para imprimir um caractere de aspas duplas. Exemplo, System.out.println(“\”aspas\””); exibe “aspas”
         */
        System.out.print("Seu \n texto \n aqui \n entre \n aspas \n duplas \n");
        System.out.println("Complete a frase");
        System.out.print("no va todas varias tem que comecarça com \t por ser um padrao ");
        //System.out.print("Seu \r texto \r aqui \r entre \r aspas \r duplas \r");
        System.out.println("\"edvaldo\"");


        //O método System.out.print()
        System.out.print("Edvaldo");
        System.out.print(" junior \n");

        int numero = 10;
        int numero2 = 20;
        float numero3 =1545.4F;
        System.out.println(numero3);
        System.out.printf("%.2f\n", numero3);
        System.out.printf("%.3f\n", numero3);
        System.out.printf("%.0f\n", numero3);
        System.out.println( "Soma das variaveis numero + nemero2 = " + (numero + numero2));
        System.out.printf("Soma das variaveis numero + nemero2 = %d", (numero + numero2));
    }
}
