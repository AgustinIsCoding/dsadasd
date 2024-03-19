/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DataStructures.Tree;

/**
 *
 * @author user
 */
public class Checkin {
    private HashTable huespedes;
    private Tree habitacion;
    private Tree reservacion;
    
    public Checkin(HashTable huespedes,Tree habitacion, Tree reservacion){
        this.huespedes = huespedes;
        this.habitacion = habitacion;
        this.reservacion = reservacion;
    }
    
    
//    public void checkin(int id){
//        Reservation reserva = reservacion.buscar(id);
//        if(reserva != null){
//            Room hab = habitacion.buscarVacia(reserva.getTypeOfRoom());
//            huespedes.insertar(reserva.getId(), reserva.getClientFirstName(), reserva.getClientLastName(),reserva.getClientEmail(),reserva.getClientGender(),reserva.getClientPhone(),reserva.getDateOfArrival(),hab.getNumber());
//        }
//        
//    }
}
