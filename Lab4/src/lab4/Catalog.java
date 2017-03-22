/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author alexandru
 */
public class Catalog implements Serializable{
    private ArrayList<Item> itemList;

    public Catalog() {
        itemList=new ArrayList<Item>();
    }
    
    
    public ArrayList<Item> getItemList()
    {
        return itemList;
    }
    
    public void add(Item it)
    {
        itemList.add(it);
    }
    
    public void save(String fileName) throws IOException
    {
        try 
        {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out; 
            out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in " + fileName);
        }
        catch(IOException wi) 
        {
            throw  new CatalogException("cannot write in file for serialization:" + fileName);
            //wi.printStackTrace();
        }
    }
    
    public void play(int index) throws IOException, CatalogException
    {
        if(index < 0 || index >= itemList.size())
        {
            throw new CatalogException("Index out of bounds");
        }
        itemList.get(index).play();
    }
    
    public void load(String fileName)
    {
        Catalog c = new Catalog();
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in;
            in = new ObjectInputStream(fileIn);

            c = (Catalog) in.readObject();
            this.itemList = c.itemList;
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException cc) {
            throw  new CatalogException("cannot read from file for serialization:" + fileName);
            //cc.printStackTrace();
        }
    }

    public void list()
    {
        System.out.println("Catalog:{");
        for(Item it : itemList)
        {
            System.out.println(it.toString());
        }
        System.out.println("}");
    }
    
}
 