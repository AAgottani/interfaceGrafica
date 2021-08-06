/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author CPU
 */


public class gravaTxt {
    
    
    TelaCadastroMoveis lista = new TelaCadastroMoveis();
    public void criaDiretorio() throws IOException{
        java.io.File diretorio = new java.io.File("C:\\sabineM"); 
        if(!diretorio.exists()){
        diretorio.mkdir();
        }
        java.io.File arquivo = new java.io.File(diretorio, "arq_01.txt"); 
        if(!arquivo.exists()){
        
        
          try {
	boolean statusArq = arquivo.createNewFile();
	System.out.print(statusArq);
            } catch (IOException e) {
            //e.printStackTrace(); 
            JOptionPane.showMessageDialog(null, "fudeu");
}
        }else{
          //Logica de gravação
          FileWriter fw = new FileWriter( arquivo );
          BufferedWriter bw = new BufferedWriter( fw );
          bw.write(lista.variaveisCadastro() ); 
        }
    }

   

}
