/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileAllocationSimulator;

import java.io.Serializable;

/**
 *
 * @author Eng
 */
public class MyFile implements Serializable
{
    
    private String filename;
    private int size;
    private int startingblock;
    private int endingblock;
    private int filesize;
    private boolean allocated = false;

    public String getFilename() 
    {
        return filename;
    }

    public void setFilename(String filename) 
    {
        this.filename = filename;
    }
    
    public int getSize() 
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int getStartingblock() 
    {
        return startingblock;
    }

    public void setStartingblock(int startingblock) 
    {
        this.startingblock = startingblock;
    }

    public int getEndingblock() 
    {
        return endingblock;
    }

    public void setEndingblock(int endingblock) 
    {
        this.endingblock = endingblock;
    }

    public int getFilesize() 
    {
        return filesize;
    }

    public void setFilesize(int filesize) 
    {
        this.filesize = filesize;
    }

    /**
     * @return the allocated
     */
    public boolean isAllocated() {
        return allocated;
    }

    /**
     * @param allocated the allocated to set
     */
    public void setAllocated(boolean allocated) {
        this.allocated = allocated;
    }
}
