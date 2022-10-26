package app;

public class Calculo {
    private int base;
    private int largura;
    private int comprimento;

    public Calculo() {
    }

    public int calculaVolume(){
        return this.base * this.largura * this.comprimento;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
}
