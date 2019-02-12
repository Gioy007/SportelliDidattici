/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportellididattici;

import java.util.List;

/**
 *
 * @author vicini_gioele
 */
public class Giorno {
    String GDS,Giorno,Mese;
    public List<Riga> ListaGiorno;
    
    public Giorno(){
        GDS="";
        Giorno="";
        Mese="";
    }
    
    public void addRiga(Riga riga){
        ListaGiorno.add(riga);
    }
    
    public String toString(){
        String s="";
        
        for(int i=0;i<ListaGiorno.size();i++){
            s+=ListaGiorno.get(i).toString()+";";
        }
        
        return s;
    }
}
