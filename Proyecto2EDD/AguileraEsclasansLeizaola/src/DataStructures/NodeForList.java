/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;
import Classes.Record;

/**
 *
 * @author Isabella
 */

//hola
public class NodeForList {
    private Object data;
    private NodeForList pNext;

//    public NodeForList(Object data, Node pNext, int size) {
//        this.data = data;
//        this.pNext = pNext;
//    }

    public NodeForList(Record record) {
        this.data = record;
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
     * @return the pNext
     */
    public NodeForList getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodeForList pNext) {
        this.pNext = pNext;
    }
    
    
    
    
}
