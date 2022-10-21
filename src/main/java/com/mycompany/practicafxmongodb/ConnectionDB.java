/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafxmongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
/**
 *
 * @author furu9
 */

public class ConnectionDB {
    public static MongoClient conectar()
    {
  
        try {
            
            final MongoClient conexion = new MongoClient(new MongoClientURI("mongodb://root:password@localhost:27017/?authSource=admin"));
            
            System.out.println("Conectada correctamente a la BD");
  
            return conexion;
        }
        catch (Exception e) {
            System.out.println("Conexion Fallida");
            System.out.println(e);
            return null;
        }
    }
    public static void desconectar(MongoClient con)
    {
        con.close();
    }
            
         
}

   