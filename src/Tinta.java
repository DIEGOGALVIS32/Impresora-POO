/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impresora;

/**
 *
 * @author juand
 */
public class Tinta {

    ///ATRIBUTOS
    private int tintaNegra;
    private int tintaColor;
    /// CONSTRUCTOR

    public Tinta() {
        this.tintaColor = 0;
        this.tintaNegra = 0;
    }

    /////  METODOS GET Y SET
    public int getTintaNegra() {
        return tintaNegra;
    }

    public void setTintaNegra(int tintaNegra) {
        this.tintaNegra = tintaNegra;
    }

    public int getTintaColor() {
        return tintaColor;
    }

    public void setTintaColor(int tintaColor) {
        this.tintaColor = tintaColor;
    }
}
