/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FileAllocationSimulator;
import File.*;
import java.util.ArrayList;

/**
 *
 * @author Mi8a
 */
public class AllocationMethods 
{
    private ContiguousAllocation ContiguousMethod = new ContiguousAllocation();
    private IndexedAllocation IndexedMethod = new IndexedAllocation();
    private LinkedAllocation LinkedMethod = new LinkedAllocation();
    private ArrayList<IndexedFile> I_Files;// hatetb3etly m el main 
    private ArrayList<LinkedFile> L_Files;// hatetb3etly m el main 
    private ArrayList<ContiguousFile> C_Files;// hatetb3etly m el main 
    ArrayList<Boolean> DiskBlock;
    
    void RunContiguous()
    {
        for (ContiguousFile File : C_Files) 
        {
            int remainder = ContiguousMethod.getDisk_Capacity()- ContiguousMethod.getDisk_Size();// ba2y ad eh
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
                ContiguousMethod.getDisk_Blocks().add(File.getFilename()); //b3mlha allocate
                File.setAllocated(true);
                File.setStartingblock(ContiguousMethod.getDisk_Size());// awel block fady
                ContiguousMethod.setDisk_Size(ContiguousMethod.getDisk_Size()+File.getFilesize());
                File.setEndingblock(ContiguousMethod.getDisk_Size()-1);
            }
        }
    }
    
    void RunIndexed()
    {
        DiskBlock=IndexedMethod.getDisk_Blocks();
        for (int i=0;i<I_Files.size();i++)//for loop btemshy 3ala kol el files 
        {
            for(int j=0;j<I_Files.get(i).getFilesize();j++)//for loop btmsy 3ala  kol block tshof hyb2a allocated fen
            {
                int remainder = IndexedMethod.getDisk_Capacity()- IndexedMethod.getDisk_Size();// ba2y ad eh mn el blocks
                if(remainder == 0)
                {
                    return;
                }
                else if(remainder < I_Files.size()) // msh hynf3 yt3mlha allocate
                {
                    continue;
                }
                else
                {
                    int d=IndexedMethod.getRandomDiskBlock();//by3ml random block
                    while(!DiskBlock.get(d))
                    {
                       d=IndexedMethod.getRandomDiskBlock();//bgeb desk block fadya 
                    }
                    DiskBlock.set(d, true);// 3mlna allocation
                    IndexedMethod.getLocations().set(i,d);//
                    IndexedMethod.getLocations().add(d); // 3amlna set ll disk ano allocated
                    IndexedMethod.setDisk_Size(IndexedMethod.getDisk_Size()+1);
                }
            }
        }
    }
    void RunLinked()
    {
        DiskBlock=LinkedMethod.getDisk_Blocks();
        for (int i=0;i<L_Files.size();i++)//for loop btemshy 3ala kol el files 
        {
            for(int j=0;j<L_Files.get(i).getFilesize();j++)//for loop btmsy 3ala  kol block tshof hyb2a allocated fen
            {
                int remainder = LinkedMethod.getDisk_Capacity()- LinkedMethod.getDisk_Size();// ba2y ad eh mn el blocks
                if(remainder == 0)
                {
                    return;
                }
                else if(remainder < L_Files.size()) // msh hynf3 yt3mlha allocate
                {
                    continue;
                }
                else
                {
                    int d=LinkedMethod.getRandomDiskBlock();//by3ml random block
                    while(!DiskBlock.get(d))
                    {
                       d=LinkedMethod.getRandomDiskBlock();//bgeb desk block fadya 
                    }
                    DiskBlock.set(d, true);// 3mlna allocation
                    LinkedMethod.setDisk_Size(LinkedMethod.getDisk_Size()+1);
                    
                }
            }
        }
    }
    public AllocationMethods(int choice,ArrayList<Integer>  Disk) 
    {
        switch(choice)
        {
            case 1:
                ContiguousMethod.setDisk_Capacity(Disk.size());
                break;
            case 2:
                IndexedMethod.setDisk_Capacity(Disk.size());
                break;
            case 3:
                
            default:
                
        }
    }    
}