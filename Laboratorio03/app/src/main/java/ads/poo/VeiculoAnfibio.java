package ads.poo;

public interface VeiculoAnfibio extends VeiculoMarinho {

    public boolean abrirRecolherRodas();

    @Override
    String esvaziarLastro();
}
