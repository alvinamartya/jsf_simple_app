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
@Named(value = "trainingForm")
@SessionScoped
public class TrainingBean implements Serializable {

    /**
     * Creates a new instance of TrainingForm
     */
    
    private String email,bahasaPRG1,bahasaPRG2;
    private boolean training,pengalaman;
    
    public TrainingBean() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBahasaPRG1() {
        return bahasaPRG1;
    }

    public void setBahasaPRG1(String bahasaPRG1) {
        this.bahasaPRG1 = bahasaPRG1;
    }

    public String getBahasaPRG2() {
        return bahasaPRG2;
    }

    public void setBahasaPRG2(String bahasaPRG2) {
        this.bahasaPRG2 = bahasaPRG2;
    }

    public boolean isTraining() {
        return training;
    }

    public void setTraining(boolean training) {
        this.training = training;
    }

    public boolean isPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(boolean pengalaman) {
        this.pengalaman = pengalaman;
    }
    
    
}

