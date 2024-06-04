import java.util.Scanner;

public class TomandaDecisaoSwithCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia  da semana (EX: seg, ter, qua, qui, sex, sab, dom): ");
        String diaSemana = scanner.nextLine();

        String horarioDeFuncionamento;

        //Estrutura antiga
        switch (diaSemana) {
            case "seg":
                horarioDeFuncionamento = "Fechado";
                break;
            case "ter":
            case "qua":
            case "qui":
            case "sex":
                horarioDeFuncionamento = "Aberto das: 08:00 as 18:00 horas";
                break;
            case "sab":
            case "dom":
                horarioDeFuncionamento = "Aberto das: 08:00 as 12:00 horas";
                break;
            default:
                horarioDeFuncionamento = "DIA INVALIDO";
        }
        System.out.println(horarioDeFuncionamento);

    }
}
