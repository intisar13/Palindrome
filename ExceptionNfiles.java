import java.io.File;
import java.util.Scanner;

public class ExceptionNfiles {
    public static void main(String[] args){
    	/**
    	 Creating directory
    	  
    	 **/
    	File dir=new File("C:\\Users\\User\\Desktop\\UPDATE SOFT\\demu");
    	dir.mkdir();
    	String dirlocation=dir.getAbsolutePath();
    	System.out.println(dirlocation);
    	System.out.println(dir.getName());
    	if(dir.delete()) {
    		System.out.println("the file has been deleted");
    	}
    	
    	
    	/**
    	  Creating File
    	 **/
    	File file1=new File("students.txt");
    	File file2=new File("teachers.txt");
    	
    	try {
    		file1.createNewFile();
    		file2.createNewFile();
    		System.out.println("Files are created");
    	}catch(Exception e) {
    		System.out.println(e);
    		
    	}
    	
    	/*
    	 Exception 
    	 */
    	
    	
    	
    	
    	try {
        Scanner input = new Scanner(System.in);
        int num,tem,r,sum=0;
        System.out.println("Enter any number: ");
        num=input.nextInt();
        tem=num;
        
        while(tem!=0){
            r=tem%10;
            sum=sum*10+r;
            tem=tem/10;
            
        }
        System.out.println("Reversed Number= "+sum);
    	}catch(Exception e) {
    		System.out.println("Exception= "+e);
    		System.out.println("Enter only numbers");
        
       
    }
    }
    
}



