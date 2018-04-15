package Assignment;

/**********************************
 * Java Assignment
 * Jack Darcy - C16357773
 * Abusive text content detector
 *********************************/

import java.io.*;
import java.util.*;

public class FileSearch
{

	// Attributes. 
	String fileName;
	File fleExample;
	String searchFile;
	
	// the constructor just takes in the file name
	public FileSearch (String fileName)
	{
		this.fileName = fileName;
	}
	
	// open/ connect to the file. -
	public void openFile()
	{
		fleExample = new File(fileName);
	}
	
	// read a line from the file, return the line as a String
	public String readLine()
	{		
			String line = "no line in file";
			//String word = "wank";
			//Scanner sc = null;
			
		    try
		    {
		    	List<String> list = new ArrayList<>();
		       	Scanner sc = new Scanner(fleExample);
		        //int count = 0;
		        while(sc.hasNext())
		        {
		        	list.add(sc.next());
		        	//System.out.println(list);
		        	
		        }	
		        if(list.contains("wanker"))
		        {
		        	System.out.println("Word exists");
		        }
		        	
		        else
		        {
		        	System.out.println("Word doesnt exist");
		        }

		        sc.close();
		    } 
		    
		    catch (FileNotFoundException e)
		    {
		        System.out.println(e.getMessage());
		    }
		   
		    finally
		    {
		        
		    }
		    

		   return line;
			  
			  
	} // readLine


} // end class	  


	


