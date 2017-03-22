/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author ada
 */
public class CatalogList extends JList {
    DefaultListModel<String> model = new DefaultListModel<>();
    public CatalogList() {
        this.setBorder(BorderFactory.createTitledBorder("Catalog Items"));
        this.setModel(model);        
    }    
    public void addItem(String item) {
        model.addElement(item);
    }
}
