package Assignment;

/**********************************
 * Java Assignment
 * Jack Darcy - C16357773
 * 
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
		  private JTextField searchTerm;
		  private JTextArea output;
		  //private ArrayList<Person> people = new ArrayList();
	 
		  // Constructor
	  
		  public ScreenAssignment (String title)
		  {
			   super(title);
			   setLayout(new FlowLayout());
			   //searchTerm 	= new JTextField("Search for/ Enter word");

			   
			   
			   //button1 	= new JButton("Search/ add bad word");
			   button2 	= new JButton("Show all");
			   button3 	= new JButton("Delete all");
			   
			   
			   add(searchTerm);

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
			Person p1; 
			
			if (arg0.getSource() == saveButton)
			{
				
					
				p1 = new Person(firstName.getText(), surName.getText(), city.getText());
				people.add(p1);
							
				JOptionPane.showMessageDialog(this, "just added " + p1.toString());
			
			}
			else 
				
			if (arg0.getSource() == showButton) 
			{
				
				// button 2- print out all the array contents
				
			
			    displayContents();
				String fullOutput = "People on the list are: " + "\r\n";
				
				
				for (Person element:  people)
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
				people.clear();
				System.out.println("Did the clear");

				
			}
	
			
				
		 
		}  // end ActionPerformed


		private void displayContents() {

		}
		
		  
} // end class




