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

public class LinkedFile extends File {
    private Node startingblock;
    private class Node
    {
        int block_num;
        Node next;
        public Node(int n)
        {
           block_num =n;
        }
    }

    public Node getStartingblock() {
        return startingblock;
    }

    public void setStartingblock(Node startingblock) {
        this.startingblock = startingblock;
    }
}