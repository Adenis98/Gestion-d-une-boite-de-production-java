/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package les_classe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ramez
 */
public class Service {
    
   
    Connection con ; 
    private String nom_service;
    private String type;
    private String tarif;
    private String avance ;
    private String client  ;
    
    public Service (String nom , String type , String tarif , String avance , String client)
    {
        con = DbConnection.connect();
        this.nom_service = nom; 
        this.type = type ; 
        this.tarif = tarif; 
        this.avance = avance; 
        this.client = client ;
    }
    //GETTEUR
    public String getNom_service(){
        return this.nom_service;
    }
    public String getType()
    {
        return this.type;
    }
    public String getTarif()
    {
        return this.tarif;
    }
    
    public String getAvance()
    {
        return this.avance;
    }
    public String getClient()
    {
        return this.client;
    }
    //SETTEUR
    public void setNom_service(String n){
        this.nom_service =  n;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setTarif(String t)
    {
        this.tarif = t;
    }
    
    public void setAvance(String a)
    {
        this.avance = a;
    }
    public void setClient(String cl)
    {
        this.client = cl;
    }
    public boolean insertion_serv(DefaultTableModel model,boolean client_trouve,Client cli)
    {
        try 
            {
                String q_serv = "INSERT INTO `service`( `nom_service`, `type`, `tarif`, `avance`, `cin_client`) VALUES ('"+nom_service+"','"+type+"','"+tarif+"','"+avance+"','"+this.client+"')";
                PreparedStatement pst_serv = con.prepareStatement(q_serv);
                pst_serv.execute();
                
                
                //tstsstststssttsts
                String q="SELECT * FROM service ";
                int id_serv=0 ;
                int max=0;
                try {
                    PreparedStatement r = con.prepareStatement(q);
                    ResultSet rslt = r.executeQuery();

                     
                    while(rslt.next())
                    {
                        id_serv = Integer.parseInt(rslt.getString("id"));   
                        if(id_serv>max)
                            max=id_serv;
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(AjouterService.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null , ex);
                }
                //*********************
                
                int i=0;
                String date_s,lieu,remarque;
                while(i <model.getRowCount())
                {
                    date_s = (String) model.getValueAt(i,0);
                    lieu = (String) model.getValueAt(i,1);
                    remarque = (String) model.getValueAt(i,2);
                    
                    Date_s da = new Date_s(date_s , lieu , remarque );
                    da.insertion(max);
                    
                    i++;
                }
                
                
                int det = Integer.parseInt(this.tarif)-Integer.parseInt(this.avance);
                cli.setDet(Integer.toString(det));
                
                if(!client_trouve)
                {
                    String q_client = "INSERT INTO `client`(`cin`, `nom`, `prenom`, `num_tel`, `e_mail`, `adresse`,`dette`) VALUES ('"+cli.getCin()+"','"+cli.getNom()+"','"+cli.getPrenom()+"','"+cli.getTel()+"','"+cli.getEmail()+"','"+cli.getAdresse()+"','"+det+"')";
                    PreparedStatement pst_client = con.prepareStatement(q_client);
                    pst_client.execute();
                }else{
                    try {
                        String q_client_old= "UPDATE `client` SET `dette` = `dette` + '"+det+"' where cin = '"+cli.getCin()+"'";
                        PreparedStatement st = con.prepareStatement(q_client_old);
                        st.execute();

                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "erreur update dette "+e);
                    }
                }
                return true ; 
            } catch (SQLException ex) {
                Logger.getLogger(AjouterService.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null," ERREUR "+ ex);
            }
        return false; 
    }
}
