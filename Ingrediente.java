
package es8.esercizio8;


public class Ingrediente {
    
    private String descrizione;
    private int qta;
    private double prezzo;

    public Ingrediente(String descrizione, int qta, double prezzo) {
        this.descrizione = descrizione;
        this.qta = qta;
        this.prezzo = prezzo;
    }

    public Ingrediente(Ingrediente i){
        this.descrizione = i.descrizione;
        this.qta = i.qta;
        this.prezzo = i.prezzo;     
    }
    

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getQta() {
        return qta;
    }

    public void setQta(int qta) {
        this.qta = qta;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
}
