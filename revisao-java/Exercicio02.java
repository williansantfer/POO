public class Exercicio02 {

    public static void main(String[] args) {
        
        if (args.length != 3) {
            System.out.println("Inválido. É preciso informar as notas dos dois projetos práticos e a participação na aula.");
            return;
        }

        double projeto1 = Double.parseDouble(args[0]);
        double projeto2 = Double.parseDouble(args[1]);
        double participacao = Double.parseDouble(args[2]);

        double notaFinal = (((projeto1 * 2 + projeto2 * 3) / 5) * 0.9) + participacao * 0.1;

        System.out.println("RESULTADO");
        System.out.printf("Conceito Final: %.2f", notaFinal);
        System.out.println();

        if (notaFinal >= 6) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("SItuação: REPROVADO");
        }
    }
}