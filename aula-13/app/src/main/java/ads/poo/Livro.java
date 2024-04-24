package ads.poo;

import java.util.ArrayList;

public class Livro {

    private String titulo;
    private double preco;
    private ArrayList<Autor> autores;
    private String isbn;

    public Livro(String titulo, double preco, ArrayList<Autor> autores, String isbn, ArrayList<Autor> bancoAutores) {
        this.titulo = titulo;
        this.preco = preco;
        this.autores = autores;
        this.isbn = isbn;
    }

    public boolean addAutor(Autor a) {
        return this.autores.add(a);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Autor autor : this.autores) {
            sb.append(autor);
        }

        return String.format("ISBN: %s; Título: %s, preco: %d, autores:\n%s", isbn, titulo, preco, sb);
    }
}
