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
public class File 
{
    private String filename;
    private int size;
    private int filesize;
    private boolean allocated = false;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public boolean isAllocated() {
        return allocated;
    }

    public void setAllocated(boolean allocated) {
        this.allocated = allocated;
    }
}
