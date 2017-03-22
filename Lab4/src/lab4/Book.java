/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.File;

/**
 *
 * @author ada
 */
public class Book extends Item{
    
    private String title;
    private int year;
    private String author;
    
 
    
    public Book ( String titlu, String filePath,int year, String autor)
    {
        super(filePath);
        this.title=titlu;
        this.year=year;
        this.author=autor;
        if(this.year > 2017 || this.year < 0)
        {
            throw new CatalogException("Year out of bound");
        }
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return title;
    }
     public void setAutor(String author)
    {
        this.author = author;
    }
    
    public int getYear()
    {
        return year;
    }
         public void setYear(int an)
    {
        this.year = an;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
   @Override
    public String toString() {
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new StringBuilder("Titlul: "));
        stringBuilder.append(new StringBuilder(this.title));        
        stringBuilder.append(new StringBuilder("Locatia: "));
        stringBuilder.append(new StringBuilder(this.dataFile.toString()));
        stringBuilder.append(new StringBuilder("\nAnul: "));
        stringBuilder.append(new StringBuilder(this.year));        
        stringBuilder.append(new StringBuilder("\nAutorul: "));
        stringBuilder.append(new StringBuilder(this.author));
       
        return stringBuilder.toString();

    }
    
}