/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists.and.on.pkgclass.associations;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class Numbers {
    
    private static int userInput;
    private static ArrayList<Double> num;
    private static ArrayList<Double> square;
    private static ArrayList<Double> root;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        NumberFormat numberFormat = new DecimalFormat("###.00");
        userInput = Integer.parseInt(JOptionPane.showInputDialog("Choose a number:"));
        num = new ArrayList<>();
        square = new ArrayList<>();
        root = new ArrayList<>();
        
        for (int i = 0; i < userInput; i++) {
            num.add((double) i);
            square.add((double) (i * i));
            root.add(Math.sqrt(i));
        }
        
        for (int i = 0; i < userInput; i++) {
            System.out.println(i + " : " + num.get(i)
                    + " : " + square.get(i) + " : "
                    + numberFormat.format(root.get(i)));
        }
        
        System.out.println("Sum of arraylist items: " + sum(num));
        System.out.println("Sum of square of arraylist items: " + sum(square));
        System.out.println("Sum of square root of arraylist items: " + sum(root));
        System.out.println("Sum of formatted square root of arraylist items: " + numberFormat.format(sum(root)));
    }
    
    private static double sum(ArrayList<Double> list) {
        double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
    
}
