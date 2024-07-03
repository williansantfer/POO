package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarefa {
    private String titulo;
    private LocalDate prazoEntrega;
    private LocalDate dataConclusao;
    private ArrayList<Pessoa> pessoas;
    private Categoria categoria;


    public Tarefa(String titulo, LocalDate prazoEntrega, LocalDate dataConclusao, ArrayList<Pessoa> pessoas, Categoria categoria) {
        this.titulo = titulo;
        this.prazoEntrega = prazoEntrega;
        this.dataConclusao = dataConclusao;
        this.pessoas = pessoas;
        this.categoria = categoria;
    }

    public Tarefa() {

    }

    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void retirarPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public void addCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(LocalDate prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}