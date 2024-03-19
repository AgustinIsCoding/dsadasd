/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import Classes.Reservation;
import Classes.Room;
import Classes.Record;

/**
 *
 * @author Isabella
 */
public class Tree {

    private Node pRoot;

    public Tree(Node pRoot) {
        this.pRoot = pRoot;
    }

    public Tree() {
    }

    public void insertReservation(Reservation newReservation) {
        pRoot = insertReservation(pRoot, newReservation);

    }

    private Node insertReservation(Node node, Reservation newReservation) {

        if (node == null) {
            return new Node(newReservation, newReservation.getId());
        }

        int comparison = newReservation.getId() - ((Reservation) node.getData()).getId();
        if (comparison < 0) {
            node.setLeftSon(insertReservation(node.getLeftSon(), newReservation));
        } else if (comparison > 0) {
            node.setRightSon(insertReservation(node.getRightSon(), newReservation));
        } else {

        }

        node.setHeight(1 + Math.max(getHeight(node.getLeftSon()), getHeight(node.getRightSon())));

        int balance = getBalance(node);

        if (balance > 1 && newReservation.getId() < ((Reservation) node.getLeftSon().getData()).getId()) {
            return rotateRight(node);
        }

        if (balance < -1 && newReservation.getId() > ((Reservation) node.getRightSon().getData()).getId()) {
            return rotateLeft(node);
        }

        if (balance > 1 && newReservation.getId() > ((Reservation) node.getLeftSon().getData()).getId()) {
            node.setLeftSon(rotateLeft(node.getLeftSon()));
            return rotateRight(node);
        }

        if (balance < -1 && newReservation.getId() < ((Reservation) node.getRightSon().getData()).getId()) {
            node.setRightSon(rotateRight(node.getRightSon()));
            return rotateLeft(node);
        }

        return node;
    }

    private Node rotateLeft(Node node) {
        Node rightChild = node.getRightSon();
        Node leftGrandchild = rightChild.getLeftSon();

        rightChild.setLeftSon(node);
        node.setRightSon(leftGrandchild);

        // Actualiza heights
        node.setHeight(1 + Math.max(getHeight(node.getLeftSon()), getHeight(node.getRightSon())));
        rightChild.setHeight(1 + Math.max(getHeight(rightChild.getLeftSon()), getHeight(rightChild.getRightSon())));

        return rightChild;
    }

    private Node rotateRight(Node node) {
        Node leftChild = node.getLeftSon();
        Node rightGrandchild = leftChild.getRightSon();

        leftChild.setRightSon(node);
        node.setLeftSon(rightGrandchild);

        node.setHeight(1 + Math.max(getHeight(node.getLeftSon()), getHeight(node.getRightSon())));
        leftChild.setHeight(1 + Math.max(getHeight(leftChild.getLeftSon()), getHeight(leftChild.getRightSon())));

        return leftChild;
    }

    //METODOS PARA AGREGAR RECORDS AL ARBOL DE RECORDS
    public void insertRecord(Record newRecord) {
        pRoot = insertRecord(pRoot, newRecord);

    }

    private Node insertRecord(Node node, Record newRecord) {

        if (node == null) {
            List newList = new List();
            newList.AddRecordToList(newRecord);
            return new Node(newList, newRecord.getRoomNumber());
        }

        int comparison = newRecord.getRoomNumber() - node.getId();
        if (comparison < 0) {
            node.setLeftSon(insertRecord(node.getLeftSon(), newRecord));
        } else if (comparison > 0) {
            node.setRightSon(insertRecord(node.getRightSon(), newRecord));
        } else {
            // node.getData().
        }

        node.setHeight(1 + Math.max(getHeight(node.getLeftSon()), getHeight(node.getRightSon())));

        int balance = getBalance(node);

        if (balance > 1 && newRecord.getRoomNumber() < node.getLeftSon().getId()) {
            return rotateRight(node);
        }

        if (balance < -1 && newRecord.getId() > node.getRightSon().getId()) {
            return rotateLeft(node);
        }

        if (balance > 1 && newRecord.getRoomNumber() > node.getLeftSon().getId()) {
            node.setLeftSon(rotateLeft(node.getLeftSon()));
            return rotateRight(node);
        }

        if (balance < -1 && newRecord.getId() < node.getRightSon().getId()) {
            node.setRightSon(rotateRight(node.getRightSon()));
            return rotateLeft(node);
        }

        return node;
    }

    //REVISAR
    public Node searchReservation(int id) {
        Node pointer = this.pRoot;
        if (pointer == null) {
            return null;
        }
        while (pointer.getId() != id) {
            if (id < pointer.getId() && pointer.getLeftSon() != null) {
                pointer = pointer.getLeftSon();
            } else if (id > pointer.getId() && pointer.getRightSon() != null) {
                pointer = pointer.getRightSon();
            } else if (id == pointer.getId()) {
                System.out.println("hasta aca");
                break;
            } else {
                return null;
            }
        }
        return pointer;
    }

    public Node searchRoom(int roomNum) {
        Node pointer = this.pRoot;
        if (pointer == null) {
            return null;
        }
        while (pointer.getId() != roomNum) {
            if (roomNum < pointer.getId() && pointer.getLeftSon() != null) {
                pointer = pointer.getLeftSon();
            } else if (roomNum > pointer.getId() && pointer.getRightSon() != null) {
                pointer = pointer.getRightSon();
            } else {
                return null;
            }
        }
        return pointer;
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.getLeftSon()) - getHeight(node.getRightSon());
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    public void printTree() {
        printTree(pRoot, "");
    }

    public void printTreeRec() {
        printTreeRec(pRoot, "");
    }

    private void printTree(Node node, String indent) {
        if (node != null) {
            System.out.println(indent + "!--- " + ((Reservation) node.getData()).getId());
            printTree(node.getLeftSon(), indent + "L   ");
            printTree(node.getRightSon(), indent + "R   ");
        }
    }

    private void printTreeRec(Node node, String indent) {
        if (node != null) {
            System.out.println(indent + "!--- " + node.getId());
            printTreeRec(node.getLeftSon(), indent + "L   ");
            printTreeRec(node.getRightSon(), indent + "R   ");
        }
    }

    public void printPreorder() {
        printPreorder(pRoot);
    }

    private void printPreorder(Node node) {
        if (node != null) {
            System.out.println(((Reservation) node.getData()).getId());
            printPreorder(node.getLeftSon());
            printPreorder(node.getRightSon());
        }
    }

    public void printInorder() {
        printInorder(pRoot);
    }

    private void printInorder(Node node) {
        if (node != null) {
            printInorder(node.getLeftSon());
            System.out.println(((Reservation) node.getData()).getId());
            printInorder(node.getRightSon());
        }
    }

    public void printPostorder() {
        printPostorder(pRoot);
    }

    private void printPostorder(Node node) {
        if (node != null) {
            printPostorder(node.getLeftSon());
            printPostorder(node.getRightSon());
            System.out.println(((Reservation) node.getData()).getId());
        }
    }

    /**
     * @return the pRoot
     */
    public Node getpRoot() {
        return pRoot;
    }

    /**
     * @param pRoot the pRoot to set
     */
    public void setpRoot(Node pRoot) {
        this.pRoot = pRoot;
    }

}
