package exercises.un4.exer1;

public class AutoBasico extends Automovel {
    private boolean retrovisorPassageiro,
            limpadorTraseiro,
            radioAMFM;
    private double valor;

    public AutoBasico(boolean retrovisorPassageiro, boolean limpadorTraseiro, boolean radioAMFM, int idMotor, String modelo, String cor) {
        super(idMotor, modelo, cor);
        this.retrovisorPassageiro = retrovisorPassageiro;
        this.limpadorTraseiro = limpadorTraseiro;
        this.radioAMFM = radioAMFM;
        this.valor = setValor();
    }

    public boolean isRetrovisorPassageiro() {
        return retrovisorPassageiro;
    }
    public void setRetrovisorPassageiro(boolean retrovisorPassageiro) {
        this.retrovisorPassageiro = retrovisorPassageiro;
    }

    public boolean isLimpadorTraseiro() {
        return limpadorTraseiro;
    }
    public void setLimpadorTraseiro(boolean limpadorTraseiro) {
        this.limpadorTraseiro = limpadorTraseiro;
    }

    public boolean isRadioAMFM() {
        return radioAMFM;
    }
    public void setRadioAMFM(boolean radioAMFM) {
        this.radioAMFM = radioAMFM;
    }

    public double getValor() {
        return valor;
    }
    private double setValor() {
        double aux = this.precoBase;
        
        if(this.retrovisorPassageiro) {aux += 1250.0;}
        if(this.limpadorTraseiro) {aux += 2500.0;}
        if(this.radioAMFM) {aux += 7500.0;}
        
        return aux;
    }

    @Override
    public String toString() {
        return "AutoBasico{" + "retrovisorPassageiro=" + retrovisorPassageiro + ", limpadorTraseiro=" + limpadorTraseiro + ", radioAMFM=" + radioAMFM + ", valor=" + valor + '}';
    }
}
