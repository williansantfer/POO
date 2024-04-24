package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class AppLivraria {

    public static void main(String[] args) {

        ArrayList<Autor> bancoAutores = new ArrayList<>();

        Autor king = new Autor("Stephen King", "Estados Unidos");

        Autor alguem = new Autor("Alguém", "Grã-Bretanha");

        bancoAutores.add(king);

        bancoAutores.add(alguem);

        HashMap<String, Livro> bancoDeLivros = new HashMap<>();

        Livro oIluminado = new Livro("O Iluminado", 72.90, bancoAutores, "123", bancoAutores);

        bancoDeLivros.put(oIluminado.getIsbn(), oIluminado);

        Livro l = bancoDeLivros.get("123");
        if (l != null) {
            Autor outro = new Autor("Outro", "BR");
            l.addAutor(outro);
        }




    }

}
