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
        return emails.add(new Email(r,e));

    }

    public boolean removeTelefone(String r) {
        return telefones.remove(r);
    }

    public boolean removeEmail(String r) {
        return emails.remove(r);
    }

    public boolean updateTelefone(String r, String n) {

    }

    public boolean updateEmail(String r, String e) {
         this.emails.set()
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNasc=" + dataNasc +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
}
