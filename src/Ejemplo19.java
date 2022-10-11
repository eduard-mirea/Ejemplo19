import java.util.Scanner;
public class Ejemplo19 {
    public static void main(String[] args) {

        float precio;
        float descuento;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        precio = inputValue.nextFloat();

        inputValue.close();

        if (precio <= 6){
            descuento = 0;
        }else if ((precio >= 6) || (precio < 60) ){
            descuento = precio * 0.05f;
        }else{
            descuento = precio * 0.10f;
        }

        System.out.println("El precio final: " + (descuento - precio) + " € ");
    }
}