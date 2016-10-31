/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists.and.on.pkgclass.associations;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 */
public class ProductApplication {

    static ArrayList<Product> products = new ArrayList<>();
    private static int choice;
    private static int itemNumber;
    private static String productDisplay;

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            products.add(new Product(i, JOptionPane.showInputDialog("Enter Product name:"), (Double.parseDouble(JOptionPane.showInputDialog("Enter unit cost:")))));
        }

        //System.out.println("code, product, cost");
        productDisplay = "code,     product,    cost\n";
        for (int i = 0; i < products.size(); i++) {
            /*System.err.print(products.get(i).getCODE() + ", ");
            System.err.print(products.get(i).getName() + ", ");
            System.err.println(products.get(i).getUnitcost());*/
            productDisplay = productDisplay + products.get(i).getCODE() + ", ";
            productDisplay = productDisplay + products.get(i).getName() + ", ";
            productDisplay = productDisplay + products.get(i).getUnitcost() + "\n";
        }
        JOptionPane.showMessageDialog(null, productDisplay);
        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog("Enter code number (-1 to Quit):"));
            if (choice >= 0 && choice < 4) {
                itemNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter number of items:"));
                JOptionPane.showMessageDialog(null, "Total cost : £" + products.get(choice).getCost(itemNumber));
            } else {
                JOptionPane.showMessageDialog(null, "Wrong code number. try again!");
            }
        } while (choice != -1);
    }
}
