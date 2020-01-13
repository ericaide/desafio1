package desafio1;

import java.util.Objects;

public class Aluno {

    private String nomeAluno;
    private String sobrenomeAluno;
    private Integer codAluno;

// construtor
    public Aluno(String nomeAluno, String sobrenomeAluno, Integer codAluno) {
        this.nomeAluno = nomeAluno;
        this.sobrenomeAluno = sobrenomeAluno;
        this.codAluno = codAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nomeAluno, aluno.nomeAluno) &&
                Objects.equals(sobrenomeAluno, aluno.sobrenomeAluno) &&
                Objects.equals(codAluno, aluno.codAluno);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", sobrenomeAluno='" + sobrenomeAluno + '\'' +
                ", codAluno=" + codAluno +
                '}';
    }


}
