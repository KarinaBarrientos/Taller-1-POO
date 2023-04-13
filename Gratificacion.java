import java.util.Scanner;

public class Gratificacion {
    int sueldobruto;

    Gratificacion(int sueldobruto) {
        this.sueldobruto = sueldobruto;
    }

    public int metodo_gratificacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Recibe gratificación?");
        String resive_gratificacion = scanner.next();
        if (resive_gratificacion.equals("si")) {
            if (this.sueldobruto > 649168) {
                this.sueldobruto = this.sueldobruto + 162292;
            } else {
                this.sueldobruto = (int) (this.sueldobruto + this.sueldobruto * 0.25);
            }
        } else if (resive_gratificacion.equals("no")) {

        } else {
            System.out.println("Respuesta invalida, por favor reponder con ´si´ o ´no´");
        }
        return this.sueldobruto;

    }
}

