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
public class HashTable {
     Lista[] clientes;
    int tamano;
    
    public HashTable(int tamano){
        clientes =new Lista[tamano];
        this.tamano = tamano;
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Lista();
        }
    }
    public int Hash(String firstName, String LastName){
        int hash=0;
        
        for (int i = 0; i < firstName.length(); i++) {
            char c = firstName.charAt(i);
            hash += (int) c;
}   
            for (int j = 0; j < LastName.length(); j++) {
                char e = LastName.charAt(j);
                hash += (int) e;
            }
            return hash % tamano;
        
        }
        public void insertar(int id, String firstName, String LastName, String email, String gender, String phoneNumber, Date arrival, int room){
            int posicion = this.Hash(firstName, LastName);
            this.clientes[posicion].insertar(id, firstName, LastName, email, gender, phoneNumber, arrival, room);
        }
        public Client buscar(String firstName, String LastName){
            int posicion = this.Hash(firstName, LastName);
            return this.clientes[posicion].buscar(firstName, LastName);
        }
       public void eliminar(String firstName, String LastName){
            int posicion = this.Hash(firstName, LastName);
            this.clientes[posicion].eliminar(firstName, LastName);
       }
       public String imprimir(String firstName, String LastName){
            Client c = this.buscar(firstName, LastName);
            if(c!= null){
            return "Nombre: " + c.getFirstName() + "  " + c.getLastName() + " Habitacion:  "+  c.getRoom();
            }else{
                return "El usuario no existe";
            }

    }
}
