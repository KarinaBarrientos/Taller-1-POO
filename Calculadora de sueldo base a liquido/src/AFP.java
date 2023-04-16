import java.util.Scanner;

/**
 * Esta clase es para calcular el descuento afp
 * contiene las distintas afp existentes
 * @author Demis
 * @author
 * @version 1.0
 */
public class AFP {
    private double Capital;
    private double Cuprum;
    private double Habitat;
    private double Modelo;
    private double Plan_vital;
    private double Provida;
    private double Uno;
    private double afpfijo;
    private double descuentoafp;

    /**
     * Esto es un contructor que recibe el sueldo bruto y define el descuento de cada afp
     *
     * @param sueldobruto es el sueldo base mas la gratificacion
     */
    public AFP(double sueldobruto) {
        this.descuentoafp = descuentoafp;
        this.afpfijo = sueldobruto * 0.1;
        this.Capital = sueldobruto * 0.0144 + this.afpfijo;
        this.Cuprum = sueldobruto * 0.0144 + this.afpfijo;
        this.Habitat = sueldobruto * 0.0127 + this.afpfijo;
        this.Modelo = sueldobruto * 0.0058 + this.afpfijo;
        this.Plan_vital = sueldobruto * 0.0116 + this.afpfijo;
        this.Provida = sueldobruto * 0.0145 + this.afpfijo;
        this.Uno = sueldobruto * 0.0069 + this.afpfijo;
    }

    /**
     * metodo hecho para calcular el descuento correspondiente en base a el afp
     *
     * @return devuelve el descuento segun el afp escogido
     */
    public double operacion() {
        while (true) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("A continuacion ingrese su tipo de Afp");
            System.out.print("Afp ");

            String afptipoin = teclado.nextLine();
            String afptipo = afptipoin.replace(" ", "");
            if (afptipo.equalsIgnoreCase("Capital")) {
                descuentoafp = this.Capital;
                break;
            } else if (afptipo.equalsIgnoreCase("Cuprum")) {
                descuentoafp = this.Cuprum;
                break;
            } else if (afptipo.equalsIgnoreCase("Habitat")) {
                descuentoafp = this.Habitat;
                break;
            } else if (afptipo.equalsIgnoreCase("Modelo")) {
                descuentoafp = this.Modelo;
                break;
            } else if (afptipo.equalsIgnoreCase("planvital")) {
                descuentoafp = this.Plan_vital;
                break;
            } else if (afptipo.equalsIgnoreCase("Provida")) {
                descuentoafp = this.Provida;
                break;
            } else if (afptipo.equalsIgnoreCase("Uno")) {
                descuentoafp = this.Uno;
                break;
            } else if (afptipo.equalsIgnoreCase("Nocotiza")) {
                descuentoafp = 0;
                break;
            } else
                System.out.println("Formato incorrecto, favor de ingresar unicamente el tipo de AFP,o en su defecto: No cotiza" );
        }
        return descuentoafp;
    }
}
