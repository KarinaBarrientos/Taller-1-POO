import java.util.Scanner;

/**
 * Esta clase calcula el descuento dependiendo si es fonasa o isapre
 */
public class Isaprefonasa {
    private double fonasa;
    private double isapreenUF;
    private double UFaCLP;
    private double descuentosalud;

    /**
     * contructor que recibe el sueldo bruto y define el descuento segun isapre o fonasa
     *
     * @param sueldobase es el sueldo bruto ingresado
     */
    public Isaprefonasa(int sueldobase) {
        this.fonasa = sueldobase * 0.07;
        this.isapreenUF = isapreenUF;
        this.descuentosalud = descuentosalud;
        this.UFaCLP = 35568.59;
    }

    /**
     * Metodo que calcula el descuento al sueldobase de salud
     */
    public void operacion() {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("En que servicio se encuentra; ¿Fonasa o Isapre?");
            String salud = teclado.nextLine();
            if (salud.equalsIgnoreCase("Fonasa")) {
                if (this.fonasa == this.UFaCLP * 5.614) {
                    descuentosalud = this.UFaCLP * 5.614;
                } else {
                    descuentosalud = this.fonasa;
                }
                break;
            } else if (salud.equalsIgnoreCase("Isapre")) {
                while (true) {
                    System.out.println("indique la cantidad de UF ");
                    if (teclado.hasNextInt()) {
                        double UF = teclado.nextDouble();
                        descuentosalud = UF * this.UFaCLP;
                        break;
                    } else
                        System.out.println("Formato incorrecto, favor de ingresar unicamente numeros");
                    teclado.next();
                }
                break;
            } else
                System.out.println("Formato incorrecto, favor de ingresar una de las opciones");
        }
    }
}
