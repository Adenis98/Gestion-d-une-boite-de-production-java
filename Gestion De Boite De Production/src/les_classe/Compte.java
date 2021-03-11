/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les_classe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramez
 */
public class Compte {
    
    
    
    private String cin;
    private String nom; 
    private String prenom; 
    private String num_tel;
    private String sexe;
    private String type_compte;
    private String password ;
    public Compte(String cin,String nom,String prenom,String num_tel,String sexe,String type,String pass)
    {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.num_tel = num_tel;
        this.sexe = sexe;
        this.type_compte = type;
        this.password = pass;
    } 

    Compte(String cin ) {
        this.cin = cin;
    }
    
    // GETTERS
    public String getNom_compte()
    {
        return this.nom;
    }
    public String getPrenom_compte()
    {
        return this.prenom;
    }
    public String getCin_compte()
    {
        return this.cin;
    }
    public String getType_compte()
    {
        return this.type_compte;
    }
    public String getSexe_compte()
    {
        return this.sexe;
    }
    public String getNum_tel_compte()
    {
        return this.num_tel;
    }
    public String getPassword_compte()
    {
        return this.password;
    }
    boolean insertion_cpt()
    {
        Connection con ;
        con = DbConnection.connect();
        String q="INSERT INTO `compte`( `cin`,`nom`, `prenom`, `num_tel`, `sexe`, `type`, `mot_de_passe`) VALUES ('"+cin+"','"+nom+"','"+prenom+"','"+num_tel+"','"+sexe+"','"+type_compte+"','"+password+"')";
        try {
            PreparedStatement pst = con.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(null, "AJOUTER !");
          
            return true;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    boolean modification_cpt(String cin1)
    {
        Connection con ;
        con = DbConnection.connect();
        String q="UPDATE `compte` SET `cin`='"+cin+"', `nom`='"+nom+"',`prenom`='"+prenom+"',`num_tel`='"+num_tel+"',`sexe` = '"+sexe+"',`type`='"+type_compte+"',`mot_de_passe`='"+password+"' WHERE `cin`="+cin1+"";
            try {
                PreparedStatement pst = con.prepareStatement(q);
                pst.execute();
                JOptionPane.showMessageDialog(null, "MODIFIER avec sucés !");
                
                return true;
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        return false;
        
    }
    boolean suppression_cpt()
    {
        Connection con ;
        con = DbConnection.connect();
        String q="DELETE FROM `compte` WHERE `cin`='"+this.cin+"'";
        try {
            PreparedStatement pst = con.prepareStatement(q);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }
}
