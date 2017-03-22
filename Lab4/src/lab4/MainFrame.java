/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * qa
 *
 * @author ada
 */
public class MainFrame extends JFrame {

    ControlPanel controlPanel;
    ItemForm itemForm;
    CatalogList catalogList;
    public MainFrame(String title) {
        super(title);

        setSize(300, 350);
        this.setLayout(new GridLayout(3, 1));
        //itemForm.setVisible(true);
        controlPanel = new ControlPanel();
        itemForm = new ItemForm();
        catalogList=new CatalogList();
        this.add(itemForm);
        this.add(catalogList);
        this.add(controlPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        itemForm.add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectionButtonPressed();
            }

            private void selectionButtonPressed() {
                catalogList.addItem("Nume item: " + itemForm.text.getText() + "  anul: " + itemForm.an.getValue());
            }
        });

        this.setVisible(true);

    }

    public MainFrame() throws HeadlessException {
    }

    @Override
    public boolean action(Event event, Object o) {
        return super.action(event, o); //To change body of generated methods, choose Tools | Templates.
    }

}
