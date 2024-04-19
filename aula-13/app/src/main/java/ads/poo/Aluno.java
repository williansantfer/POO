package ads.poo;

import java.time.LocalDate;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;

    public Aluno(String matricula, String nome, String curso, String telefone, String email, LocalDate dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String setMatricula(String matricula) {
        return this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String setCurso(String curso) {
        return this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public String setTelefone(String telefone) {
        return this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate setDataNascimento(LocalDate dataNascimento) {
        return this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", telefone=" + telefone + ", email=" + email + ", dataNascimento=" + dataNascimento + "]";
    }

}