package Assignment;

/**********************************
 * Java Assignment
 * Jack Darcy - C16357773
 * Abusive text content detector
 *********************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

	public class ScreenAssignment  extends JFrame implements ActionListener
	{

		  // Declare GUI components as attributes of the screen
		  private JButton button1; 
		  private JButton button2; 
		  private JButton button3; 
		  private JButton button4;
		  private JTextField profanityField;
		  private JTextArea output;
		  private ArrayList<SwearWords> words = new ArrayList();
	 
		  // Constructor
	  
		  public ScreenAssignment (String title)
		  {
			   super(title);
			   setLayout(new FlowLayout());
			   profanityField 	= new JTextField("Search for word");
			   profanityField.setPreferredSize(new Dimension(100,24));
			   add(profanityField);

			   
			   button1 	= new JButton("Add bad words to search for");
			   add(button1);
			   button1.setPreferredSize(new Dimension(200,25));
			   button1.addActionListener(this);
			   
			   button2 	= new JButton("Show all");
			   add(button2);	
			   button2.addActionListener(this);			   
			   
			   button3 	= new JButton("Delete all");
			   add(button3);			   
			   button3.addActionListener(this);		
			   
			   button4 	= new JButton("Search");
			   add(button4);			   
			   button4.addActionListener(this);	
			   

			   output = new JTextArea ("Words to search will go here");
			   add(output);

			   
			   setLocation(250,250);
			   setSize(500,500);
			   setVisible(true);
			   		   
		  }


		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			SwearWords s1; 
			
			if (arg0.getSource() == button1)
			{
				
				s1 = new SwearWords(profanityField.getText());
				words.add(s1);
							
				JOptionPane.showMessageDialog(this, "just added " + s1.toString());
			
			}
			else 
				
			if (arg0.getSource() == button2) 
			{
				
				// 2nd button is used to print out all the words which have been entered in
				
			    showContents();
				String fullOutput = "Words to search for are: " + "\r\n";
				
				
				for (SwearWords element:  words)
				{	
						fullOutput = fullOutput.concat(element.toString() + 
								"\r\n");
				        System.out.println(fullOutput);
				}        
				output.setText(fullOutput);			    
			}
			
			else
				
			if (arg0.getSource() == button3)
			{
				// must be the last button - to clear the contents
				words.clear();
				System.out.println("Cleared");

				
			}
			
			else
			{
			
				// Use the FileReader class created, to read in the text file textvalues.txt as specified in the lab
				// To use the class, we have to create an object of it.  The constructor takes the file name. 					
				FileSearch fileReader = new FileSearch("posts.txt");
				
				// then, use your filereader object to execute the methods you need.
				fileReader.openFile();
				String line = fileReader.readLine();

			}
		} // end ActionPerformed


		private void showContents() {

		}
		
		  
} // end class




