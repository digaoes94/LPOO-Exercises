package exercises.un4.exer1;

public class AutoLuxo extends AutoBasico {
    private static final int NUMERO_MAXIMO_PRESTACOES = 36;
    private boolean direcaoHidraulica, cambioAutomatico, vidroTravaEletrica;

    public AutoLuxo(boolean direcaoHidraulica, boolean cambioAutomatico, boolean vidroTravaEletrica, boolean retrovisorPassageiro, boolean limpadorTraseiro, boolean radioAMFM, int idMotor, String modelo, String cor, double valor) {
        super(retrovisorPassageiro, limpadorTraseiro, radioAMFM, idMotor, modelo, cor);
        this.direcaoHidraulica = direcaoHidraulica;
        this.cambioAutomatico = cambioAutomatico;
        this.vidroTravaEletrica = vidroTravaEletrica;
        this.valor = setValor();
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }
    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }
    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public boolean isVidroTravaEletrica() {
        return vidroTravaEletrica;
    }
    public void setVidroTravaEletrica(boolean vidroTravaEletrica) {
        this.vidroTravaEletrica = vidroTravaEletrica;
    }
    
    private double setValor() {
        double aux = this.precoBase;
        
        if(this.direcaoHidraulica) {aux += 5000.0;}
        if(this.cambioAutomatico) {aux += 8000.0;}
        if(this.vidroTravaEletrica) {aux += 3500.0;}
        
        return aux;
    }
}