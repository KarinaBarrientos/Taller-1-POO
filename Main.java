import java.util.Scanner;

public class Main {
    public static int sueldobruto;

    public static void main(String[] args) {

        Scanner inbase = new Scanner(System.in);

        System.out.println("¿Cuál es tu sueldo base?");
        sueldobruto = inbase.nextInt();

        AFP afp = new AFP(sueldobruto);
        double descuentoafp = afp.operacion();
        //System.out.println(descuentoafp);
        Isaprefonasa eleccionfonasaoisapre = new Isaprefonasa(sueldobruto);
        double descuentosalud = eleccionfonasaoisapre.operacion();
        //System.out.println(descuentosalud);

        int sueldoliquido = (int) (sueldobruto - descuentoafp - descuentosalud );
        //le falta gratificacion
        System.out.println(sueldoliquido);
    }
}
