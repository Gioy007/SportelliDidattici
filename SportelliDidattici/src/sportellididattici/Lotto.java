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
public class Lotto {
    String NomeLotto;
    List<Giorno> ListaGiorni;
    
    
    public Lotto(){
        NomeLotto="";
    }
    
    public void addGiorno(Giorno giorno){
        ListaGiorni.add(giorno);
    }
    
    public String toString(){
        String s="Lotto:"+NomeLotto+"\n\n";
        
        for(int i=0;i<ListaGiorni.size();i++){
            s+=ListaGiorni.get(i).toString()+";\n";
        }
        
        return s;
    }
}
