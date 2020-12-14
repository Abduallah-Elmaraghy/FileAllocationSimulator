/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FileAllocationSimulator;

import java.util.ArrayList;

/**
 *
 * @author Mi8a
 */
public class AllocationMethods 
{
    private ContiguousAllocation MyMethod = new ContiguousAllocation();
    private ArrayList<MyFile> Files;

    public ArrayList<MyFile> getFiles() 
    {
        return Files;
    }

    public void setFiles(ArrayList<MyFile> Files)
    {
        this.Files = Files;
    }
    
    void Run()
    {
        for (MyFile File : Files) 
        {
            int remainder = MyMethod.getDisk_Capacity()- MyMethod.getDisk_Size();// ba2y ad eh
            if(remainder == 0)
            {
                return;
            }
            else if(remainder < File.getFilesize()) // msh hynf3 yt3mlha allocate
            {
               continue;
            }
            else
            {
                MyMethod.getDisk_Blocks().add(File.getFilename()); //b3mlha allocate
                File.setAllocated(true);
                File.setStartingblock(MyMethod.getDisk_Size());// awel block fady
                MyMethod.setDisk_Size(MyMethod.getDisk_Size()+File.getFilesize());
                File.setEndingblock(MyMethod.getDisk_Size()-1);
            }
        }
    }

    public AllocationMethods(int  DiskCapacity) 
    {
        MyMethod.setDisk_Capacity( DiskCapacity);
    }    
}
