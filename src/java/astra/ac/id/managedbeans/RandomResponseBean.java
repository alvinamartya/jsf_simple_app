/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astra.ac.id.managedbeans;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;

/**
 *
 * @author Administrator
 */
@Named(value = "randomUtils")
@SessionScoped
public class RandomResponseBean implements Serializable {

    /**
     * Creates a new instance of RandomUtils
     */
    private String bahasaFavorit ="";
    Integer temp;
    String temp2="JavaScript";
    
    public RandomResponseBean() {
        cekData();
        Random randomPRG = new Random();
        TrainingBean tf = new TrainingBean();
        
        LanguageUtils language = new LanguageUtils();
        for (int i = 0; i < 3; i++) {
            
            temp = new Integer(randomPRG.nextInt(5)); 
            if(language.bahasaPemrograman.get(temp).toString().equals(temp2) || temp2.equals(tf.getBahasaPRG2())) {              
                i--;
            } else{
                bahasaFavorit += "<li>"+language.bahasaPemrograman.get(temp).toString()+"</li>";
            }
            temp2 = language.bahasaPemrograman.get(temp).toString();
        }
        
    }

    public String getBahasaFavorit() {
        
        return bahasaFavorit;
    }

    public void setBahasaFavorit(String bahasaFavorit) {
        this.bahasaFavorit = bahasaFavorit;
    }
    
    public void cekData(){
        TrainingBean tf = new TrainingBean();
        if(tf.isTraining()== true){
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("study_plan_failed.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(TrainingBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void methodInManagedBean() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("study_plan_failed.xhtml");
    }
}

