/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pg.dino;

/**
 *
 * @author Gremlin
 */
public abstract class Workers {

    public Workers(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.index = this.indexNumerator;
        this.indexNumerator+=1;
        
    }
    
    private int index;
    private String name;
    private double salary;
    static int indexNumerator;
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int id) {
        this.index = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
