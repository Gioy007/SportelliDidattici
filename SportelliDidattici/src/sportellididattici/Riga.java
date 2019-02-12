/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportellididattici;

/**
 *
 * @author vicini_gioele
 */
public class Riga {
    public String SoloDocenti, DocentiGenitori, Classi;
    
    public Riga(){
        SoloDocenti="";
        DocentiGenitori="";
        Classi="";
    }
    
    public String toString(){
        String s="";
        
        s=" Solo Docenti:"+SoloDocenti+";Docenti/Genitori Studenti:"+DocentiGenitori+";Classi:"+Classi;
        
        return s;
    }
    
    
}
