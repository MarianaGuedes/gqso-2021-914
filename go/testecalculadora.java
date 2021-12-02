public class TesteCalculadora {
    public static void main(String[] a){
        Calculadora c = new Calculadora();
        int valorUm = 5;
        int valorDois = 5;
        double valorTotal = c.somar(valorUm, valorDois);
        assertEquals(valorTotal, 10);
    }
}
