/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.util.ArrayList;

/**
 *
 * @author Mi8a
 */
public class IndexedFile extends File
{
    private ArrayList<Integer> index =new ArrayList();

    public ArrayList<Integer> getIndex() {
        return index;
    }

    public void setIndex(ArrayList<Integer> index) {
        this.index = index;
    }
    
}
