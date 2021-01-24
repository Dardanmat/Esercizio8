
package es8.esercizio8;
import java.util.ArrayList;


public class Main {
 
    public static void main(String[] args){
        
        Ingrediente ing1 = new Ingrediente("Carciofo", 1, 2);       //2€
        Ingrediente ing2 = new Ingrediente("Pasta", 1, 5);          //5€
        Ingrediente ing3 = new Ingrediente("Pomodoro", 3, 2.5);     //2.5€
        Ingrediente ing4 = new Ingrediente("Mozza", 2, 3);          //3€
        Ingrediente ing5 = new Ingrediente("Fagioli", 1, 64.50);    //64.50€
        Ingrediente ing6 = new Ingrediente("Parmigiano", 2, 1);     //1€
        //Ingrediente ingrediente = new Ingrediente(descrizione, qta, prezzo)
        
        ArrayList<Ingrediente> ingr = new ArrayList<>();
        ArrayList<Piatto> piatti = new ArrayList<>();
        ArrayList<Ordine> ordini = new ArrayList<>();
        ArrayList<Bevanda> bevande = new ArrayList<>();
        
        
        ingr.add(ing1);
        ingr.add(ing3);
        ingr.add(ing4);
        
        Piatto p1 = new Piatto("Carciofo al pomodoro con la mozza", "Antipasto", ingr);
        
        ingr.remove(ing1);
        ingr.remove(ing4);
        
        ingr.add(ing2);
       
        Piatto p2 = new Piatto("Pasta al pomodoro", "Primo", ingr);

        ingr.remove(ing3);
        
        ingr.add(ing6);

        Piatto p3 = new Piatto("Pasta col parmigiano", "Primo", ingr);
        
        ingr.remove(ing2);
        ingr.remove(ing6);
        
        ingr.add(ing5);
        
        Piatto p4 = new Piatto("Fagioli", "Contorno", ingr);
        
        
        piatti.add(p1);
        piatti.add(p2);
        piatti.add(p3);
        piatti.add(p4);
        
        
        System.out.println("Nome piatto 1: " + piatti.get(0).getNome()+ " e il prezzo è " + piatti.get(0).getPrezzoPiatto() + "€");
        System.out.println("Nome piatto 2: " + piatti.get(1).getNome()+ " e il prezzo è " + piatti.get(1).getPrezzoPiatto() + "€");
        System.out.println("Nome piatto 3: " + piatti.get(2).getNome()+ " e il prezzo è " + piatti.get(2).getPrezzoPiatto() + "€");
        System.out.println("Nome piatto 4: " + piatti.get(3).getNome()+ " e il prezzo è " + piatti.get(3).getPrezzoPiatto() + "€");
        
        
        Ristorante rist = new Ristorante(piatti, ordini);
        
        rist.addOrdine(new Ordine("Signor Ping", piatti));
        
        piatti.add(p4);
        rist.addOrdine(new Ordine("Signor Pong", piatti));
        
        if(rist.removeOrdinePiatto(p4, 0)){ //removeOrdinePiatto (piatto da togliere, posizione dell'ordine in cui bisogna togliere il piatto)
            System.out.println("Fagioli rimossi dall'ordine");
        }else System.out.println("Errore");
        
        
        System.out.println("L'incasso della giornata è " + rist.fineGiornataIncasso() +"€");
        
        System.out.println("L'ordine con l'importo più alto vale " + rist.getImportoMaggiore().getPrezzoTot() + "€");
             
//        System.out.println("Il prezzo del piatto p1 è " + p1.getPrezzoPiatto() + "€");
//        
//        
// 
//        if(p1.removeIngrediente(ing1)){ // RIMOZIONI DI UN INGREDIENTE
//            
//            p1.setNome("Pomodoro e mozza");
//            System.out.println("Il prezzo del piatto " + p1.getNome() + " è " + p1.getPrezzoPiatto() + "€");
//            
//        }else{
//            
//            System.out.println("Operazione fallita, il carciofo rimane");
//            
//        }
//        
//        
//        if(p1.addIngrediente(ing2)){ // AGGIUNZIONE ID UN INGREDIENTE
//            
//            p1.setNome("Pasta col Pomodoro & Mozza");
//            System.out.println("Il prezzo del piatto " + p1.getNome() + " è " + p1.getPrezzoPiatto() + "€");
//            
//        }else{
//            
//            System.out.println("Operazione fallita, niente pasta");
//            
//        }
        

    }
    
}
