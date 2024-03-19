/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author Isabella
 */
public class Client {
    //ci,primer_nombre,apellido,email,genero,llegada,num_hab
    private int id; //cHEQUEAR SI DEBE TENER LOS PUNTOS
    private String firstName;
    private String LastName;
    private String email;
    private String gender;
    private String phoneNumber;
    private Date arrival; //Que hacemos con las fechas?
    private int room;
    private Client siguiente;

    public Client(int id, String firstName, String LastName, String email, String gender, String phoneNumber, Date arrival, int room) {
        this.id = id;
        this.firstName = firstName;
        this.LastName = LastName;
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.arrival = arrival;
        this.room = room;
        this.siguiente = null;
    }

    public Client() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the arrival
     */
    public Date getArrival() {
        return arrival;
    }

    /**
     * @param arrival the arrival to set
     */
    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    /**
     * @return the room
     */
    public int getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(int room) {
        this.room = room;
    }
    
    public void setSiguiente(Client siguiente){
        this.siguiente = siguiente;
    }
    public Client getSiguiente(){
        return siguiente;
    }
}
