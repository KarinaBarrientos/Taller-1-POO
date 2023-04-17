import java.util.Scanner;

/**
 * En esta clase se calcula el sueldo liquido a partir del sueldo base
 *
 * @author Demis
 * @author Karina
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        String repeticion = "si";
        while (repeticion.equalsIgnoreCase("si")) {

            int sueldobase = 0;
            Scanner inbase = new Scanner(System.in);
            while (true) {
                System.out.println("¿Cuál es su sueldo base?");
                String sueldobasein = inbase.nextLine();
                if (sueldobasein.contains("-")) {
                    System.out.println("Formato incorrecto, favor de ingresar solo numeros");
                } else
                    try {
                        sueldobasein = sueldobasein.replaceAll("[.,]", "");
                        sueldobase = Integer.parseInt(sueldobasein);
                        break;
                    } catch (NumberFormatException a) {
                        System.out.println("Formato incorrecto, favor de ingresar solo numeros");
                    }
            }

            Gratificacion grat = new Gratificacion(sueldobase);
            double sueldobruto = grat.metodo_gratificacion();

            AFP afp = new AFP(sueldobruto);
            double descuentoafp = afp.operacion();

            Salud salud = new Salud(sueldobruto);
            double descuentosalud = salud.operacion();

            double descuentocesantia = sueldobruto * 0.006;

            int sueldoliquido = (int) (sueldobruto - (descuentocesantia + descuentoafp + descuentosalud));

            System.out.println("Tu sueldo líquido es: " + sueldoliquido);

            System.out.println("¿Desea hacer otro cálculo?");
            repeticion = inbase.next();
        }
    }
}