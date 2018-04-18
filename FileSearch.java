package Assignment;

/**********************************
  Java Assignment
  Jack Darcy - C16357773
  Abusive text content detector
 *********************************/
//Importing all necessary built-in classes
import java.io.*;
import java.util.*;

//Class to search through a file which also contains a file writing and a file clearing constructor
public class FileSearch
{

	//Declaring attributes 
	String fileName;
	File fleExample;
	String searchFile;
	private ArrayList<String> words;
	private ArrayList<String> lines;
	String word;
	
	//Constructor to take in the file name (posts.txt)
	public FileSearch (ArrayList<String> words, String fileName)
	{
		this.words = new ArrayList<String>(words);
		this.fileName = fileName;
	}//end first FileSearch
	
	//Constructor to take in a word to an empty file
	public FileSearch(String word)
	{
		this.word = word;
	}//end second FileSearch
	
	//Opens the file
	public void openFile()
	{
		fleExample = new File(fileName);
	}//end openFile
	
	//Reads the user's input and puts each word into an empty file on separate lines
	public void writeLine(String word)
	{
		 BufferedWriter bu = null;
		 try
		 {
		    	File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Assignment\\src\\Assignment\\Input.txt");
		        FileWriter write = new FileWriter(file.getAbsoluteFile(), true);
		        bu = new BufferedWriter(write);
		        
		        bu.write(word);
        		bu.write(System.getProperty("line.separator"));
        		bu.close();
		 }//end try
		 
		 catch (Exception ex)
		 {
		        System.out.println(ex.getMessage());
		 }//end catch
		 
	}//end writeLine
	
	//When the user presses "Delete All" each word is removed and file is empty again
	public void deleteLine()
	{
		BufferedWriter bu = null;
		try
		{
			File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Assignment\\src\\Assignment\\Input.txt");
			FileWriter write = new FileWriter(file);
			bu = new BufferedWriter(write);
			bu.write("");
			bu.close();
		}//end try
		
		catch (Exception ex)
		{
		        System.out.println(ex.getMessage());
		}//end catch
		
	}//end deleteLine
	
	//A method that attempts to search for the inputted words in a file with posts inside
	@SuppressWarnings("unlikely-arg-type")
	public void LineReader(ArrayList<String> words, String fileName)
	{		
			//String line1 = "Word does not exist";
			//String line2 = "Post is not abusive";
			String scanLine = "";
			String path = "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Assignment\\\\src\\\\Assignment\\\\posts.txt";
			BufferedReader buf = null;
			int count = 0;
		    try
		    {
		        buf = new BufferedReader(new FileReader(path));
		        
		        //This loop tries to split the lines in the posts file, and search for the inputted words on each line, but to no avail
		        while((scanLine = buf.readLine()) != null)
		        {
		        	String[] lines = scanLine.split(".");
		        	for(String element : lines)
		        	{
		        		if(element.equals(words))
		        		{
		        			System.out.println("Word exists");
		        			count++;
		        		}
		        		else
		        		{
		        			System.out.println("Word doesn't exist");
		        		}
		        		
	        			if(count > 3)
	        			{
	        				System.out.println("Post is abusive");
	        			}//if
	        			
	        			else
	        			{
	        				System.out.println("Post is not abusive");
	        			}
		        	}//end for
		        }//end while
		        	buf.close(); //Close the reader once finished 
		         
		    }//end try
		    
		    //For exception handling
		    catch(Exception ex)
		    {
		        System.out.println(ex.getMessage());
		    }

		    //System.out.println(line1);
			//System.out.println(line2);
			  
		}//end LineReader

}//end class	  


	


