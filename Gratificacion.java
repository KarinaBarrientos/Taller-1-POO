import java.util.Scanner;

public class Gratificacion {
    int sueldobruto;
    int gratificacion = 0;

    Gratificacion(int sueldobruto) {
        this.sueldobruto = sueldobruto;
    }

    public double metodo_gratificacion() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("¿Recibe gratificación?");
            String recibe_gratificacion = scanner.next();

            if (recibe_gratificacion.equalsIgnoreCase("si")) {

                if (this.sueldobruto > 649168) {
                    gratificacion = this.sueldobruto + 162292;
                }
                else {
                    gratificacion = (int) (this.sueldobruto * 0.25);
                }
                break;
            }
            else if (recibe_gratificacion.equalsIgnoreCase("no")) {
                gratificacion = 0;
                break;
            }
            else {
                System.out.println("Respuesta invalida, por favor reponder con ´si´ o ´no´");
            }
        }
        return gratificacion;
    }
}

