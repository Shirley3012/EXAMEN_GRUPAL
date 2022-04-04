/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author SHIRLEY
 */
public class Conexion {
    private static Connection conexion;
    private static String user = "root";
    private static String password="zajc3012";
    static String url= "jdbc:mysql://localhost:3306/proyecto_poo";
    
    public static Connection getConnection(){
        try {
            conexion=DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
            Statement stm = conexion.createStatement();
            ResultSet rs =stm.executeQuery("select*from estudiante");
            while (rs.next()){
                System.out.println("OK");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conexion;
    }
     public static void closeConexion (){
        try {
            getConnection().close();
            JOptionPane.showMessageDialog(null,"Conexion cerrada exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
    
    
   
    
   
    
}
