/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

/**
 *
 * @author Mi8a
 */
public class ContiguousFile extends File {
    private int startingblock;
    private int endingblock;

    public int getStartingblock() {
        return startingblock;
    }

    public void setStartingblock(int startingblock) {
        this.startingblock = startingblock;
    }

    public int getEndingblock() {
        return endingblock;
    }

    public void setEndingblock(int endingblock) {
        this.endingblock = endingblock;
    }
    
}
