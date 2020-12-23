package FileAllocationSimulator;

import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mi8a
 */

public class IndexedAllocation 
{
    private ArrayList<Integer> locations = new ArrayList<>();
    private ArrayList<Boolean> Disk_Blocks =new ArrayList() ;
    private int Disk_Capacity;
    private int Disk_Size=0;
    Random random = new Random();
   
    
    
    public ArrayList<Boolean> getDisk_Blocks()
    {
        return Disk_Blocks;
    }

    public void setDisk_Blocks(ArrayList<Boolean> Disk_Blocks) 
    {
        this.Disk_Blocks = Disk_Blocks;
    }
   

    public ArrayList<Integer> getLocations() 
    {
        return locations;
    }

    public void setLocations(ArrayList<Integer> locations) 
    {
        this.locations = locations;
    }

    public int getDisk_Capacity() 
    {
        return Disk_Capacity;
    }

    public void setDisk_Capacity(int Disk_Capacity) 
    {
        this.Disk_Capacity = Disk_Capacity;
    }

    public int getDisk_Size() 
    {
        return Disk_Size;
    }

    public void setDisk_Size(int Disk_Size) 
    {
        this.Disk_Size = Disk_Size;
    }
    public int getRandomDiskBlock()
    {
        return random.nextInt(getDisk_Capacity());
    }    
}