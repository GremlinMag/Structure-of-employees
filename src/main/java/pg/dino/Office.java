/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pg.dino;

/**
 *
 * @author Gremlin
 */
public class Office extends Workers  {

    public Office(String name, double salary) {
        super(name, salary);
        this.computerNumber = this.indexNumerator;
        this.indexNumerator+=1; 
    }
    
    private int computerNumber;
    static int indexNumerator;
    
    public int getComputerNumber() {
        return computerNumber; 

    }

    public void setComputerNumber(int computerNumber) {
        this.computerNumber = computerNumber;
    }
}
