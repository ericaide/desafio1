package desafio1;

import java.util.Objects;

public abstract class Professor {

    private String nomeProf;
    private String sobrenomeProf;
    private Integer tempoCasa;
    private Integer codProf;

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getSobrenomeProf() {
        return sobrenomeProf;
    }

    public void setSobrenomeProf(String sobrenomeProf) {
        this.sobrenomeProf = sobrenomeProf;
    }

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodProf() {
        return codProf;
    }

    public void setCodProf(Integer codProf) {
        this.codProf = codProf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(nomeProf, professor.nomeProf) &&
                Objects.equals(sobrenomeProf, professor.sobrenomeProf) &&
                Objects.equals(tempoCasa, professor.tempoCasa) &&
                Objects.equals(codProf, professor.codProf);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nomeProf='" + nomeProf + '\'' +
                ", sobrenomeProf='" + sobrenomeProf + '\'' +
                ", tempoCasa=" + tempoCasa +
                ", codProf=" + codProf +
                '}';
    }



}
