import java.util.Scanner;

/**
 * En esta clase se calcula la gratificacion con base en el sueldo base
 * @author Demis
 * @author
 * @version 1.0
 */
public class Gratificacion {
    private int sueldobase;
    private double gratificacion;

    public Gratificacion(int sueldobase) {
        this.sueldobase = sueldobase;
    }

    /**
     * Este metodo calcula la gratificacion y la suma al sueldo base
     *
     * @return la suma antes mencionada que es igual al sueldo bruto
     */
    public double metodo_gratificacion() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("¿Recibe gratificación?");
            String recibe_gratificacion = scanner.next();

            if (recibe_gratificacion.equalsIgnoreCase("si")) {

                if (this.sueldobase > 649168) {
                    gratificacion = 162292;
                    break;
                } else {
                    gratificacion = this.sueldobase * 0.25;
                    break;
                }

            } else if (recibe_gratificacion.equalsIgnoreCase("no")) {
                gratificacion = 0;
                break;
            } else {
                System.out.println("Formato incorrecto, favor de ingresar un 'si' o un 'no'");
            }
        }
        return sueldobase + gratificacion;
    }
}

