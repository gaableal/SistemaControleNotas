package sistemacontrolenotas;

public class Aluno {
    private String nome;
    private double[] notas;

    // Construtor
    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    // Métodos para calcular a média e situação
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String determinarSituacao() {
        double media = calcularMedia();
        return (media >= 7) ? "Aprovado" : "Reprovado";
    }
}

