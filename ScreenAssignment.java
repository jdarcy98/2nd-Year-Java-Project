package Assignment;

/**********************************
  Java Assignment
  Jack Darcy - C16357773
  Abusive text content detector
 *********************************/
//Importing all necessary built-in classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

	//A class to implement the screen with ActionListeners
public class ScreenAssignment  extends JFrame implements ActionListener
{
		  // Declaring each GUI component to be used
		  private JPanel titlePanel;
		  private JPanel inputPanel;
		  private JPanel buttonsPanel;
		  private JPanel areaPanel;
		  private JLabel label1;
		  private JButton addbutton; 
		  private JButton deletebutton; 
		  private JButton searchbutton;
		  private JTextField profanityField;
		  private JLabel label2;
		  private ArrayList<String> words = new ArrayList<String>();
	 
		  // Constructor
		  public ScreenAssignment (String title)
		  {
			   //Dimensions had to be set for all in order to fit into the screen properly
			   super(title);
			   setLayout(new FlowLayout());
			   setLocation(250,250);
			   setSize(500,300);
			   
			   //Panel for the heading of the screen
			   titlePanel = new JPanel();
			   titlePanel.setPreferredSize(new Dimension (500,50));
			   add(titlePanel);
			   
			   //Panel for where the user's input will be taken
			   inputPanel = new JPanel();
			   inputPanel.setPreferredSize(new Dimension(500,40));
			   add(inputPanel);
			   
			   //Panel for each of the button's underneath the text field
			   buttonsPanel = new JPanel();
			   buttonsPanel.setPreferredSize(new Dimension(500,40));
			   add(buttonsPanel);
			   
			   //Panel for the message to warn user to erase what they've done for the next user
			   areaPanel = new JPanel();
			   areaPanel.setPreferredSize(new Dimension (500,85));
			   add(areaPanel);
			   
			   //Label for the heading of the screen, made bold so it stands out
			   label1 = new JLabel("Abusive Text Detector");
			   label1.setFont(new Font("Serif", Font.BOLD, 35));
			   add(label1);
			   
			   //Text field to take in swear words and add to file/list
			   profanityField = new JTextField("Search for word");
			   profanityField.setPreferredSize(new Dimension (150,24));
			   add(profanityField);
			   
			   //Button to add swear words entered into text field int file/list
			   addbutton = new JButton("Add bad words to search for");
			   add(addbutton);
			   addbutton.addActionListener(this);	
			   
			   //Button to clear list and file
			   deletebutton	= new JButton("Delete all");
			   add(deletebutton);
			   deletebutton.addActionListener(this);		
			   
			   //Button to search for swear words in posts.txt file
			   searchbutton = new JButton("Search");
			   add(searchbutton);		
			   searchbutton.addActionListener(this);	
			   
			   //Label to inform user to clear the list
			   label2 = new JLabel ("Make sure you clear the list for the next user!");
			   add(label2);

			   //Adding each respective component to their corresponding panel
			   titlePanel.add(label1);
			   inputPanel.add(profanityField);
			   buttonsPanel.add(addbutton);
			   buttonsPanel.add(deletebutton);
			   buttonsPanel.add(searchbutton);
			   areaPanel.add(label2);
			  
			   setVisible(true);
			   		   
		  }//end constructor

		
		//Action listeners
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			//Strings to help pass arguments
			String s1; 
			String s2 = "";
			String s3 = "";
		
			//Action listener for button 1
			if (arg0.getSource() == addbutton)
			{
				//Getting text from the text field to enter into a blank file and blank list with message to confirm
				s1 = profanityField.getText();
				FileSearch fs1 = new FileSearch(s1);
				fs1.writeLine(s1);
				words.add(s1);
							
				JOptionPane.showMessageDialog(this, "just added " + s1.toString());
				
				
				
			}//end button 1
			
			else 
				
			//Action listener for button 2
			if (arg0.getSource() == deletebutton)
			{
				//This writes a blank character to a file to clear it with message to confirm
				String word ="";
				FileSearch fs2 = new FileSearch(word);
				fs2.deleteLine();
				System.out.println("Cleared");	
			}//end button 2
			
			
			else
				
			//Action listener for button 3
			if (arg0.getSource() == searchbutton)
			{
				//Implementing the file to be searched and lines to be read
				FileSearch FileSearch = new FileSearch(words, "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Assignment\\\\src\\\\Assignment\\\\posts.txt");
				FileSearch.openFile();
				FileSearch.LineReader(words, s2);
			}//end button 3
			
		} // end ActionPerformed
			
		
		//Getters and Setter for all GUI components
		public JPanel getTitlePanel() {
			return titlePanel;
		}


		public void setTitlePanel(JPanel titlePanel) {
			this.titlePanel = titlePanel;
		}


		public JPanel getInputPanel() {
			return inputPanel;
		}


		public void setInputPanel(JPanel inputPanel) {
			this.inputPanel = inputPanel;
		}

		public JPanel getButtonsPanel() {
			return buttonsPanel;
		}


		public void setButtonsPanel(JPanel buttonsPanel) {
			this.buttonsPanel = buttonsPanel;
		}


		public JPanel getAreaPanel() {
			return areaPanel;
		}


		public void setAreaPanel(JPanel areaPanel) {
			this.areaPanel = areaPanel;
		}


		public JLabel getLabel1() {
			return label1;
		}


		public void setLabel1(JLabel label1) {
			this.label1 = label1;
		}


		public JButton getaddbutton() {
			return addbutton;
		}


		public void setaddbutton(JButton addbutton) {
			this.addbutton = addbutton;
		}


		public JButton getdeletebutton() {
			return deletebutton;
		}


		public void setdeletebutton(JButton deletebutton) {
			this.deletebutton = deletebutton;
		}


		public JButton getsearchbutton() {
			return searchbutton;
		}


		public void setsearchbutton(JButton searchbutton) {
			this.searchbutton = searchbutton;
		}


		public JTextField getProfanityField() {
			return profanityField;
		}


		public void setProfanityField(JTextField profanityField) {
			this.profanityField = profanityField;
		}


		public JLabel getlabel2() {
			return label2;
		}


		public void setlabel2(JLabel label2) {
			this.label2 = label2;
		}


		public ArrayList<String> getWords() {
			return words;
		}


		public void setWords(ArrayList<String> words) {
			this.words = words;
		}
		

		public JButton getAddbutton() {
			return addbutton;
		}


		public void setAddbutton(JButton addbutton) {
			this.addbutton = addbutton;
		}


		public JButton getDeletebutton() {
			return deletebutton;
		}


		public void setDeletebutton(JButton deletebutton) {
			this.deletebutton = deletebutton;
		}


		public JButton getSearchbutton() {
			return searchbutton;
		}


		public void setSearchbutton(JButton searchbutton) {
			this.searchbutton = searchbutton;
		}


		public JLabel getLabel2() {
			return label2;
		}


		public void setLabel2(JLabel label2) {
			this.label2 = label2;
		}


} // end class

