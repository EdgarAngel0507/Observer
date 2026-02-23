/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cooperativa;

/**
 *
 * @author Estudiantes
 */

public class LoteCafe {

    private String varietal;
    private String notasCata;
    private String origen;
    private double alturaCultivo;
    private String productor;
    private double cantidadLibras;

    public LoteCafe(String varietal, String notasCata, String origen,
                    double alturaCultivo, String productor, double cantidadLibras) {
        this.varietal = varietal;
        this.notasCata = notasCata;
        this.origen = origen;
        this.alturaCultivo = alturaCultivo;
        this.productor = productor;
        this.cantidadLibras = cantidadLibras;
    }

    @Override
    public String toString() {
        return "Nuevo Microlote Disponible:\n" +
                "Varietal: " + varietal + "\n" +
                "Notas de Cata: " + notasCata + "\n" +
                "Origen: " + origen + "\n" +
                "Altura: " + alturaCultivo + " msnm\n" +
                "Productor: " + productor + "\n" +
                "Cantidad disponible: " + cantidadLibras + " libras\n";
    }
}
