package ads.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c) {
        return contatos.add(c);
    }

    public boolean removeContato(String n, String s) {
        return contatos.remove(s);
    }

    public boolean addTelefone(String r, String n, Contato c) {
        return addTelefone(r,n,c);
    }

    public boolean addEmail(String r, String e, Contato c) {
        return addEmail(r,e,c);
    }

    public boolean updateTelefone(String r, String n, Contato c) {
        return
    }

    public boolean updateEmail(String r, String e, Contato c) {
        return
    }

    public boolean removeTelefone(String r, Contato c) {
        return
    }

    public boolean removeEmail(String r, String c) {
        return
    }

    @Override
    public String toString() {
        return "Agenda{" + "contatos=" + contatos + "}";
    }
}
