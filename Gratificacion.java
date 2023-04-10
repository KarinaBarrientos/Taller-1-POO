import java.util.Scanner;

public class Gratificacion {
    public int metodo_gratificacion (int sueldobruto) {

        if (sueldobruto > 649168) {
            sueldobruto = sueldobruto + 162292;
        }
        else {
            sueldobruto = (int) (sueldobruto + sueldobruto * 0.25);
        }
        return sueldobruto;
    }

}

