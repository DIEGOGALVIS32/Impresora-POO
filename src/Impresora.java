package impresora;

public class Impresora {

    // Atributos
    private int hojas;
    private int impresionesPendientesNegro;
    private int impresionesPendientesColor;
    private Tinta tinta;

    // Constructor
    public Impresora() {
        hojas = 0;
        impresionesPendientesNegro = 0;
        impresionesPendientesColor=0;
        tinta=new Tinta();
    }

    // Métodos GET

    public Tinta getTinta() {
        return tinta;
    }

    public int getHojas() {
        return hojas;
    }

    public int getImpresionesPendientesNegro() {
        return impresionesPendientesNegro;
    }

    public int getImpresionesPendientesColor() {
        return impresionesPendientesColor;
    }

    // Métodos SET

    public void setTinta(Tinta tinta) {
        this.tinta = tinta;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    public void setImpresionesPendientes(int impresionesPendientesNegro) {
        this.impresionesPendientesNegro = impresionesPendientesNegro;
    }

    public void setImpresionesPendientesColor(int impresionesPendientesColor) {
        this.impresionesPendientesColor = impresionesPendientesColor;
    }

    // Métodos Analizadores
    public void recargarHojas(int hojasACargar){
        this.hojas += hojasACargar;

        imprimirNegro();
        imprimirColor();
    }


    public void imprimirNegro(){

        while(this.hojas >= 1 && this.impresionesPendientesNegro > 0 && tinta.getTintaNegra()>=10) {
            this.hojas--;
            this.impresionesPendientesNegro--;
            this.tinta.setTintaNegra(tinta.getTintaNegra()-10);

        }
    }

    public void imprimirColor(){

        while(this.hojas >= 1 && this.impresionesPendientesColor > 0 && tinta.getTintaColor()>=10) {
            this.hojas--;
            this.impresionesPendientesColor--;
            this.tinta.setTintaColor(tinta.getTintaColor()-10);
        }
    }
}
