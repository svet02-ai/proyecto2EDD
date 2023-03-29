/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmendeley;

/**
 *
 * @author macbookpro
 */
public class kArray {
    
    private String keyword;
    private String title;
    private List titles;

    public kArray(String keyword, String title) {
        this.keyword = keyword;
        this.title = title;
    }
    
    public kArray(String keyword)
    {
        this.keyword = keyword;
        this.titles = new List();
    }
    

    /**
     * @return the keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword the keyword to set
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * @return the title
     */
    public String getTitulo() {
        return title;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String title) {
        this.title = title;
    }

    /**
     * @return the titles
     */
    public List getTitulos() {
        return titles;
    }

    /**
     * @param titles the titles to set
     */
    public void setTitulos(List titles) {
        this.titles = titles;
    }
    
}
