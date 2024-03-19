/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import Classes.Reservation;


/**
 *
 * @author Isabella
 */
public class Node {
    private Object data;
    private int id;
    private int height;
    private Node leftSon;

    private Node rightSon;


    public Node(Object data, Node leftSon, Node rigthSon) {
        this.data = data;
        this.leftSon = leftSon;
        this.rightSon = rigthSon;
    }

    public Node(List data, int id) {
        this.data = data;

        this.id = id;

        this.height = 1;

        this.leftSon = null;
        this.rightSon =  null;
    }
    


    public Node() {
    }

    //AQUI ESTA EL PROBLEMAAAA
//    public Node(List recordsOfRoom, int id){
//        this.data = recordsOfRoom;
//        this.id = id;
//    }
//    
    
    
    public Node (Record record){
        this.data =  record;
    }

    
    
    public Node(Reservation newReservation, int id){
        this.data = newReservation;
        this.id = id;
        this.rightSon = null;
        this.leftSon = null;
    }
    
    


    
    
    
    
    
    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @return the leftSon
     */
    public Node getLeftSon() {
        return leftSon;
    }

    /**
     * @param leftSon the leftSon to set
     */
    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    /**
     * @return the rightSon
     */
    public Node getRightSon() {
        return rightSon;
    }

    /**
     * @param rightSon the rightSon to set
     */
    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
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
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
    
    

}
