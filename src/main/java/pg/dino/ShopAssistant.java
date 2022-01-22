/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pg.dino;

/**
 *
 * @author Gremlin
 */
public class ShopAssistant extends Shop {

    public ShopAssistant(String name, double salary, String location, function func) {
        super(name, salary, location);
        this.func = func;
    }
    private function func;
    
    public function getFunc() {
        return func;
    }

    public void setFunc(function func) {
        this.func = func;
    }
    
    @Override
    public String toString() {
        String str = ("Id: " + this.getIndex() + "\tNazwa: "+this.getName()+"\tWypłata: "+this.getSalary()+"\tLokalizacja: "+this.getLocation()+"\tFunkcja w sklepie: "+this.getFunc());
        return str;
    }
    
}
