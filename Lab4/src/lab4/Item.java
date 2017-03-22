/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author alexandru
 */
public class Item implements Serializable{
    File dataFile;
    String name;
    String author;

    public Item(String filePath) {
        
        dataFile = new File(filePath);
        name = "Untitled";
        author = "user";
        if(!dataFile.exists())
        {
            System.err.println("NU");
            throw new CatalogException("No such file:" + dataFile.toString());
        }
    }
    
    public void play() throws IOException, CatalogException
    {
        Desktop a = Desktop.getDesktop();
        try {
        a.open(dataFile);
        } catch (IllegalArgumentException e) {
            //System.err.println("Nu exista fisierul " + dataFile);
            throw new CatalogException("Eroare! Nu exista fisierul " + dataFile);
            //System.err.println("Gata");
        }
    }
    
    @Override
    public String toString()
    {
        return dataFile.toString();
    }
    
}
