/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.Scanner;

/**
 *
 * @author juand
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        impresora.Impresora impresora;
        impresora = new impresora.Impresora();
        int accion = 0;
        while (accion > -1) {
            System.out.println("Ingrese la accion: \n"
                    + "1.Recargar Hojas*\n"
                    + "2.Imprimir Negro\n"
                    + "3.Imprimir Color\n"
                    + "4.Recargar tinta Negra\n"
                    + "5.Recargar tinta Color");
            accion = input.nextInt();

            switch (accion) {
                case 1:
                    System.out.println("Ingrese la cantidad de hojas: ");
                    impresora.recargarHojas(input.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de hojas a imprimir en Negro: ");
                    int totalHojasPendientes = input.nextInt() + impresora.getImpresionesPendientesNegro();

                    impresora.setImpresionesPendientes(totalHojasPendientes);
                    impresora.imprimirNegro();
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de hojas a imprimir en Color: ");
                    int totalHojasPendientes2 = input.nextInt() + impresora.getImpresionesPendientesColor();

                    impresora.setImpresionesPendientesColor(totalHojasPendientes2);
                    impresora.imprimirColor();
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de tinta NEGRA: ");
                    int totalTinta = input.nextInt() + impresora.getTinta().getTintaNegra();

                    impresora.getTinta().setTintaNegra(totalTinta);
                    impresora.imprimirNegro();
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de tinta Color: ");
                    int totalTinta2 = input.nextInt() + impresora.getTinta().getTintaColor();

                    impresora.getTinta().setTintaColor(totalTinta2);
                    impresora.imprimirColor();
                    break;
                default:
                    System.out.println("Ingrese una opcion: ");

            }

            System.out.println("\n"
                    +"La impresora tiene: "+impresora.getHojas()+" Hojas\n"
                    +"La impresora tiene: "+impresora.getImpresionesPendientesNegro()+" Impresiones pendientes en negro\n"
                    +"La impresora tiene: "+impresora.getImpresionesPendientesColor()+" Impresiones pendientes en color\n"
                    +"La impresora tiene: "+impresora.getTinta().getTintaColor()+" milimetros de tinta a color\n "
                    +"La impresora tiene: "+impresora.getTinta().getTintaNegra()+" milimetros de tinta negra\n\n ");

        }
    }
}
