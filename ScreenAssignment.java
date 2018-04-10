package Assignment;

/**********************************
 * Java Assignment
 * Jack Darcy - C16357773
 * Abusive text content detector
 *********************************/

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

	public class ScreenAssignment  extends JFrame implements ActionListener
	{

		  // Declare GUI components as attributes of the screen
		  private JButton button1; 
		  private JButton button2; 
		  private JButton button3; 
		  private JTextField profanityField;
		  private JTextArea output;
		  private ArrayList<SwearWords> words = new ArrayList();
	 
		  // Constructor
	  
		  public ScreenAssignment (String title)
		  {
			   super(title);
			   setLayout(new FlowLayout());
			   profanityField 	= new JTextField("Search for word");

			   
			   
			   button1 	= new JButton("Add bad words to search for");
			   button2 	= new JButton("Show all");
			   button3 	= new JButton("Delete all");
			   
			   
			   add(profanityField);

			   add(button1);
			   add(button2);
			   add(button3);

			   button1.addActionListener(this);
			   button2.addActionListener(this);
			   button3.addActionListener(this);

				output = new JTextArea ("data will go here");
				add(output);

			   
			   setLocation(300,300);
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
				
				// button 2- print out all the array contents
				
			
			    displayContents();
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
			{
				// must be the last button - to clear the contents
				words.clear();
				System.out.println("Cleared");

				
			}
	
			
				
		 
		}  // end ActionPerformed


		private void displayContents() {

		}
		
		  
} // end class




