package ads.poo;

import java.util.ArrayList;

public class Livro {

    private String titulo;
    private double preco;
    private ArrayList<Autor> autores;
    private String isbn;

    public Livro(String titulo, double preco, ArrayList<Autor> autores, String isbn) {
        this.titulo = titulo;
        this.preco = preco;
        this.autores = autores;
        this.isbn = isbn;
    }

}
