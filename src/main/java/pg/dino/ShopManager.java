/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pg.dino;

/**
 *
 * @author Gremlin
 */
public class ShopManager extends Shop {
    
    public ShopManager(String name, double salary, String location, double utarg) {
        super(name, salary, location);
        this.minimalIncome = utarg;
    }
    
    double minimalIncome;
    
    public double getMinimalIncome() {
        return minimalIncome;
    }

    public void setMinimalIncome(double minimalIncome) {
        this.minimalIncome = minimalIncome;
    }
    
    @Override
    public String toString() {
        String str = ("Id: " + this.getIndex() + "\tNazwa: "+this.getName()+"\tWypłata: "+this.getSalary()+"\tLokalizacja: "+this.getLocation()+"\tMinimalny utarg: "+this.getMinimalIncome());
        return str;
    }
    
    
}
