package exercises.un4.exer1;

public enum MOTOR {
    GASOLINA(1),
    FLEX(2),
    GAS(3),
    DIESEL(4);
    
    private int id;
    private String tipoMotor;
    
    private MOTOR(int id) {
        this.id = id;
        this.tipoMotor = setDescricao(id);
    }
    
    public static MOTOR setMotor(int id) {
        // force user to give valid entry
        MOTOR aux = null;
        switch(id) {
            case 1:
                aux = MOTOR.GASOLINA;
            case 2:
                aux = MOTOR.FLEX;
            case 3:
                aux = MOTOR.GAS;
            case 4:
                aux = MOTOR.DIESEL;
        }
        
        return aux;
    }
    
    private String setDescricao(int id) {
        // force user to give valid entry
        String aux = "";
        switch(id) {
            case 1:
                aux = "Motor a Gasolina";
            case 2:
                aux = "Motor Flex";
            case 3:
                aux = "Motor a Gás";
            case 4:
                aux = "Motor a Diesel";
        }
        
        return aux;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }
    
    @Override
    public String toString() {
        return this.tipoMotor;
    }
}
