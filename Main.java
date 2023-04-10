import java.util.Scanner;

public class Main {
    public static int sueldobruto;

    public static void main(String[] args) {

        Scanner inbase = new Scanner(System.in);

        System.out.println("¿Cuál es tu sueldo bruto?");
        if (inbase.hasNextInt()) {
            sueldobruto = inbase.nextInt();
        } else {
            System.out.println("Formato incorrecto, favor de ingresar solo numeros");
        }

        Gratificacion gratificacion = new Gratificacion();
        System.out.println("¿Recibe gratificación?");
        String resive_gratificacion = inbase.next();
            if (resive_gratificacion.equals("si")) {
                sueldobruto = (int) (gratificacion.metodo_gratificacion(sueldobruto));
            }
            else if (resive_gratificacion.equals("no")) {
                sueldobruto = sueldobruto;
            }
            else {
                System.out.println("Respuesta invalida, por favor reponder con ´si´ o ´no´");
            }


        AFP afp = new AFP(sueldobruto);
        double descuentoafp = afp.operacion();

        Isaprefonasa eleccionfonasaoisapre = new Isaprefonasa(sueldobruto);
        double descuentosalud = eleccionfonasaoisapre.operacion();

        int sueldoliquido = (int) (sueldobruto - descuentoafp - descuentosalud);
        //le falta gratificacion
        System.out.println("Su sueldo líquido es: " + sueldoliquido);
    }
}
