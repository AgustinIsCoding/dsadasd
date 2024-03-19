/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author user
 */
public class Lista {
    Client primero;
    int tamaño;
    public Lista(){
        primero= null;
        tamaño = 0;
    }
    public void insertar(int id, String firstName, String LastName, String email, String gender, String phoneNumber, Date arrival, int room){
        Client client = new Client (id, firstName, LastName, email, gender, phoneNumber, arrival, room);
        client.setSiguiente(this.primero);
        primero = client;
        tamaño ++;
    }
    public void eliminar(String firstName, String LastName){
        Client aux = this.primero;
        if(aux.getFirstName().equals(firstName) && aux.getLastName().equals(LastName)){
            this.primero = this.primero.getSiguiente();
        }
        while(aux.getSiguiente() !=null && !aux.getSiguiente().getFirstName().equals(firstName) && !aux.getSiguiente().getLastName().equals(LastName)){
            aux = aux.getSiguiente();
        }
        if(aux.getSiguiente() !=null){
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
    }
        tamaño --;
    }
    public Client buscar(String firstName, String LastName){
        Client aux = this.primero;
        while (aux !=null && !aux.getFirstName().equals(firstName) && !aux.getLastName().equals(LastName)){
            aux =aux.getSiguiente();
        }
        return aux;
    }
    public void imprimir(){
        Client aux = this.primero;
        while(aux !=null){
            System.out.println(aux.getFirstName()+ aux.getLastName()+ aux.getRoom());
            aux = aux.getSiguiente();
        }
    }
}
