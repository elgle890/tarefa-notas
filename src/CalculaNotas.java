import java.util.ArrayList;

public class CalculaNotas {
    private ArrayList<Double> notas = new ArrayList<>();
    
    public void AdicionaNota(double nota) {
        notas.add(nota);
    }

    public double Calculo() {
        double soma = 0;
        for(double nota: notas) {
            soma += nota;
        }

        return soma/4;
    }

}
