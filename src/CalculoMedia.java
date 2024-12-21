public class CalculoMedia {
    public static void main (String [] args){
        double notaUm = 9.8;
        double notaDois = 7.6;
        double media = (notaUm + notaDois) / 2;

        System.out.println(String.format("A média do aluno foi: %.1f", media));
    }
}
