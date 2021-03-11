/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les_classe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramez
 */

public class Client{
    

    private String nom;
    private String prenom;
    private String adresse ;
    private String tel;
    private String cin;
    private String e_mail;
    private String dette ;
    public Client (String nom, String prenom,String cin ,String tel,String e_mail,String adresse,String dette)
    {
        this.nom = nom;
        this.prenom = prenom ; 
        this.tel = tel ;
        this.cin= cin;
        this.adresse = adresse; 
        this.e_mail=e_mail;
        this.dette  = dette ;
    }
    public String getTel()
    {
        return this.tel;
    }
    public String getCin()
    {
        return this.cin ;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    public String getPrenom()
    {
        return this.prenom;
    }
    public String getEmail()
    {
        return this.e_mail;
    }
    public String getAdresse()
    {
        return this.adresse;
    }
    public String getDette()
    {
        return this.dette;
    }
    //***********SETEUR
    public void setTel(String tel)
    {
        this.tel =  tel;
    }
    public void setCin(String cin)
    {
         this.cin = cin;
    }
    
    public void setNom(String nom)
    {
        this.nom =  nom;
    }
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
    public void setEmail(String e_mail)
    {
        this.e_mail = e_mail;
    }
    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }
    public void setDette(String dette)
    {
        this.dette = dette ;
    }
    public void setDet(String det)
    {
        this.dette = det ;
    }
    public boolean modifier_cl()
    {
        Connection con = DbConnection.connect(); 
        String q="UPDATE `client` SET `nom`='"+nom+"',`prenom`='"+prenom+"',`num_tel`='"+tel+"',`e_mail`='"+e_mail+"',`adresse`='"+adresse+"'  where cin = '"+this.cin+"'";
            try {
                PreparedStatement pst = con.prepareStatement(q);
                pst.execute();
                return true ;
            }catch(Exception e)
            {
                
            }
        return false;
    }
    public boolean updateDette(String jTextField1)
    {
        
        try {
            Connection con = DbConnection.connect(); ;
            String q_client_old = " UPDATE `client` SET `dette` = `dette` - '"+jTextField1+"' where cin = '" +this.getCin()+"' ";
            PreparedStatement st = con.prepareStatement(q_client_old);
            st.execute();
           
           return true ;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "erreur update dette : "+e);
        }
        return false;
    }
}
