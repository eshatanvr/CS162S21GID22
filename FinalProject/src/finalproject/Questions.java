/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PCC
 */
public class Questions extends Options{

   public List <Options> Optlist= new ArrayList<>();
    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }
    public int qID;
    public String qText;
    public String cOpt; 
    
    public int getqID() {
        return qID;
    }

    public void setqID(int qID) {
        this.qID = qID;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public String getcOpt() {
        return cOpt;
    }

    public void setcOpt(String cOpt) {
        this.cOpt = cOpt;
    }
    public boolean AddOptions(Options s)
    {
        
        Optlist.add(s);
        return true;
    }
    
}
