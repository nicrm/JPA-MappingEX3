/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaexer3;

import javax.persistence.Persistence;

/**
 *
 * @author Nicolai
 */
public class JPAExer3 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persistence.generateSchema("JPAExer3PU", null);
    }
    
    
}
