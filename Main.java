import java.util.Scanner;

public class Main {
    public static int sueldobruto;

    public static void main(String[] args) {

        Scanner inbase = new Scanner(System.in);

        System.out.println("¿Cuál es tu sueldo base?");
        if (inbase.hasNextInt()) {
            sueldobruto = inbase.nextInt();
        } else {
            System.out.println("Formato incorrecto, favor de ingresar solo numeros");
        }

        AFP afp = new AFP(sueldobruto);
        double descuentoafp = afp.operacion();

        Isaprefonasa eleccionfonasaoisapre = new Isaprefonasa(sueldobruto);
        double descuentosalud = eleccionfonasaoisapre.operacion();

        int sueldoliquido = (int) (sueldobruto - descuentoafp - descuentosalud);
        //le falta gratificacion
        System.out.println(sueldoliquido);
    }
}
