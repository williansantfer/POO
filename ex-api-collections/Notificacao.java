import java.util.*;

public class Notificacao {

    public static void main(String[] args) {

        Queue<String> notificacoes = new LinkedList<>();


        // Adicionar uma nova mensagem de notificação

        notificacoes.add("Alarme da manhã");
        notificacoes.add("Alarme da tarde");
        notificacoes.add("Alarme da noite");

        //System.out.println(notificacoes.remove());

        // Verificar se a fila está vazia
        if (notificacoes.isEmpty()) {                   // Neste caso, isEmpty() é a melhor opção para usar
            System.out.println("A lista está vazia");
        }

        System.out.println(notificacoes.size());




    }

}
