/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguileraesclasansleizaola;

import Classes.HashTable;
import Classes.Reservation;
import DataStructures.Node;
import DataStructures.Tree;
import DatasetManagement.ConvertData;
import DatasetManagement.Data;
import static DatasetManagement.Data.obtainData;

import FunctionalitiesSoftware.FindReservation;
import FunctionalitiesSoftware.RoomRecords;

import java.util.Date;


/**
 *
 * @author Isabella
 */
public class AguileraEsclasansLeizaola {
    //Cambio
    //prueba
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Tree recordsTree = ConvertData.convertHistory();
        //recordsTree.printTreeRec();
        
//        
//        RoomRecords newRR = new RoomRecords();
//        newRR.returnRecordsRoom(120).printList();
        
//        Tree reservationsTree = ConvertData.ConvertRegisters();
//        reservationsTree.printTree();
        
        FindReservation fr = new FindReservation();
        Node nodeWithReservation = fr.getReservationByClientId(1);
        if(nodeWithReservation != null){
            
        System.out.println(nodeWithReservation.getData().toString());
        } else{
            System.out.println("no esxiste una reserva con ese nombre");
        }
        

        Tree example = ConvertData.ConvertRegisters();
        
//       System.out.println(example.getpRoot().getData().toString());
//       
//        if (example.getpRoot() != null) {
//            System.out.println("bien");
//
//        }

   //     example.printTree(example.getpRoot(), "", true);
//        


//    //Prueba d balancear
//        Tree tree = new Tree();
//        Reservation resevacion = new Reservation(15,"s","s","s","s","s","S","s","s");
//        Reservation resevacion1 = new Reservation(15,"s","s","s","s","s","S","s","s");
//        Reservation resevacion2 = new Reservation(20,"s","s","s","s","s","S","s","s");
//        Reservation resevacion3 = new Reservation(10,"s","s","s","s","s","S","s","s");
//        Reservation resevacion4 = new Reservation(60,"s","s","s","s","s","S","s","s");
//        Reservation resevacion5 = new Reservation(50,"s","s","s","s","s","S","s","s");
//        Reservation resevacion6 = new Reservation(45,"s","s","s","s","s","S","s","s");
//        Reservation resevacion7 = new Reservation(30,"s","s","s","s","s","S","s","s");
//        Reservation resevacion8 = new Reservation(25,"s","s","s","s","s","S","s","s");
//        Reservation resevacion9 = new Reservation(35,"s","s","s","s","s","S","s","s");
//        Reservation resevacion10 = new Reservation(40,"s","s","s","s","s","S","s","s");
//
//        tree.insertReservation(resevacion);
//        tree.insertReservation(resevacion1);
//        tree.insertReservation(resevacion2);
//        tree.insertReservation(resevacion6);
//        tree.insertReservation(resevacion3);
//        tree.insertReservation(resevacion5);
//        tree.insertReservation(resevacion7);
//        tree.insertReservation(resevacion9);
//        tree.insertReservation(resevacion4);
//        tree.insertReservation(resevacion10);
//        tree.insertReservation(resevacion8);
//       
//      
//      
//        
//        
//        tree.printInorder();
//        System.out.println("");
//        tree.printPostorder();
//        System.out.println("");
//        tree.printPreorder();
//
//    
//        System.out.println("");
//        tree.printTree();
//        
//        
//        tree.printTree();
        

   
//        System.out.println(tree.searchRoom(60).getId());

        Date fecha = new Date();
        HashTable hashtable = new HashTable(10);
        hashtable.insertar(3,"jhgjdh" , "hhghsgc", "gshdsb", "6ghssd","ghdgs", fecha , 3);
         hashtable.insertar(2,"adri" , "aguic", "adriana34", "656hc","0424122", fecha , 6);
         hashtable.insertar(1,"juan" , "biar", "juan6465", "837497","0414256", fecha , 7);
         hashtable.insertar(4,"jjose" , "agu", "hudgc6483b", "mdvj4","0426737", fecha , 9);
         hashtable.insertar(5,"vale" , "lopez", "gvale7742", "726482hd","04126724", fecha , 8);
        
         System.out.println(hashtable.imprimir("jhgjdh","hhghsgc") );
         System.out.println(hashtable.imprimir("adri" , "aguic"));
         System.out.println(hashtable.imprimir("juan" , "biar"));
         System.out.println(hashtable.imprimir("jjose" , "agu"));
         System.out.println(hashtable.imprimir("vale" , "lopez"));
         
         hashtable.eliminar("adri" , "aguic");
         hashtable.eliminar("vale" , "lopez");
         
         System.out.println(hashtable.imprimir("adri" , "aguic"));
         System.out.println(hashtable.imprimir("vale" , "lopez"));

    }
    


}

    