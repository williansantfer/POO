package ads.poo;

public class Horario {
    
    private int hora;
    private int minuto;
    private int segundo;


    String[] hE = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
                    "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezonove", "vinte", "vinte e um", 
                   "vinte e dois", "vinte e três"};
    String[] mE = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
    "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezonove", "vinte", "trinta", "quarenta", "cinquenta"};


    public Horario() {

    }

    public Horario(int hora, int min, int seg) {
        
        if (hora < 0 || hora > 23 || min < 0 || min > 59 || seg < 0 || seg > 59) {
            hora = 0;
            min = 0;
            seg = 0;
        }

        this.hora = hora;
        this.minuto = min;
        this.segundo = seg;
    }

    public Horario(int hora, int min) {
        this(hora, min, 0);
    }

    public Horario(int hora) {
        this(hora, 0, 0);
    }
    

    @Override
    public String toString() {
        return "Horario [" + this.hora + ":" + this.minuto + ":" + this.segundo + "]";
    }

    public int setHora(int hora) {

        if (hora < 0 || hora > 23) {
            return this.hora;
        }
        
        return this.hora = hora;
    }

    public int setMinuto(int minuto) {

        if (minuto < 0 || minuto > 59) {
            return this.minuto;
        }

        return this.minuto = minuto;
    }

    public int setSegundo(int segundo) {

        if (segundo < 0 || segundo > 59) {
            return this.segundo;
        }

        return this.segundo = segundo;
    }

    public long horarioParaSegundos() {

        int minutos = this.hora * 60 + this.minuto;

        int segundos = minutos * 60 + this.segundo;

        return segundos;
    }

    /*public String imprimirPorExtenso() {

        //int num = 31;
        // int d = num/10;
        // int u = num%10;

        int d;

        if (d > 2 && d < 3) {
            
        }

       return hE[this.hora] + " horas, " + ?????? + " minutos e " + ????? + " segundos.";

    }*/

}