import java.util.HashSet;
import java.util.Set;

public class Aluno {

    public static void main(String[] args) {
        // Criar uma coleção de nomes de alunos

        Set<String> alunos = new HashSet<>();

        // Adicionar alunos
        alunos.add("Alice");
        alunos.add("Bob");
        alunos.add("Carlos");
        alunos.add("Daniel");

        // Listar todos os nomes em maiúsculo
        alunos.forEach(aluno -> System.out.println(aluno.toUpperCase()));

        // Verificar se tem alguém faltando

        if (!alunos.contains("Elza")) {
            System.out.println("Elza não está presente");
        }

        // Remover todos os alunos que tem nome com 5 letras
        alunos.removeIf(nome -> nome.length() == 5);

        System.out.println(alunos.size());


    }

}
