/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astra.ac.id.managedbeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
@Named(value = "banklogin")
@SessionScoped
public class BankLoginBean implements Serializable {

    /**
     * Creates a new instance of BankBean
     */
    private String id;
    private String nama;
    private String password;
    String [][] akunBank= {{"user1","123"},{"user2","123"},{"user3","123"}};
    
    public BankLoginBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[][] getAkunBank() {
        return akunBank;
    }

    public void setAkunBank(String[][] akunBank) {
        this.akunBank = akunBank;
    }
    
    public String Login(){
            if(id.equals(akunBank[0][0]))
            {
                
                if(password.equals(akunBank[0][1]))
                {
                    setNama("User A");
                    setId(akunBank[0][0]);
                    return "/balance_negatif.xhtml";
                }
                else
                {
                    return "/failed_password.xhtml";
                }
                    
            }
            else if(id.equals(akunBank[1][0]))
            {
                if(password.equals(akunBank[1][1]))
                {
                    setNama("User B");
                    setId(akunBank[1][0]);
                    return "/balance_kecil.xhtml";
                }
                else
                {
                    return "/failed_password.xhtml";
                }
                    
            }
            else if(id.equals(akunBank[2][0]))
            {
                if(password.equals(akunBank[2][1]))
                {
                    setNama("User C");
                    setId(akunBank[2][0]);
                    return "/balance_besar.xhtml";
                }
                else
                {
                    return "/failed_password.xhtml";
                }
                    
            }
            else
            {
                return "/failed_username.xhtml";
            }
            
    }
    
}




