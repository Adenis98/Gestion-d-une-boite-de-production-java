/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les_classe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Date_s {
    
    Connection con;
    private String date_s; 
    private String lieu ; 
    private String remarque;
    public Date_s (String date_s , String lieu , String rem)
    {
        con = DbConnection.connect();
        this.date_s = date_s ; 
        this.lieu = lieu ; 
        this.remarque = rem; 
    }
    
    //GETTEUR 
    public String getDate_s()
    {
        return this.date_s;
    }
    
    public String getLieu()
    {
        return this.lieu;
    }
    
    public String getRemarque()
    {
        return this.remarque;
    }
    
    //SETTEUR
    
    public void setDate_s(String date)
    {
        this.date_s = date ; 
    }
    
    public void setLieu(String l)
    {
        this.lieu = l ; 
    }
    
    public void setRamarque(String r)
    {
        this.remarque = r;
    }
    
    public boolean insertion(int max)
    {
        
        try 
        {
            String q_date = "INSERT INTO `date`( `date_s`, `lieu`, `remarque`, `id_service`) VALUES ('"+date_s+"','"+lieu+"','"+remarque+"','"+max+"')";
            PreparedStatement pst_date = con.prepareStatement(q_date);
            pst_date.execute();
            return true ; 
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
}
