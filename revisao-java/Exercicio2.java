public class Exercicio2 {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Inválido. É necessário informar as notas dos dois projetos práticos e a de participação na aula.");
        }

        double projeto1 = Double.parseDouble(args[0]);
        double projeto2 = Double.parseDouble(args[1]);
        double participacao = Double.parseDouble(args[2]);

        double conceitoFinal = Math.round((((projeto1 * 2 + projeto2 * 3) / 5) * 0.9) + participacao * 0.1);

        System.out.println("Conceito Final: " + conceitoFinal);

        if (conceitoFinal >= 6) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }
}
