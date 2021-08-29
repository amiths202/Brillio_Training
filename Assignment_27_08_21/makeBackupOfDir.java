package Assignment_27_08_21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import Assignment_24_08_21.Read;

public class makeBackupOfDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File API - It supports File Administration
        String originalPathName,backupPathName;
        System.out.println("Enter path of directory to backup: ");
        originalPathName = Read.sc.nextLine();
        File originalPath = new File(originalPathName);
        System.out.println("Enter path of directory to backup: ");
        backupPathName = Read.sc.nextLine();
        File backupPath = new File(backupPathName);
        try {
			makeBackupOfDir.makeBackupScratch(originalPath,backupPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to read data at original path. Try again! ");
		}

        
	}
	
	public static void makeBackupScratch(File originalPath, File backupPath) throws IOException {
		if(originalPath.exists())
        {
            if(originalPath.isDirectory()) //To check if the File is Folder
            {
                String[] fileNames = originalPath.list();
                boolean bool = backupPath.mkdir();
                if(bool){
                	for(String file:fileNames)
                	{
                		FileInputStream f1 = new FileInputStream(originalPath + File.separator + file);  //Read Mode
                    	File backupFile = new File(file);
                    	backupFile.createNewFile(); // if file already exists will do nothing 
                    	FileOutputStream f2 = new FileOutputStream(backupPath + File.separator + backupFile, false); //Write Mode
                        int n1;
                        while((n1=f1.read())!=-1)  //n1 is the byte returned
                        // -1 indicates the EOF
                        {
                            f2.write(n1);
                        }
                        f1.close();
                        f2.close();
                    }
                	System.out.println("\nJob Over");
                }
                else {
                	System.out.println("Sorry couldn’t create backup directory");
                	}
                    
                } else {
                	System.out.println("Original path " + originalPath + " is not a folder!");
                }

                //Assignment : Using this try to implement the BackUp of a Folder
            } else {
            	System.out.println("Original path " + originalPath + " doesn't exist!");
            }
            
        }
      
	}
