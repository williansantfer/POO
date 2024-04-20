package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class AppLivraria {

    public static void main(String[] args) {

        ArrayList<Autor> bancoAutores = new ArrayList<>();

        Autor a = new Autor("Stephen King", "Estados Unidos");

        Autor o = new Autor("Outro", "Canadá");

        bancoAutores.add(a);

        bancoAutores.add(o);

        Livro l = new Livro("O Iluminado", 72.90, bancoAutores, "123" );

        Livro l2 = new Livro("It: A Coisa", 65.90, bancoAutores, "321");


        HashMap<String, Livro> bancoDeLivros;


    }

}
