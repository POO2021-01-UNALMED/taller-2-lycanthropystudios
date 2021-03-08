package test;
public class Auto {
    public String modelo;
    public int precio;
    public Asiento asientos[];
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public int cantidadAsientos(){
        int cant = 0;
        for (Asiento asiento:asientos) {
            if (asiento != null){cant++;}
        }
        return cant;
    }
    public String verificarIntegridad(){
        int reg = this.registro;
        for (Asiento asiento:asientos) {
            if(asiento != null) {
                if (reg == asiento.registro && reg == this.motor.registro) {
                    continue;
                } else {
                    return "Las piezas no son originales";
                }
            }
        }
        return "Auto original";
    }
}
