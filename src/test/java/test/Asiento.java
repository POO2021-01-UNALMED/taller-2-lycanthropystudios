package test;
/*
* El método de instancia cambiarColor(), recibirá un argumento String que será el
valor a asignar al atributo color del objeto, tenga en cuenta que los únicos
valores permitidos para cambiar el color serán rojo, verde, amarillo, negro y
blanco, cualquier otro color no cambiara el color del Asiento.
* */
public class Asiento {
    public String color;
    public int precio;
    public int registro;

    public void cambiarColor (String colorN){
        switch (colorN){
            case"rojo":
            case"verde":
            case"amarillo":
            case"negro":
            case"blanco": {
                this.color = colorN;
                break;
            }
        }

    }

}
