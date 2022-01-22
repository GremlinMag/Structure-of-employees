/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pg.dino;

/**
 *
 * @author Gremlin
 */
public class OfficeWorker extends Office implements Promote {

    public OfficeWorker(String name, double salary, DepartmentList department) {
        super(name, salary);
        this.department = department;
    }
    
    private DepartmentList department;
    
    public DepartmentList getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentList department) {
        this.department = department;
    }
    
    @Override
    public void promote() {
        this.setSalary(this.getSalary()+100);
    }
    
    @Override
    public String toString() {
        String str = ("Id: " + this.getIndex() + "\tNazwa: "+this.getName()+"\tWypłata: "+this.getSalary()+"\tNr komputera: "+this.getComputerNumber()+"\tDział: "+this.getDepartment());
        return str;
    }
}
