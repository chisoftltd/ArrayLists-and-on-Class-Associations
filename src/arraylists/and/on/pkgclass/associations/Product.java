/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists.and.on.pkgclass.associations;

/**
 *
 * @author 1609963
 */
public class Product {

    int CODE;
    String name;
    double unitcost;

    public Product(int CODE, String name, double unitcost) {
        this.CODE = CODE;
        this.name = name;
        this.unitcost = unitcost;
    }

    public int getCODE() {
        return CODE;
    }

    public String getName() {
        return name;
    }

    public double getUnitcost() {
        return unitcost;
    }

    public double getCost(int cost) {
        return cost * getUnitcost();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitcost(double unitcost) {
        this.unitcost = unitcost;
    }

}
