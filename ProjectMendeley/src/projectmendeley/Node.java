/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmendeley;

/**
 *
 * @author Svetlana Valentina
 */
public class Node {
    private Node pnext;
    private Object data;

    public Node(Object data) {
        this.pnext = null;
        this.data = data;
    }

    /**
     * @return the pnext
     */
    public Node getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(Node pnext) {
        this.pnext = pnext;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }
    
    
}
