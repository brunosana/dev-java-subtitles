/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sublites;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno
 */
public class legenda {
    String inicio;
    String fim;
    String texto;

    public legenda(String inicio, String fim, String texto) {
        this.inicio = inicio;
        this.fim = fim;
        this.texto = texto;
    }

    
    
    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void addTime(int inisec, int fimsec, int inimilisec, int fimmilisec){
        SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss,SSS");
        
        try {
            Calendar calendar = Calendar.getInstance();
            Date data = d.parse(inicio);
	    calendar.setTime(data);      
            calendar.add(Calendar.SECOND, inisec);
            calendar.add(Calendar.MILLISECOND, inimilisec);
            inicio = d.format(calendar.getTime());
            data = d.parse(fim);
	    calendar.setTime(data);      
            calendar.add(Calendar.SECOND, fimsec);
            calendar.add(Calendar.MILLISECOND, fimmilisec);
            fim = d.format(calendar.getTime());
        } catch (ParseException ex) {
            Logger.getLogger(legenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
