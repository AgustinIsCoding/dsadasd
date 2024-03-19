/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatasetManagement;

import Classes.Reservation;
import DataStructures.Node;
import DataStructures.Tree;
import static DatasetManagement.Data.obtainData;
import static DatasetManagement.Data.stringToArray;
import Classes.Record;
import DataStructures.List;

/**
 *
 * @author Isabella
 */
public class ConvertData {

    public static Tree ConvertRegisters() {
        String[] info = stringToArray("test\\Datasets\\Booking_hotel - reservas.csv");
//        for (int i = 0; i<info.length; i ++){
//            System.out.println(info[i]);
//        }
        Tree reservationsTree = new Tree();

//ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida
//13.502.927,Evered,Ralestone,eralestone0@ask.com,Male,doble,(648) 8757440,14/10/2023,20/10/2023
//13.369.274,Berna,Lawly,blawly1@privacy.gov.au,Female,doble,(984) 2395498,15/08/2023,24/08/2023
//17.614.312,Marti,Meconi,mmeconi2@mozilla.org,Female,suite,(581) 7713030,12/08/2023,22/08/2023
//18.383.175,Jennifer,Allworthy,jallworthy3@squidoo.com,Female,doble,(647) 9910223,02/10/2023,03/10/2023
//12.902.463,Kalli,Rickhuss,krickhuss4@nyu.edu,Female,doble,(161) 8724477,02/07/2023,03/07/2023
//14.597.844,Julianna,Gauld,jgauld5@dailymotion.com,Female,simple,(214) 5216557,05/07/2023,24/07/2023
//17.347.235,Debera,Cohen,dcohen6@scientificamerican.com,Female,triple,(277) 7802138,26/09/2023,01/10/20um_hab
//
        for (int i = 1; i < info.length; i++) {
            String[] person = info[i].split(",");

            
            int id = Integer.valueOf(person[0].replace(".", "").trim());

            String firstName = person[1].trim();
 
            String lastName = person[2].trim();
            String email = person[3].trim();
            String gender = person[4].trim();
            String typeOfRoom = person[5].trim();
            String phone = person[6].trim();
            String arrivalDate = person[7].trim();
            String departureDate = person[8].trim();

            Reservation reservationInfo = new Reservation(id, firstName, lastName, email, gender, typeOfRoom, phone, arrivalDate, departureDate);


            if (reservationsTree.getpRoot() == null) {
                Node root = new Node(reservationInfo, reservationInfo.getId());
                reservationsTree.setpRoot(root);
            } else {
                reservationsTree.insertReservation(reservationInfo);
            }

        }
        return reservationsTree;
    }
    

        public static Tree convertHistory(){

        String[] data = Data.stringToArray("test\\Datasets\\Booking_hotel - Histórico.csv");
//        for (int i = 0; i< data.length; i++){
//            System.out.println(data[i]);  
//        }
        
        Tree recordsTree = new Tree();
        
//        ci,primer_nombre,apellido,email,genero,llegada,num_hab
//11.706.881,Ax,Hugland,ahugland1p@cpanel.net,Male,08/06/2022,160
//62.360.039,Dieter,Plaster,dplaster7c@reddit.com,Male,08/06/2022,291
        
        for (int i = 1; i < data.length; i++ ){
            String[] record = data[i].split(",");
            int idClient = Integer.valueOf(record[0].replace(".", "").trim());

            String firstName = record[1].trim();
 
            String lastName = record[2].trim();
            String email = record[3].trim();
            String gender = record[4].trim();
            String arrivalDate = record[5].trim();
            int roomNumber = Integer.valueOf(record[6].trim());
            
            Record newRecord = new Record(idClient, firstName, lastName, email, gender, arrivalDate, roomNumber);
            
            if (recordsTree.getpRoot() == null){
                
            }

            if (recordsTree.searchRoom(roomNumber) != null){
                Node node = recordsTree.searchRoom(roomNumber);
                List nuevaLista = (List) node.getData();
                nuevaLista.AddRecordToList(newRecord);
                node.setData(nuevaLista);
            }else{
                recordsTree.insertRecord(newRecord);
            }
            
            

        }
        
        return recordsTree;
    }

}
