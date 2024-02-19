/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import Model.Database;
import Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddUserController {
     public AddUserController() {
    }
    
    public boolean addUserToDatabase(User data){
        try {
           
           
            String sql = "INSERT INTO usertable.users (username,password)values(?,?)";
            PreparedStatement p = Database.getInstance().getConnection().prepareStatement(sql);
            p.setString(1, data.getUsername());
            p.setString(2, new String(data.getPassword()));
          
            
            p.executeUpdate();
           return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
      public User Sign_In(User data){
          try {
              String sql = "SELECT * FROM usertable.users WHERE username LIKE ? AND password LIKE ?";
              PreparedStatement p = Database.getInstance().getConnection().prepareStatement(sql);
              p.setString(1, data.getUsername());
              p.setString(2, new String(data.getPassword()));
              ResultSet rs = p.executeQuery();
               if (rs.next()) {
                  return new User(rs.getString("username"), rs.getString("password").toCharArray());
              }else{
                   return null;
               }
          } catch (Exception e) {
              e.printStackTrace();
              return null;
          }
     
      }
   
    
      public String encryptPass(String password){
        try {
            MessageDigest digestor = MessageDigest.getInstance("SHA-256");
            byte [] encodeHash = digestor.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder encryptionValue = new StringBuilder(2 * encodeHash.length);
            
             for (int i = 0; i < encodeHash.length; i++) {
                String hexVal = Integer.toHexString(0xff & encodeHash[i]);
                if (hexVal.length() == 1) {
                    encryptionValue.append('0');
                }
                encryptionValue.append(hexVal);
            }
             return encryptionValue.toString();
        } catch (Exception e) {
             return e.getMessage();
        }
    }

    User getUser(User theUser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
