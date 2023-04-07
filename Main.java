import java.util.Scanner;

public class Main {
    public static int sueldobase;

    public static void main(String[] args) {

        Scanner inbase = new Scanner(System.in);

        System.out.println("¿Cuál es tu sueldo base?");
        sueldobase = inbase.nextInt();

        AFP afp = new AFP(sueldobase);
        afp.operacion();

        Isaprefonasa eleccionfonasaoisapre = new Isaprefonasa(sueldobase);
        eleccionfonasaoisapre.operacion();
    }
}
