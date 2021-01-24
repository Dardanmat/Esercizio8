
package es8.esercizio8;
import java.util.ArrayList;

public class Piatto {
    
     private String nome;
     private String tipo;
     private ArrayList<Ingrediente> ingredienti;
     private double prezzoPiatto;

    public Piatto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        prezzoPiatto = 0;
    }

    public Piatto(String nome, String tipo, ArrayList<Ingrediente> ingredienti) {
        this.nome = nome;
        this.tipo = tipo;
        this.ingredienti = (ArrayList)ingredienti.clone();
        
        for(int i = 0; i < ingredienti.size(); i ++){
            
            prezzoPiatto += ingredienti.get(i).getPrezzo();
            
        }
        
    }

    public double getPrezzoPiatto() {
        return prezzoPiatto;
    }
     
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Ingrediente> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(ArrayList<Ingrediente> ingredienti) {
        this.ingredienti = (ArrayList)ingredienti.clone();
    }
    
    public boolean addIngrediente(Ingrediente i){
        
        if(ingredienti.add(i)){
            
            prezzoPiatto += i.getPrezzo();
            
            return true;
        }
        
        return false;
    }
    
    public boolean removeIngrediente(Ingrediente i){
        
        if(ingredienti.remove(i)){
        
            prezzoPiatto -= i.getPrezzo();
            return true;
            
        }
        return false; 
    }
     
}
