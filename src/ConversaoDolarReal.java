public class ConversaoDolarReal {
    public static void main(String [] args){
        double valorDolar = 3.67;
        double taxaConversao = 4.94;
        double conversorDolarEmReal = valorDolar * taxaConversao;

        System.out.println(String.format("O valor de %.2f dólares em reais é: R$ %.2f", valorDolar, conversorDolarEmReal));

    }
}
