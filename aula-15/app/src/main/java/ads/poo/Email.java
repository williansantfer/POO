package ads.poo;

public class Email {

    private String rotulo;
    private String valor;

    public Email(String r, String v) {
        this.rotulo = r;
        this.valor = "";
        this.setValor(v);
    }

    private boolean validaEmail(String v) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w+])*(\\.[a-z]{2,})$";
        return  v.matches(eR);
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getValor() {
        return valor;
    }

    public boolean setValor(String valor) {
        if (this.validaEmail(valor)){
            this.valor = valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Email{" + "rotulo = " + rotulo + ", valor=" + valor + "}";
    }
}
