public class Turma {
    private String nome;
    private Professor professor;

    private Aluno[] alunos;

    private int posicaoAtual = 0;

    public Turma(String nome, Professor professor, int numeroVagas) {
        this.nome = nome;
        this.professor = professor;
        alunos = new Aluno[numeroVagas];
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public void inserirAluno(Aluno aluno){
        alunos[posicaoAtual] = aluno;
        posicaoAtual++;
    }
    public void listarAlunos(){
        for(int i = 0; i < posicaoAtual; i++){
            System.out.println("Aluno" + (i+i) + ":" + alunos[i].getNome());
        }
    }
}
