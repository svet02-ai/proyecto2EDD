/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmendeley;

import javax.swing.JOptionPane;

/**
 *
 * @author Svetlana Valentina
 */
public class List {
    private Node pfirst;
    private Node plast;
    private int size;

    public List() {
        this.pfirst = null;
        this.size = 0;
    }

    /**
     * @return the pfirst
     */
    public Node getPfirst() {
        return pfirst;
    }

    /**
     * @param pfirst the pfirst to set
     */
    public void setPfirst(Node pfirst) {
        this.pfirst = pfirst;
    }

    /**
     * @return the plast
     */
    public Node getPlast() {
        return plast;
    }

    /**
     * @param plast the plast to set
     */
    public void setPlast(Node plast) {
        this.plast = plast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
    public boolean isEmpty(){
        return pfirst == null;
    }  
    
    public Node firstNode(Node posicion){
        return pfirst;
    }
    
    public Node lastNode(Node posicion){
        return null;
    }
    
    public void emptyList(){
        pfirst = null;
        size = 0;
    }
    
    public Node nextNode(Node  enlace){
        if(enlace.getPnext() != null){
            enlace =enlace.getPnext();
            return enlace;                    
        }
        else{
            return null;
        }
    }
    
    public void printList(){
        Node temp = pfirst;
        if (this.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        }
        else{
            
                
            String print = "";             

            for (int i = 0; i< this.getSize(); i++ ){               

                print += temp.getData();
                
                temp = nextNode(temp);               
                
               }
            JOptionPane.showMessageDialog(null,print);
   
            }
    }
    
    public String getInfo(){
        Node temp = pfirst;
        if (this.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        }
        else{
                    
            String print = "";             

            for (int i = 0; i< this.getSize(); i++ ){               

                print += temp.getData() + "\n";
                
                temp = nextNode(temp);               
                
               }
            return print;
   
            }
        return null;
    }
    
    public void deleteAtStart(){
        if (!isEmpty()){
            pfirst = pfirst.getPnext();
            size -= 1;
        }else{
            JOptionPane.showMessageDialog(null,"La lista está vacía");
        }
    }
    
    public void addAtEnd(Node node){
        
        if(!this.isEmpty()){ 
            Node temp = plast;
            temp.setPnext(node);
            plast = node;
        }
        else{
            pfirst = plast = node;
        }
        
        size++;        
        
    }
    
    public Node Search(Object valor){
        if(isEmpty()){
            JOptionPane.showMessageDialog(null,"Lista vacía");
            return null;
        }else{
            Node temp = pfirst;
            for (int i = 0; i < this.getSize(); i++) {
                
                if(valor== temp.getData()){
                    return temp;
                }
                else{
                    temp = temp.getPnext();
                }
            }
        }
            return null;
    }
    
    public int getIndex(Node node){
        if(isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vacía");
            return -1;
        }else{
            Node temp = pfirst;
            int cont = 0;
            while(temp != null){
                
                if (node == temp){
                     return cont;
                     
                }else{
                    temp = temp.getPnext();
                    cont ++;
                }
                
            } return cont;
        }
        
    }
    
    public Node getNode(int posicion){
        if(isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vacía");
            return null;
        }else if(posicion >= this.size){
            JOptionPane.showMessageDialog(null,"Error");
            return null;
        }else{
            Node temp = pfirst;
            
            for (int i = 0; i < posicion; i++) {
                temp = temp.getPnext();
            }return temp;
        }
    }
}
