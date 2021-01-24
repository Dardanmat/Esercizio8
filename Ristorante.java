
package es8.esercizio8;
import java.util.ArrayList;


public class Ristorante {
    
    private double incasso = 0;
    
    private ArrayList<Piatto> piatti;
    private ArrayList<Ordine> ordini;

    public Ristorante(ArrayList<Piatto> piatti, ArrayList<Ordine> ordini) {
        this.piatti = (ArrayList)piatti.clone();
        this.ordini = (ArrayList)ordini.clone();
    }
    
    public boolean addPiatto(Piatto p){
        
        if(piatti.add(p))return true;
        return false;
        
    }
    public boolean removePiatto(Piatto p){
        
        if(piatti.remove(p))return true;
        return false;
        
    }
    
    public boolean addOrdine(Ordine o){

        if(ordini.add(o))return true;
        return false;
        
    }
    public boolean removeOrdine(Ordine o){
        
        if(ordini.remove(o))return true;
        return false;
        
    }
    
    public boolean addOrdinePiatto(Piatto p, int i){

        if(ordini.get(i).addPiatto(p))return true;
        return false;
        
    }
    public boolean removeOrdinePiatto(Piatto p, int i){
        
        if(ordini.get(i).removePiatto(p))return true;
        return false;
        
    }
    
    public double fineGiornataIncasso(){
        
        for(int i = 0; i < ordini.size(); i++){
            
            incasso += ordini.get(i).getPrezzoTot();
            
        }
        
        double tmp = incasso;
        incasso = 0;
        return tmp; 
        
    }
    
    public Ordine getImportoMaggiore(){
        
        int max = 0;
        
        for(int i = 0; i < ordini.size(); i++){
            
            if(ordini.get(i).getPrezzoTot() > ordini.get(max).getPrezzoTot()){
                max = i;
            }
                 
        }
        return ordini.get(max);
        
    }
    
    public ArrayList<Piatto> listaOrdinata(String tipo){
        
        ArrayList<Piatto> menu = new ArrayList<>();
        
        for(int i = 0; i < piatti.size(); i++){
            
            if(piatti.get(i).getTipo() == tipo){
                
                if(menu.isEmpty()){
                    
                    menu.add(piatti.get(i));
                    
                }else{
                    
                    for(int j = 0; j < menu.size(); j++){ // si cerca la posizione in cui mettere l'oggetto
                        
                        if(piatti.get(i).getPrezzoPiatto() < menu.get(j).getPrezzoPiatto()){ // si trova la posizione
                            
                            menu.add(j, piatti.get(i)); // si aggiunge e ci fa lo shift in automatico
                            
                        }
                        
                    }
                    
                }
                  
            }
            
        }
        
        return menu;
    }
    
}

    


