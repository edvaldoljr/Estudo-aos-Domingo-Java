public class Casting {
    public static void main(String[] args) {

        /*
        Casting feito implicitamente, pois o valor possui um
       tamanho menor que o tipo da variavel que irá recebe-lo.
         */


//        int d = (int) 5.1974F;
//        System.out.println(d);

        float valorFloat = 3.14F;
        int valorInt = (int) valorFloat;
        float novoFloat = (float) valorInt;
        novoFloat = 3.14F;

        System.out.println(valorFloat);
        System.out.println(valorInt);
        System.out.println(novoFloat);
        float novoValorFloat = (float) valorInt;
        novoValorFloat = 3.14F;

    }
}
