/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author ada
 */
public class ItemForm extends JPanel{
    JLabel name1=new JLabel();
    JLabel name2=new JLabel();
    JTextField text=new JTextField(1);
    JSpinner an = new JSpinner(new SpinnerNumberModel(1950, 1900, 2017, 1));
    JButton add=new JButton();
    
    public ItemForm() {
        
        //name.setVerticalTextPosition(JLabel.BOTTOM);
       // name.setHorizontalTextPosition(10);
        //setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setLayout(new GridLayout(3, 2));
        name1.setText("NUME: ");
        add(name1);
        add(text);
        text.setSize(new Dimension(200,30));
       
         name2.setText("An: ");
        add(name2);
        add(an);
        setBackground(Color.magenta);
        add.setText("ADD");
        add(add);
        this.setSize(new Dimension(250,200));
        
        
        
    }

    //Jlable,Jtextfield,Jspinner pt an si buton (add)
    
}
