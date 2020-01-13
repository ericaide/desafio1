package desafio1;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Matricula> listaMatriculas = new ArrayList<>();

// método que permite registrar um curso. parâmetros: nome do curso, código e quantidade max de alunos.
// o método deve criar um curso e adicionar a lista de cursos

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        listaCursos.add(curso);

    }

// método que recebe o código do curso, procura numa lista e exclui
    public void excluirCurso(Integer codigoCurso){


    }

// método que registra prof adjunto. parâmetros: nome, sobrenome, codigo, qtdade horas para monitoria.
// o tempo de casa inicial é zero. o método deve criar o prof adjunto e adicionar a lista de profs.

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){

    }

// método que registra prof titular. parâmetros: nome, sobrenome, codigo, especialidade.
// o tempo de casa inicial é zero. o método deve criar o prof titular e adicionar a lista de profs.

   public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){

   }

// método que exclui prof. parâmetro: codigo. o método procura o cod na lista e exclui prof
   public void excluirProfessor(Integer codigoProfessor){

   }


// método que registra um aluno. parâmetros: nome, sobrenome, cod aluno. cria aluno e adiciona a lista
    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){

    }


//método que matricula aluno em um curso. parâmetros: cod aluno, cod curso
    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){

    }

//método que aloca profs a um curso. parametros: cod curso, cod prof titular, cod prof adjunto
    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

    }


//getter e setter


    public List<Curso> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Curso> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }


}

