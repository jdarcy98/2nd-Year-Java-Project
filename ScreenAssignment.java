package Assignment;

/**********************************
  Java Assignment
  Jack Darcy - C16357773
  Abusive text content detector
 *********************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

	public class ScreenAssignment  extends JFrame implements ActionListener
	{

		  // Declare GUI components as attributes of the screen
		  private JPanel panel1;
		  private JPanel panel2;
		  private JPanel panel3;
		  private JPanel panel4;
		  private JLabel label1;
		  private JButton button1; 
		  private JButton button2; 
		  private JButton button3; 
		  private JButton button4;
		  private JTextField profanityField;
		  private JTextArea output;
		  private ArrayList<String> words = new ArrayList<String>();
	 
		  // Constructor
	  
		  public ScreenAssignment (String title)
		  {
			   super(title);
			   setLayout(new FlowLayout());
			   setLocation(250,250);
			   setSize(500,500);
			   
			   panel1 = new JPanel();
			   panel1.setPreferredSize(new Dimension (500,40));
			   panel1.setBackground(Color.RED);
			   add(panel1);
			   
			   panel2 = new JPanel();
			   panel2.setPreferredSize(new Dimension(500,40));
			   add(panel2);
			   
			   panel3 = new JPanel();
			   panel3.setPreferredSize(new Dimension(500,40));
			   add(panel3);
			   
			   panel4 = new JPanel();
			   panel4.setPreferredSize(new Dimension (500,40));
			   add(panel4);
			   
			   label1 = new JLabel("Abusive Text Detector");
			   label1.setForeground(Color.WHITE);
			   add(label1);
			   
			   profanityField = new JTextField("Search for word");
			   add(profanityField);
			   
			   button1 	= new JButton("Add bad words to search for");
			   add(button1);
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


			   panel1.add(label1);
			   panel3.add(profanityField);
			   panel4.add(button1);
			   panel4.add(button2);
			   panel4.add(button3);
			   panel4.add(button4);
			  
			   setVisible(true);
			   		   
		  }


		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			String s1; 
			
			if (arg0.getSource() == button1)
			{
				s1 = profanityField.getText();
				words.add(s1);
							
				JOptionPane.showMessageDialog(this, "just added " + s1.toString());
			}
			else 
				
			if (arg0.getSource() == button2) 
			{
				// 2nd button is used to print out all the words which have been entered in
				
			    showContents();
				String fullOutput = "Words to search for are: " + "\r\n";
				
				
				for (String element:  words)
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
			
			if (arg0.getSource() == button4)
			{
			
				// Use the FileReader class created, to read in the text file textvalues.txt as specified in the lab
				// To use the class, we have to create an object of it.  The constructor takes the file name. 					
				FileSearch FileSearch = new FileSearch(words, "posts.txt");
				
				// then, use your filereader object to execute the methods you need.
				FileSearch.openFile();
				FileSearch.readLine(words, "posts.txt");
				

			}
		} // end ActionPerformed

		public JPanel getPanel1() 
		{
			return panel1;
		}

		public void setPanel1(JPanel panel1)
		{
			this.panel1 = panel1;
		}

		public JPanel getPanel2()
		{
			return panel2;
		}

		public void setPanel2(JPanel panel2)
		{
			this.panel2 = panel2;
		}

		public JPanel getPanel3()
		{
			return panel3;
		}

		public void setPanel3(JPanel panel3)
		{
			this.panel3 = panel3;
		}

		public JPanel getPanel4()
		{
			return panel4;
		}

		public void setPanel4(JPanel panel4)
		{
			this.panel4 = panel4;
		}

		public JLabel getLabel1()
		{
			return label1;
		}

		public void setLabel1(JLabel label1)
		{
			this.label1 = label1;
		}

		public JButton getButton1() 
		{
			return button1;
		}

		public void setButton1(JButton button1)
		{
			this.button1 = button1;
		}

		public JButton getButton2()
		{
			return button2;
		}

		public void setButton2(JButton button2)
		{
			this.button2 = button2;
		}

		public JButton getButton3()
		{
			return button3;
		}

		public void setButton3(JButton button3)
		{
			this.button3 = button3;
		}

		public JButton getButton4()
		{
			return button4;
		}

		public void setButton4(JButton button4)
		{
			this.button4 = button4;
		}

		public JTextField getProfanityField()
		{
			return profanityField;
		}

		public void setProfanityField(JTextField profanityField)
		{
			this.profanityField = profanityField;
		}

		public JTextArea getOutput()
		{
			return output;
		}

		public void setOutput(JTextArea output)
		{
			this.output = output;
		}

		public ArrayList<String> getWords()
		{
			return words;
		}

		public void setWords(ArrayList<String> words)
		{
			this.words = words;
		}

		private void showContents() {

		}
		
		  
} // end class

