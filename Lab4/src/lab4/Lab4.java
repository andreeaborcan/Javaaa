/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import sun.print.PathGraphics;

/**
 *
 * @author alexandru
 */
public class Lab4 {

    /**
     * @param args the cmommand line arguments
     */
    public static void main(String[] args) throws IOException, CatalogException {
        MainFrame a=new MainFrame("ceb");
     a.setVisible(true);

        try {
            Item it = new Item("/home/alexandru/asd.mp4");
            Item it2 = new Item("/home/alexandru/Pictures/a.png");
            //Item it3 = new Item("/home/alexandasru/Pigctures/a35.png");
            //it3.play();

            Song s = new Song("Titlu", "/home/alexandru/asd.mp4", 2016, "MAD");
            s.setTitle("ASD");
            Item it4 = new Item("/home/alexandru/Pictures/a.png");
            Catalog c = new Catalog();
            c.add(it);
            c.add(it2);
            c.add(s);
            c.play(0);
            c.play(1);
            c.save("home/alexandru/fisier2");
            c.load("home/alexandru/fisier2");
            c.list();
        } catch (CatalogException ce) {

        }
        //it4.play();
        //c.add(it4);

        /*
        for(Item i:c.getItemList())
        {
            i.play();
        }
         */
    }

}
