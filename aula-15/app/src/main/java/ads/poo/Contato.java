package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String r, String n) {

        return telefones.add(new Telefone(r,n));
    }

    public boolean addEmail(String r, String e) {

        if (Email.setValor())

    }



}
