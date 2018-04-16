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
	private ArrayList<String> words;
	Scanner sc;
	
	// the constructor just takes in the file name
	public FileSearch (ArrayList<String> words, String fileName)
	{
		this.words = new ArrayList<String>(words);
		this.fileName = fileName;
	}
	
	// open/ connect to the file.
	public void openFile()
	{
		fleExample = new File(fileName);
	}
	
	// read a line from the file, return the line as a String
	public void readLine(ArrayList<String> words, String fileName)
	{		
			String line1 = "Word does not exist";
			String line2 = "Post is not abusive";
			//Scanner sc = null;
			int count = 0;
		    try
		    {
		    	//List<String> list = new ArrayList<>();
		       sc = new Scanner(fleExample);
		        while(sc.hasNext())
		        {
		        	String nextword = sc.next();
		        	//list.add(sc.next());
		        	//System.out.println(list);
		      
		        
		        	for(int i=0; i<words.size(); i++)
		        	{
		        		if(nextword.contains(words.get(i)))
		        		{
		        			line1 = "Word exists";
		        			count++;
		        		}
		        		

	        			if(count > 2)
	        			{
	        				line2 = "Post is abusive";
	        			}
		        	}
		        	
		        }	
		        	
		    } 
		    
		    catch (Exception ex)
		    {
		        System.out.println(ex.getMessage());
		    }

		    System.out.println(line1);
			System.out.println(line2);
			  
	} // readLine


} // end class	  


	


