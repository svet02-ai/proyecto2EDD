/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmendeley;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author macbookpro
 */
public class summary {
    
    private String title;
    private List author;
    private String body;
    private List keyWord;
    private int numElements;  //número de elementos que posee la tabla

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List getAuthor() {
        return author;
    }

    public void setAuthor(List author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(List keyWord) {
        this.keyWord = keyWord;
    }

    public int getNumElements() {
        return numElements;
    }

    public void setNumElements(int numElements) {
        this.numElements = numElements;
    }
    
    // CONSTRUCTOR \\
    
    public summary(String dir){
        asignar(dir);
    }
    
    public void asignar(String path)                
    {
        
        File file = new File(path);
        String bfread;
        String temp = "";
        String[] tempSplit;
       
        int cont = 0;
        
        try
        {
            FileReader fr = new FileReader(file);
            

            BufferedReader br = new BufferedReader(fr);
           

            while((bfread = br.readLine()) != null)
            {
                if(!bfread.equals("")){
                    temp += bfread + "//";   
                }
            }
            
            br.close();
            
            tempSplit = temp.split("//");
            
           
            // ASIGNAR TITULO \\
            
            this.setTitle(tempSplit[0]);
            
           
            // ASIGNAR AUTORES \\
            
            while(cont < tempSplit.length){
                if(tempSplit[cont].equals("Resumen")){
                    break;
                }
                cont++;                    
            }
            
            List aux = new List();
            
            for (int i = 2; i < cont; i++) 
            {
                Node nodito = new Node(tempSplit[i]);
                    aux.addAtEnd(nodito);
                
            }
            
            this.setAuthor(aux);
            
            
            // ASIGNAR RESUMEN \\
                
            this.setBody(tempSplit[cont+1]);
            
            
            // ASIGNAR PALABRAS CLAVE \\
                
            String palabra = tempSplit[cont+2];
            List lista = new List();
            
            
            if(palabra.contains("Palabras Claves:")){
                String replace = palabra.replace("Palabras Claves:", "");
                String[] palabras = replace.split(",");
                
                for (int i = 0; i < palabras.length; i++) {
                    
                    Node nodo = new Node(palabras[i].replace(".", ""));
                    lista.addAtEnd(nodo);
                }
                
                this.setKeyWord(lista);
                
            }else if(palabra.contains("Palabras claves:")){
                String replace = palabra.replace("Palabras claves:", "");
                String[] palabras = replace.split(",");
                
                for (int i = 0; i < palabras.length; i++) {
                   
                    
                    Node node = new Node(palabras[i].replace(".", ""));
                    lista.addAtEnd(node);
                }
                
                this.setKeyWord(lista);
            }
            
 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
