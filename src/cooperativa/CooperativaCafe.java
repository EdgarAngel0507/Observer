/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cooperativa;

/**
 *
 * @author Estudiantes
 */

import Interface.Subject;
import Interface.Observer;
import java.util.ArrayList;
import java.util.List;

public class CooperativaCafe implements Subject {

    private List<Observer> baristas;

    public CooperativaCafe() {
        baristas = new ArrayList<>();
    }

    @Override
    public void suscribir(Observer o) {
        baristas.add(o);
        System.out.println("Barista suscrito correctamente.");
    }

    @Override
    public void eliminarSuscripcion(Observer o) {
        baristas.remove(o);
        System.out.println("Barista eliminado de la suscripción.");
    }

    @Override
    public void notificar(LoteCafe lote) {
        for (Observer o : baristas) {
            o.actualizar(lote);
        }
    }

    public void registrarNuevoLote(LoteCafe lote) {
        System.out.println("\nRegistrando nuevo lote...\n");
        notificar(lote);
    }
}
