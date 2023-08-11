package sistemacontrolenotas;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numAlunos = 2; // Altere conforme a quantidade de alunos desejada
        ControleNotas controle = new ControleNotas(numAlunos);

        for (int i = 0; i < numAlunos; i++) {
            String nomeAluno = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º aluno:");
            double[] notasAluno = new double[3]; // Altere para a quantidade de notas desejada

            for (int j = 0; j < notasAluno.length; j++) {
                String notaStr = JOptionPane.showInputDialog("Digite a nota " + (j + 1) + " de " + nomeAluno + ":");
                double nota = Double.parseDouble(notaStr);
                notasAluno[j] = nota;
            }

            Aluno aluno = new Aluno(nomeAluno, notasAluno);
            controle.adicionarAluno(i, aluno);
        }

        // Calcular médias, situações e média geral
        controle.calcularMediasESituacoes();
        controle.calcularMediaGeral();

        // Preparar mensagem para exibição
        StringBuilder mensagem = new StringBuilder();
        for (Aluno aluno : controle.getAlunos()) {
            mensagem.append("Aluno: ").append(aluno.getNome()).append("\n");
            mensagem.append("Média: ").append(aluno.calcularMedia()).append("\n");
            mensagem.append("Situação: ").append(aluno.determinarSituacao()).append("\n");
            mensagem.append("--------------------\n");
        }

        mensagem.append("Média Geral da Turma: ").append(controle.getMediaGeral());

        // Exibir resultados usando JOptionPane
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}





