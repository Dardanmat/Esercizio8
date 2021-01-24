
package es8.esercizio8;
import java.util.ArrayList;

public class Ordine {
    
    public static int numOrdini = 0;
    
    private int num;
    private String nomeCameriere;
    private ArrayList<Piatto> ordini;
    private ArrayList<Bevanda> bevande;
    private double prezzoTot;

    
    //COSTRUTTORI
    public Ordine(String nomeCameriere, ArrayList<Piatto> ordini, ArrayList<Bevanda> bevande) {
        
        this.num = numOrdini;
        numOrdini++;
        
        this.nomeCameriere = nomeCameriere;
        this.ordini = (ArrayList)ordini.clone();
        this.bevande = (ArrayList)bevande.clone();
        
        for(int i = 0; i < ordini.size(); i++){
            
            prezzoTot += ordini.get(i).getPrezzoPiatto();
            prezzoTot += bevande.get(i).getPrezzo();
            
        }
        
    }   
    
    public Ordine(String nomeCameriere, ArrayList<Piatto> ordini) {
        
        this.num = numOrdini;
        numOrdini++;
        
        this.nomeCameriere = nomeCameriere;
        this.ordini = (ArrayList)ordini.clone();
        this.bevande = new ArrayList<>();
        
        for(int i = 0; i < ordini.size(); i++){
            
            prezzoTot += ordini.get(i).getPrezzoPiatto();      
            
        }
        
    }
    
    public Ordine(String nomeCameriere) {
        
        this.num = numOrdini;
        numOrdini++;
        
        this.nomeCameriere = nomeCameriere;
    }  
    
    //GETTERS E SETTERS
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String getNomeCameriere() {
        return nomeCameriere;
    }
    public void setNomeCameriere(String nomeCameriere) {
        this.nomeCameriere = nomeCameriere;
    }

    public ArrayList<Piatto> getOrdini() {
        return ordini;
    }
    public void setOrdini(ArrayList<Piatto> ordini) {
        this.ordini = (ArrayList)ordini.clone();
    }

    public double getPrezzoTot() {
        return prezzoTot;
    }

    
    
    //METODI
    public boolean addPiatto(Piatto p){

        if(ordini.add(p)) {
            
            prezzoTot += p.getPrezzoPiatto();
            
            return true;
        }

        return false;
    }
    
    public boolean removePiatto(Piatto p){
        
        if(ordini.remove(p)){
            
            prezzoTot -= p.getPrezzoPiatto();
            
            return true;
        }
        return false;
    }
 
    public boolean addBevanda(Bevanda b){
        
        if(bevande.add(b)){
            
            prezzoTot += b.getPrezzo();
            
            return true;
        }
        return false;
    }
    
    public boolean removeBevanda(Bevanda b){
        
        if(bevande.remove(b)){
            
            prezzoTot -= b.getPrezzo();
            
            return true;
        }
        return false;
    }
}
