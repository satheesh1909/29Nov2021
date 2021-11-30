import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class file_system {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();  
		System.out.println(str);//reads string  
		String fname =input(str);
		System.out.println(str);
		// TODO Auto-generated method stub
		//String fname ="C:/Users/kmss949/Box Sync/Application Support/CAP/Docs/Nov 2019/LDMS_001_00121752.docx"; 
		//String fname ="C:/Users/kmss949/Box Sync/Application Support/CAP/Docs/Nov 2019/";
		File f = new File(fname); 
		System.out.println("File name :"+f.getName());
		 System.out.println("Path: "+f.getPath()); 
	        System.out.println("Absolute path:" +f.getAbsolutePath()); 
	        System.out.println("Parent:"+f.getParent()); 
	        System.out.println("Exists :"+f.exists()); 
	        System.out.println("Is writeable:"+f.canWrite()); 
            System.out.println("Is readable"+f.canRead()); 
            System.out.println("Is a directory:"+f.isDirectory()); 
            System.out.println("File Size in bytes "+f.length()); 
            System.out.println("File last Modified "+ format(f.lastModified())); 
            System.out.println(format(System.currentTimeMillis()));
            //System.out.println(f.list());
            //f.listRoots()
            //System.out.println( f.listRoots());
            String[] filelist = f.list();
            
            for (String files : filelist)
            {
            	System.out.println(files);
            }
     
                        
            if (format(f.lastModified()).compareTo(format(System.currentTimeMillis()))<0)
            {
            	   System.out.println("OK");
            }
            	   else 
            	   {
            	System.out.println("Not OK"); 
            	   }
            }
            	
    
	
	public static String format(long time) {
		    DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		    return sdf.format(new Date(time));
		  }
	
	public static String input(String path)
	{
		path.replace("//","\\");
		
		return path;
		
	}
	}


