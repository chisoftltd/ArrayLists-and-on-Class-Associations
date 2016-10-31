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
 * @author 1609963
 */
public class PressureApplication {

    static ArrayList<Pressure> pressures = new ArrayList<>();

    public static void main(String[] args) {

        Pressure pressure1 = new Pressure(2000, "psi", 0);
        Pressure pressure2 = new Pressure(1450, "psi", 1);

        pressures.add(pressure1);
        pressures.add(pressure2);

        pressures.add(new Pressure(1670, "psi", 2));
        pressures.add(new Pressure(1450, "psi", 3));

        pressures.add(new Pressure((Integer.parseInt(JOptionPane.showInputDialog("Enter pressure"))), (JOptionPane.showInputDialog("Enter unit")),
                (Integer.parseInt(JOptionPane.showInputDialog("Enter time")))));
        for (int i = 0; i < pressures.size(); i++) {
            System.out.println(pressures.get(i).toString());
        }

         for (int i = 0; i < pressures.size(); i++) {
             pressures.get(i).setUnit("Pa");
            System.out.println(pressures.get(i).toString());
        }

    }
}
