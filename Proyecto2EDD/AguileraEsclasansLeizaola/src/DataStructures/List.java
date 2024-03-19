package DataStructures;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import DataStructures.NodeForList;
import Classes.Record;

/**
 *
 * @author Isabella
 */

public class List {
    private NodeForList pFirst;
    private NodeForList plast;
    private int size;

    public List() {
    }

    public List(NodeForList pFirst, NodeForList plast, int size) {
        this.pFirst = pFirst;
        this.plast = plast;
        this.size = size;
    }
    
    public boolean isEmpty(){
        return getpFirst() == null;
    }
    
    public void AddRecordToList(Record record){
        NodeForList newNode = new NodeForList(record);
        NodeForList aux = getpFirst();
        if (!isEmpty()){
            while(aux.getpNext() != null){
                aux = aux.getpNext();
            }
            aux.setpNext(newNode);
        }else{
            setpFirst(newNode);
        }
    }
    
    public void printList(){
        if (!isEmpty()){
            NodeForList aux = pFirst;
            while (aux != null){
                System.out.println(aux.getData());
                aux = aux.getpNext();
            }
        }
 
    }

    /**
     * @return the pFirst
     */
    public NodeForList getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodeForList pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the plast
     */
    public NodeForList getPlast() {
        return plast;
    }

    /**
     * @param plast the plast to set
     */
    public void setPlast(NodeForList plast) {
        this.plast = plast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
    
}
    
    
