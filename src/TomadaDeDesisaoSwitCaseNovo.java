import java.util.Scanner;

public class TomadaDeDesisaoSwitCaseNovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero2;
        System.out.println("Digite o dia  da semana (EX: seg, ter, qua, qui, sex, sab, dom): ");
        String diaSemana = scanner.nextLine();
        System.out.printf("Horário de funcionamento: %s\n", switch (diaSemana){

            case "seg" -> "FECHADO";
            case "ter", "qua", "qui", "sex" -> "ABERTO DAS: 08:00 AS 18:00";
            case "sab", "dom" -> "ABERTO DAS: 08:00 AS 12:00";
            default -> "DIA INVALIDO";
        });

    }
}