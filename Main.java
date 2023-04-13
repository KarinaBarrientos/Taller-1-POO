import java.util.Scanner;

public class Main {
    public static int sueldobruto;

    public static void main(String[] args) {

        Scanner inbruto = new Scanner(System.in);

        System.out.println("¿Cuál es tu sueldo bruto?");
        if (inbruto.hasNextInt()) {
            sueldobruto = inbruto.nextInt();
        }
        else {
            System.out.println("Formato incorrecto, favor de ingresar solo numeros");
        }

        Gratificacion gratificacion = new Gratificacion(sueldobruto);
        sueldobruto = gratificacion.metodo_gratificacion();

        AFP afp = new AFP(sueldobruto);
        double descuentoafp = afp.operacion();

        Isaprefonasa eleccionfonasaoisapre = new Isaprefonasa(sueldobruto);
        double descuentosalud = eleccionfonasaoisapre.operacion();

        int sueldoliquido = (int) (sueldobruto - sueldobruto * 0.006 - descuentoafp - descuentosalud);

        System.out.println("El sueldo líquido es: " + sueldoliquido);
    }
}
