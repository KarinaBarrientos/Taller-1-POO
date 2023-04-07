import java.util.Scanner;

/**
 * Esta clase es para calcular el descuento afp
 * contiene las distintas afp existentes
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
    private int sueldobase;
    private double descuentoafp;

    /**
     * Esto es un contructor que recibe el sueldo bruto y define el descuento de cada afp
     *
     * @param sueldobase es el sueldo bruto ingresado
     */

    public AFP(int sueldobase) {
        this.descuentoafp = descuentoafp;
        //se irá
        this.sueldobase = sueldobase;
        this.afpfijo = sueldobase * 0.1;
        this.Capital = sueldobase * 0.0144 + this.afpfijo;
        this.Cuprum = sueldobase * 0.0144 + this.afpfijo;
        this.Habitat = sueldobase * 0.0127 + this.afpfijo;
        this.Modelo = sueldobase * 0.0058 + this.afpfijo;
        this.Plan_vital = sueldobase * 0.0116 + this.afpfijo;
        this.Provida = sueldobase * 0.0145 + this.afpfijo;
        this.Uno = sueldobase * 0.0069 + this.afpfijo;
    }

    /**
     * metodo hecho para calcular el descuento correspondiente en base a el afp
     */
    public void operacion() {
        while (true) {
            //metodo constructor con la suma descuentoafp
            Scanner teclado = new Scanner(System.in);
            System.out.println("A continuacion ingrese su tipo de AFP");
            String afptipo = teclado.next();
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
            } else
                System.out.println("Formato incorrecto, favor de ingresar unicamente el tipo de AFP");
        }
    }
}
