/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

public class App {

    public static void main(String[] args) {

        /*

        Carro c = new Carro();

        System.out.println(c.obterVelocidadeAtual());
        c.acelerar(100);
        c.acelerar(50);
        c.acelerar(150);
        System.out.println(c.obterVelocidadeAtual());

        c.frear(300);

        System.out.println(c.obterVelocidadeAtual());

        */

        /*

        Pessoa p = new Pessoa("Bob", "123");

        System.out.println(p.obterNome());
        System.out.println(p.obterCpf());

        System.out.println(p.toString());

        Pessoa pe = new Pessoa("Ana", "321");

        System.out.println(pe.obterNome());
        System.out.println(pe.obterCpf());

        System.out.println(pe.toString());

        */

        /*

        Carro c = new Carro("fusca", 500, 200);

        // carro vai estar a 200

        c.acelerar(-300);

        */

        Estudante e = new Estudante("Bob", 123, "ADS");

        Estudante c = new Estudante("Ana", 321, "Telecomunicações");

        System.out.println("Total de Estudantes = " + Estudante.getTotal());

    }
}
