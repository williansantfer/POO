package ads.poo;

public class Horario {
    
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {

    }

    public Horario(int hora, int min, int seg) {
        verificacao(hora, min, seg);
        this.hora = hora;
        this.minuto = min;
        this.segundo = seg;
    }

    public Horario(int hora, int min) {
        this(hora, min, 00);
    }

    public Horario(int hora) {
        this(hora, 00, 00);
    }

    public String verificacao(int hora, int min, int seg) {
        
        if (hora < 00 || hora > 23 || min < 00 || min > 59 || seg < 00 || seg > 59) {
            System.out.println("Valores inválidos");
        }

        return "Argumentos válidos";
    }

    public int setHora(int hora) {
        return this.hora = hora;
    }

    public int setMinuto(int minuto) {
        return this.minuto = minuto;
    }

    public int setSegundo(int segundo) {
        return this.segundo = segundo;
    }

}