/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pg.dino;

/**
 *
 * @author Gremlin
 */
public class Management extends Office implements Promote {

    public Management(String name, double salary, DepartmentList manageDepartment) {
        super(name, salary);
        this.manageDepartment = manageDepartment;
    }
    
    private DepartmentList manageDepartment;
    
    public DepartmentList getManageDepartment() {
        return manageDepartment;
    }

    public void setManageDepartment(DepartmentList manageDepartment) {
        this.manageDepartment = manageDepartment;
    }
    
    @Override
    public void promote() {
        this.setSalary(this.getSalary()+100);
    }
    
    @Override
    public String toString() {
        String str = ("Id: " + this.getIndex() + "\tNazwa: "+this.getName()+"\tWypłata: "+this.getSalary()+"\tNr komputera: "+this.getComputerNumber()+"\tZarządza działem: "+this.getManageDepartment());
        return str;
    }
}
