/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migueljorge
 */
public class Book {
    
    private String title;
    private int pageNumbers;
    private int publicationYear;
    
    
    public Book(String title, int pageNumbers, int publicationYear ){
        this.title = title;
        this.pageNumbers = pageNumbers;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getPageNumbers(){
        return pageNumbers;
    }
    
    public int getPublicationYear(){
        return publicationYear;
    }
    
    public String toString(){
        return title + ", "+ pageNumbers + " pages, "+publicationYear;
    }
    
}
