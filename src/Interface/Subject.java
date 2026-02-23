/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Interface.Observer;
import cooperativa.LoteCafe;

/**
 *
 * @author Estudiantes
 */

public interface Subject {
    void suscribir(Observer o);
    void eliminarSuscripcion(Observer o);
    void notificar(LoteCafe lote);
}
