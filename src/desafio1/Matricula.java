package desafio1;

import java.util.Date;
import java.util.Objects;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date dataDoDia = new Date();


//construtor matricula
    public Matricula(Aluno aluno, Curso curso, Date dataDoDia) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDoDia = dataDoDia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(aluno, matricula.aluno) &&
                Objects.equals(curso, matricula.curso) &&
                Objects.equals(dataDoDia, matricula.dataDoDia);
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "aluno=" + aluno +
                ", curso=" + curso +
                ", dataDoDia=" + dataDoDia +
                '}';
    }


}
