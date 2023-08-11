package sistemacontrolenotas;

    public class ControleNotas {
    private Aluno[] alunos;
    private double mediaGeral;

    // Construtor
    public ControleNotas(int numAlunos) {
        alunos = new Aluno[numAlunos];
    }

    // Método para adicionar aluno
    public void adicionarAluno(int indice, Aluno aluno) {
        alunos[indice] = aluno;
    }

    // Método para calcular médias e situações dos alunos
    public void calcularMediasESituacoes() {
        for (Aluno aluno : alunos) {
            aluno.calcularMedia();
            aluno.determinarSituacao();
        }
    }

    // Método para calcular a média geral da turma
    public void calcularMediaGeral() {
        double somaMedias = 0;
        for (Aluno aluno : alunos) {
            somaMedias += aluno.calcularMedia();
        }
        mediaGeral = somaMedias / alunos.length;
    }

    // Método para obter a média geral da turma
    public double getMediaGeral() {
        return mediaGeral;
    }

    // Método para obter a lista de alunos
    public Aluno[] getAlunos() {
        return alunos;
    }
}


