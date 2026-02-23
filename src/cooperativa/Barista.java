/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cooperativa;

import Interface.Observer;
/**
 *
 * @author Estudiantes
 */

public class Barista implements Observer {

    private String nombre;
    private String identificacion;

    public Barista(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    @Override
    public void actualizar(LoteCafe lote) {
        System.out.println("Notificación para Barista: " + nombre);
        System.out.println(lote);
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }
}
