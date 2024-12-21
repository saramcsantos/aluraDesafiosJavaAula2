public class PrecoDesconto {
    public static void main(String [] args){
        double precoOriginal = 23.89;
        double percentualDesconto = 0.10;

        double calculaDesconto = precoOriginal * percentualDesconto;
        double aplicaDescontoPrecoOriginal = precoOriginal - calculaDesconto;

        String informaPrecoFinal = """
                O preço original é R$ %.2f,
                o desconto é de %.2f,
                o preço final com desconto é R$ %.2f
                """.formatted(precoOriginal, percentualDesconto, aplicaDescontoPrecoOriginal);
        System.out.println(informaPrecoFinal);
    }
}
