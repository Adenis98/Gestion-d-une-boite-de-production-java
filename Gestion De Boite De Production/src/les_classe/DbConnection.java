/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les_classe;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramez
 */
public class DbConnection {

    /**
     *
     */
    public static Connection connect()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion de boite de production?","root","");
            //JOptionPane.showMessageDialog(null, " CONNCETION SUCCESS !!!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
}
