/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cooperativa;

/**
 *
 * @author Estudiantes
 */

public class Test {

    public static void main(String[] args) {

        CooperativaCafe cooperativa = new CooperativaCafe();

        // Crear baristas
        Barista b1 = new Barista("Laura Gómez", "1010");
        Barista b2 = new Barista("Carlos Pérez", "2020");

        // Suscribir baristas
        cooperativa.suscribir(b1);
        cooperativa.suscribir(b2);

        // Crear nuevo lote
        LoteCafe lote1 = new LoteCafe(
                "Bourbón Rosado",
                "Frutos rojos, mora, cereza, caramelo, acidez media alta, residual a cacao",
                "Acevedo, Huila",
                1250,
                "Don José Ramírez",
                45
        );

        cooperativa.registrarNuevoLote(lote1);

        // Eliminar suscripción
        cooperativa.eliminarSuscripcion(b2);

        // Nuevo lote
        LoteCafe lote2 = new LoteCafe(
                "Geisha",
                "Florales, jazmín, durazno, miel",
                "Génova, Quindío",
                1800,
                "Finca El Paraíso",
                30
        );

        cooperativa.registrarNuevoLote(lote2);
    }
}
