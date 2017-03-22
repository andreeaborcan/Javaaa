/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import static java.lang.System.exit;

/**
 *
 * @author alexandru
 */
public class CatalogException extends RuntimeException{

    public CatalogException(String s) {
        System.err.println(s);
     //   exit(1);
    }
    
}
