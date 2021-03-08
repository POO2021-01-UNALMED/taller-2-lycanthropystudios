package test;
/*
- El método cambiarRegistro(), recibirá como argumento un int que cambiara el
        numero del registro del objeto
        - El método asignarTipo(), recibirá como argumento un String que cambiara el
        tipo de motor, este valor solo podrá ser cambiado por el valor electrico o
        gasolina, en caso contrario no modificara el valor
 */
public class Motor {
    public int numeroCilindros;
    public String tipo;
    public int registro;
    public void cambiarRegistro(int reg){
        this.registro = reg;
    }
    public void asignarTipo(String tipoN){
        switch (tipoN){
            case"electrico":
            case"gasolina": {
                this.tipo = tipoN;
                break;
            }
        }
    }
}
