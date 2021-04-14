/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astra.ac.id.managedbeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
@Named(value = "randomNumberBean")
@SessionScoped
public class RandomNumberBean implements Serializable {

    Integer random;
    String response;
    private Integer num;

    /**
     * Creates a new instance of tebakAngkaBean
     */

    public RandomNumberBean() {
        Random r = new Random();
        random = r.nextInt(10);
    }

    public Integer getRandom() {
        return random;
    }

    public void setRandom(Integer random) {
        this.random = random;
    }

    public String getResponse() {
                if ((num != null) && num.compareTo(random) == 0) {
            FacesContext context = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            session.invalidate();
            
            return "Yay! Kamu betul !";
        } else {
            return "Sorry, " + num + " Masih salah."
                    + " Tebak lagi ya...";
        }
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
    
}
