package Assignment;

/**********************************
  Java Assignment
  Jack Darcy - C16357773
  Abusive text content detector
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
	private ArrayList<String> lines;
	
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
			String line3 = "This person is not shouting";
			String scanLine = "";
			String[] split;
			//BufferedWriter bu = null;
			//Scanner sc = null;
			int count = 0;
			int count2 = 0;
		    try
		    {
		    	List<String> lines = new ArrayList<>();
		        //sc = new Scanner(fleExample);
		    	File file = new File("C:\\Users\\Admin\\Documents\\eclipse-workspace\\Assignment\\src\\Assignment\\Input.txt");
		        FileWriter write = new FileWriter(file);
		        BufferedWriter bu = new BufferedWriter(write);
		        
		        /*while(sc.hasNext())
		        {
		        	String nextword = sc.next();
		        	//lines.add(sc.next());

		        	//System.out.println(list);*/
		      
		        
		        	for(int i=0; i<words.size(); i++)
		        	{
		        		bu.write(words.get(i));
		        		bu.write(System.getProperty("line.separator"));
		        		
		        		/*if(nextword.contains(words.get(i)))
		        		{
		        			line1 = "Word exists";
		        			count++;
		        		}
		        		

	        			if(count > 3)
	        			{
	        				line2 = "Post is abusive";
	        			}*/
		        	}

		        //}
		        
		        /*while(sc.hasNextLine())
		        {
		        	scanLine = scanLine + sc.nextLine();
		        }
	        	split = scanLine.split("\\.");
	        	int length = split.length;
		        
		        for(int j = 0; j < length; j++)
		        {
		        	String singleWord = split[j];
		        	lines.add(singleWord);
		        	if(singleWord.charAt(j) >= 'A' && singleWord.charAt(j) <= 'Z')
		        	{
		        		count++;
		        		if(count > 9)
		        		{
		        			line3 = "This person is shouting";
		        		}
		        	}
		        }*/
		    } 
		    
		    catch (Exception ex)
		    {
		        System.out.println(ex.getMessage());
		    }

		    System.out.println(line1);
			System.out.println(line2);
			//System.out.println(line3);
			  
	} // readLine


} // end class	  


	


