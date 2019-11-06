/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan48.kalkulator;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kal = new Kalkulator();
        kal.setValue1(7);
        kal.setValue2(5);
        System.out.println("VALUE 1 = "+ kal.getValue1());
        System.out.println("VALUE 2 = "+ kal.getValue2());
        kal.setNameProject();
        kal.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is \t\t = "+ kal.add(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Minus is \t = "+ kal.minus(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Multiplication is = "+ kal.multiplication(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Division is \t = "+ kal.division(kal.getValue1(), kal.getValue2()));
    }
    
}
