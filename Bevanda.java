/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es8.esercizio8;


/**
 *
 * @author darda
 */
public class Bevanda {
    
    private String descrizione;
    private double prezzo;
    private int qta;
    
    public Bevanda(String descrizione, double prezzo, int qta){
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.qta = qta;
    }
    
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    

    public int getQta() {
        return qta;
    }

    public void setQta(int qta) {
        this.qta = qta;
    }
    
    
    
}
