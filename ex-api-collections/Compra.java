import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Compra {

    public static void main(String[] args) {
        // Criar coleção para representar itens de compras
        List<String> compras = new ArrayList<>();

        // Adicionar novos itens
        compras.add("Alface");
        compras.add("Banana");
        compras.add("Cenoura");
        compras.add("Cenoura");
        compras.add("Damasco");
        compras.add("Damasco");
        compras.add("Damasco");
        compras.add("Damasco");

        // Contar o total de itens
        System.out.println(compras.size());

        // Remover duplicatas
        Set<String> comprasSet = new LinkedHashSet<>();
        for (String compra : compras) {
            comprasSet.add(compra);
        }

        compras = comprasSet.stream().toList();
        compras = compras.stream()
                .distinct()
                .toList(); // Verificar outros métodos do stream(); distinct() remove duplicatas; toList() transforma de volta em uma lista


        System.out.println(compras.size());
    }

}