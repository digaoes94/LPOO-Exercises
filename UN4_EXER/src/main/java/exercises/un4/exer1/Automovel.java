package exercises.un4.exer1;

public class Automovel {
    public static final int NUM_MAX_PRESTACOES = 24;
    private MOTOR motor;
    private String modelo, cor, combustivel;
    protected Double precoBase;

    public Automovel(int idMotor, String modelo, String cor) {
        this.motor = MOTOR.setMotor(idMotor);
        this.modelo = modelo;
        this.cor = cor;
        this.precoBase = setPrecoBase(idMotor);
    }

    private Double setPrecoBase(int idMotor) {
        Double aux = 0.0;
        switch(idMotor) {
            case 1:
                aux = 70000.0;
            case 2:
                aux = 80000.0;
            case 3:
                aux = 90000.0;
            case 4:
                aux = 95000.0;
        }
        
        return aux;
    }

    public static int getNUM_MAX_PRESTACOES() {
        return NUM_MAX_PRESTACOES;
    }

    public MOTOR getMotor() {
        return motor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setMotor(MOTOR motor) {
        this.motor = motor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    @Override
    public String toString() {
        return String.format(("Modelo: %s. Cor: %s. "), this.modelo, this.cor)
                + this.motor.toString();
    }
}