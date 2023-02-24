package impresoraclase;

import java.util.Scanner;

/**
 *
 * @author miguelropero
 */
public class ImpresoraEstructura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int accion = 0;
        int hojasDisponibles = 0;
        int HojasAImprimir = 0;
        int opTinColor = 0;
        int tintaNegra = 0;
        int tintaColor = 0;

        OUTER:
        while (accion > -1) {
            System.out.print("Ingrese la acción: \n 1. Recargar Hojas \n 2. Imprimir: \n3.Recargar Tinta\n");
            accion = input.nextInt();
            switch (accion) {
                case 1:
                    System.out.print("Ingrese la cantidad de Hojas: \n");
                    hojasDisponibles += input.nextInt();
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de Hojas a imprimir: \n");
                    HojasAImprimir += input.nextInt();
                    break;
                case 3:
                    System.out.println("Que tinta desea recargar: \n1.Color\n2.Negra");
                    opTinColor += input.nextInt();
                    switch (opTinColor) {
                        case 1:
                            System.out.print("Ingrese la cantidad de tinta Negra: \n");
                            tintaNegra += input.nextInt();
                            break;
                        case 2:
                            System.out.print("Ingrese la cantidad de tinta Color: \n");
                            tintaColor += input.nextInt();
                            break;
                    }

                    break;

                default:
                    break OUTER;
            }
            while (hojasDisponibles >= 1 && HojasAImprimir > 0 && tintaNegra>=10 && tintaColor>=10) {
                hojasDisponibles--;
                HojasAImprimir--;
                tintaNegra-=10;
                tintaColor-=10;
            }
            System.out.print("\nLa impresora tiene: " + hojasDisponibles + " Hojas.\n"
                    + "La impresora tiene " + HojasAImprimir + " hojas pendientes por imprimir\n"+"La impresora tiene "+tintaNegra+" milimetros de tinta NEGRA\n"+
                    "La impresora tiene "+tintaColor+" milimetros de tinta a COLOR\n\n");
        }
    }

}
