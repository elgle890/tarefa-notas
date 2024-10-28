public class Verifica {
    public static void main(String[] args) {
        CalculaNotas notas = new CalculaNotas();
        notas.AdicionaNota(9);
        notas.AdicionaNota(8);
        notas.AdicionaNota(7);
        notas.AdicionaNota(6);
        System.out.println(notas.Calculo());
    }

}
