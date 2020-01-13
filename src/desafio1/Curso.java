package desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nomeCurso;
    private String codCurso;
    private ProfessorTitular titular;
    private ProfessorAdjunto adjunto;
    private Integer maxAlunos;
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    public Curso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
    }


// getters e setters

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public ProfessorTitular getTitular() {
        return titular;
    }

    public void setTitular(ProfessorTitular titular) {
        this.titular = titular;
    }

    public ProfessorAdjunto getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(ProfessorAdjunto adjunto) {
        this.adjunto = adjunto;
    }

    public Integer getMaxAlunos() {
        return maxAlunos;
    }

    public void setMaxAlunos(Integer maxAlunos) {
        this.maxAlunos = maxAlunos;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(nomeCurso, curso.nomeCurso) &&
                Objects.equals(codCurso, curso.codCurso) &&
                Objects.equals(titular, curso.titular) &&
                Objects.equals(adjunto, curso.adjunto) &&
                Objects.equals(maxAlunos, curso.maxAlunos) &&
                Objects.equals(alunosMatriculados, curso.alunosMatriculados);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", codCurso='" + codCurso + '\'' +
                ", titular=" + titular +
                ", adjunto=" + adjunto +
                ", maxAlunos=" + maxAlunos +
                ", alunosMatriculados=" + alunosMatriculados +
                '}';
    }

//método que adiciona um aluno a lista. retorna true se o aluno puder ser adicionado e false se não tiver mais vagas
    public Boolean adicionarUmAluno(Aluno umAluno){
        if(alunosMatriculados.size() < maxAlunos){
            alunosMatriculados.add(umAluno);
            System.out.println(umAluno + "matriculado com sucesso");
            return true;
        } else{
            System.out.println("Não foi possível matricular " + umAluno + ". Número máximo de alunos atingido.");
            return false;
        }
    }

// método que exclui aluno da lista de alunos do curso
    public void excluirAluno(Aluno umAluno){
        if(alunosMatriculados.contains(umAluno)){
            alunosMatriculados.remove(umAluno);
        }
    }


}
