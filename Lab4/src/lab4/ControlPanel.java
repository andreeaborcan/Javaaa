/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author ada
 */
public class ControlPanel extends JPanel {

    /*
    mediaframe extends jvrame cu overrite la frameint(initializam frame-ul) aici avem un obiect ItemForm (pack)+ob  de tip CatalogList
    in ControlPanel avem butoanele load, save (fara functionalitate)
     */
    JButton SAVE = new JButton();
    JButton LOAD = new JButton();

    public void arange() {

        this.setLayout(new GridLayout(3, 4, 19, 10));
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

    }

    public ControlPanel() {
        setLayout(new GridLayout(1, 2));
        SAVE.setText("SAVE");
        add(SAVE);
        LOAD.setText("LOAD");
        add(LOAD);
        setBackground(Color.GRAY);

    }

}
