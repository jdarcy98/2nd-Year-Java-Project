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
			Scanner sc = null;
		    try
		    {
		    	List<String> list = new ArrayList<>();
		        sc = new Scanner(new File("posts.txt"));
		        //int count = 0;
		        if(sc.hasNext())
		        {
		            /*String sen = sc.nextLine();
		            for(int i = 0 ; i < sen.length(); i++)
		            {
		                if(sen.charAt(i) >= 'A' && sen.charAt(i) <= 'Z')
		                {
		                    count++;
		                    if(count >= 10)
		                    {
		                    	System.out.println("This person is shouting");
		                    }
		                }
		            }*/
		        	list.add(sc.next());
		        	//System.out.println(list);
		        	if(list.contains("fuck"))
		        	{
		        		System.out.println("Word exists");
		        	}
		        	
		        	else
		        	{
		        		System.out.println("Word doesnt exist");
		        	}
		        }

		    } 
		    
		    catch (FileNotFoundException e)
		    {
		        System.out.println(e.getMessage());
		    }
		    
		    /*finally
		    {
		        sc.close();
		    }*/
		    
		    /*try
			{
		     // I don't need the scanner in any other method, so I can create it here.
			 Scanner myScanner = new Scanner(fleExample);
			 
			  
			 if (myScanner.hasNextLine())
			    {
			      line = myScanner.nextLine();
			      System.out.println ("I read this line " + line);
			    }

			myScanner.close();
			}
			catch (FileNotFoundException e)
			{
				System.out.println(e.getMessage());
			}*/

		   return line;
			  
			  
	} // readLine


} // end class	  


	


