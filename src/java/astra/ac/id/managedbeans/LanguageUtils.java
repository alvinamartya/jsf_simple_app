/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astra.ac.id.managedbeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
@Named(value = "languageUtils")
@SessionScoped
public class LanguageUtils implements Serializable {

   
    List bahasaPemrograman;
    /**
     * Creates a new instance of LanguageUtils
     */
    public LanguageUtils() {
        bahasaPemrograman = new ArrayList();
        bahasaPemrograman.add(0, "JavaScript");
        bahasaPemrograman.add(1, "C++");
        bahasaPemrograman.add(2, "Android");
        bahasaPemrograman.add(3, "PHP");
        bahasaPemrograman.add(4, "C#");
        bahasaPemrograman.add(5, "ASP");
    }
}

