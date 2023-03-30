/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmendeley;

import javax.swing.JOptionPane;

/**
 *
 * @author macbookpro
 */
public class hashTable {
    
    int tableSize = 0;
    private int numElements;
    private double factorCarga;
    private summary[] table;
    private kArray[] table2;
    
    // CONSTRUCTOR \\

    public hashTable() {
        tableSize = 23;
        table = new summary[this.tableSize];
        for (int i = 0; i < this.tableSize; i++) {
            this.table[i] = null;
        }
        this.numElements = 0;
        this.factorCarga = 0.0;
         
    }
    
    // CONSTRUCTOR 2 \\   
    
    public hashTable(String aux) 
    {
    tableSize = 43;
    table2 = new kArray[this.tableSize];
        for (int i = 0; i < this.tableSize; i++) 
        {
            this.table2[i] = null;
        }
        this.numElements = 0;
        this.factorCarga = 0.0;
    }
   

    // GETTERS Y SETTERS \\

    public int getTableSize() {
        return tableSize;
    }

    public void setTableSize(int tableSize) {
        this.tableSize = tableSize;
    }

    public int getNumElements() {
        return numElements;
    }

    public void setNumElements(int numElements) {
        this.numElements = numElements;
    }

    public double getFactorCarga() {
        return factorCarga;
    }

    public void setFactorCarga(double factorCarga) {
        this.factorCarga = factorCarga;
    }

    public summary[] getTable() {
        return table;
    }

    public void setTable(summary[] table) {
        this.table = table;
    }

    public kArray[] getTable2() {
        return table2;
    }

    public void setTable2(kArray[] table2) {
        this.table2 = table2;
    }
    
    
       
    // ASIGNAR LAS CLAVES \\
    
    public int direction(String clave){
        int i =0;
        int index;
        long valorInicial;
        
        valorInicial = changeKey(clave); 
        
        index = (int)(valorInicial % this.tableSize); //ARITMÉTICA MODULAR
        
        while((this.table)[index] != null && !((this.table)[index].getTitle().equals(clave))){
            i++;
            index = index + i*i;
            index = index % this.tableSize;
            
        }
        return index;
    }
    
        public int direction2(String clave)
        {
        int i =0;
        int index;
        long valorInicial;
        
        valorInicial = changeKey(clave); 
        
        index = (int)(valorInicial % this.tableSize); //ARITMÉTICA MODULAR
        
        while((this.table2)[index] != null && !((this.table2)[index].getKeyword().equals(clave)))
        {
            i++;
            index = index + i*i;
            index = index % this.tableSize;
            
        }
        return index;
        }
    
    public long changeKey(String clave){
        long d = 0;
        
        for (int i = 0; i < clave.length(); i++) {
            d += (i+1) * (int)clave.charAt(i); //ASCII
        }
        
        if(d<0) { //se supera el máximo de int y se generan numeros negativos 
            d = -d; //se convierte en positivo dicho numero            
        }
        return d;
    }
    
    public void insert(summary resumen){
        int posicion;
        posicion = direction(resumen.getTitle());
        (this.getTable())[posicion] = resumen;
        this.numElements++;
        this.factorCarga = (double)(this.numElements)/this.tableSize;
        if(this.factorCarga > 0.5){
            JOptionPane.showMessageDialog(null, "Conviene aumentar el tamanho");
        }
    }
    
    public void insert2(kArray key)
    {
        int posicion;
        posicion = direction2(key.getKeyword());
        (this.getTable2())[posicion] = key;
        this.numElements++;
        this.factorCarga = (double)(this.numElements)/this.tableSize;
        if(this.factorCarga > 0.5)
        {
            JOptionPane.showMessageDialog(null, "Conviene aumentar el tamanho");
        }
    }

    public summary buscar(String clave){
        summary resumen;
        int index;
        
        index = direction(clave);
        resumen = this.table[index];
        
        if(resumen != null){
            return resumen;
        }
        return resumen;
    } 

    public kArray buscar2(String clave)
    {
        kArray key;
        int index;
        
        index = direction2(clave);
        key = this.table2[index];
        
        if(key != null){
            return key;
        }
        return key;
    } 
    
}
