/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casamassagem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class BD {
 
public BD () {}
public static Connection con = null;
 
public static void Conectar() {
System.out.println("Conectando ao banco...");
try {
  Class.forName("com.mysql.jdbc.Driver");
  
  con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/Casademassagem","root","230885ts");
  System.out.println("Conectado.");
} catch (ClassNotFoundException ex) {
    System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
  Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
  } catch(SQLException e) {
    System.out.println(e);
    throw new RuntimeException(e);
}
 
}
 
}


