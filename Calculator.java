//Name: Tami Adeduntan 
//Student No: C18327556
//Date: 28/11/2019

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame implements ActionListener {
	//variables
	private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, equals, dot, minus, multi, divide, add, clear, delete, plusminus, back,root, percent, power, inverse;
	private double d1= 0, d2=0,answer = 0, d3;
	String com1="", com2="", comAnswer=""; //store number and answer as strings
	private boolean equalsClicked = false, chosen = false;
	JTextField txt = new JTextField(28);
	int operation = 0;
	
	public Calculator()
	{	
		createCalculator();
	}
	
	
	
	public void createCalculator() {
	
		
		
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new MigLayout("wrap 5")); //setting miglayout
        frame.add(txt, "span"); //adding text box to frame
		txt.setEditable(false); //making text box uneditable
        
		//Creating buttons

		plusminus = new JButton("+/- ");
		root = new JButton("√ _");
		percent = new JButton("%");
		power = new JButton("^");
		inverse = new JButton("1/x ");
				
        back = new JButton("<=");
        clear = new JButton("CE");
        delete = new JButton("C");
        add = new JButton("+");  
        
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        divide =  new JButton("/");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        multi = new JButton("*");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");        
        minus = new JButton("-");     
        button0 = new JButton("0");
        dot = new JButton(" .");
        equals = new JButton("=");
        
        //Adding all the buttons to the frame
        
        //1st row
        frame.add(back);
        frame.add(clear);
        frame.add(delete);
        frame.add(plusminus);
        frame.add(root);  
        
        //2nd row
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(divide);
        frame.add(percent);
        
        //3rd row
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(multi);
        frame.add(power);
        
        //4th row
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);        
        frame.add(minus);
        frame.add(inverse);
        
        //5th row
        frame.add(button0, "span 2 3, growx");
        frame.add(dot);
        frame.add(add);
        frame.add(equals);
        
        //Creating classes for the numbers and calculators        
    	Numbers num = new Numbers(); 
    	Calculators calc = new Calculators();
        
    	//Action listener for the number buttons
        button7.addActionListener(num); 
        button8.addActionListener(num);  
        button9.addActionListener(num);   
        button4.addActionListener(num);  
        button5.addActionListener(num);  
        button6.addActionListener(num);  
        button1.addActionListener(num);  
        button2.addActionListener(num);  
        button3.addActionListener(num);  
        button0.addActionListener(num);
        
        //Action listener for the calculating buttons
        back.addActionListener(calc); 
        clear.addActionListener(calc); 
        delete.addActionListener(calc);
        add.addActionListener(calc);
        divide.addActionListener(calc);
        multi.addActionListener(calc); 
        minus.addActionListener(calc); 
        dot.addActionListener(calc); 
        equals.addActionListener(calc);

        
      //Action listener for scientific calculations
        power.addActionListener(calc);
        root.addActionListener(calc);
        inverse.addActionListener(calc);
        plusminus.addActionListener(calc);
        percent.addActionListener(calc);
        
        frame.pack(); 
        frame.setVisible(true);    
        
        //if loop to make sure that 0 will be displayed if the values where the numbers are stored are empty
        if (com1 == null && com2 == null)
		{
			txt.setText("0");
		}
		
  
	}

    public class Numbers implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		
			// Value for 1
		// if loop so that when chosen is false, if com1 is blank it equals one. Otherwise it equals
		//the blank com1 + 1. The same if loop is done with com2 in the same if for chosen.
		//Overall this makes the value of com1 equal 1. I used the same method with the other numbers to make
		//com1 and com2 store their values.
		
			if (source.equals(button1)) { //returns the button 
				if (chosen == false) {
					if (com1 == "") {
						com1 = "1";
					} else 
					{
						com1 = com1 + "1";
					}
				} else {
					if (com2 == "") {
						com2 = "1";
					} else {
						com2 = com2 + "1";
					}
				}
			}
			// Value for 2
			
			if (source.equals(button2)) {
				if (chosen == false) {
					if (com1 == "") {
						com1 = "2";
					} else 
					{
						com1 = com1 + "2";
					}
				} else {
					if (com2 == "") {
						com2 = "2";
					} else {
						com2 = com2 + "2";
					}
				}
			}
			
			//Value for 3
		
			if (source.equals(button3)) {
				if (chosen == false) {
					if (com1 == null) {
						com1 = "3";
					} else 
					{
						com1 = com1 + "3";
					}
				} else {
					if (com2 == null) {
						com2 = "3";
					} else {
						com2 = com2 + "3";
					}
				}
			}
			
			//Value for 4
			if (source.equals(button4)) {
				if (chosen == false) {
					if (com1 == null) {
						com1 = "4";
					} else 
					{
						com1 = com1 + "4";
					}
				} else {
					if (com2 == null) {
						com2 = "4";
					} else {
						com2 = com2 + "4";
					}
				}
			}
			
			//Value for 5			
			if (source.equals(button5)) {
				if (chosen == false) {
					if (com1 == null) {
						com1 = "5";
					} else 
					{
						com1 = com1 + "5";
					}
				} else {
					if (com2 == null) {
						com2 = "5";
					} else {
						com2 = com2 + "5";
					}
				}
			}
			
			//Value for 6
			if (source.equals(button6)) {
				if (chosen == false) {
					if (com1 == null) {
						com1 = "6";
					} else 
					{
						com1 = com1 + "6";
					}
				} else {
					if (com2 == null) {
						com2 = "6";
					} else {
						com2 = com2 + "6";
					}
				}
			}
			
			//Value for 7
			if (source.equals(button7)) {
				if (chosen == false) {
					if (com1 == null) {
						com1 = "7";
					} else 
					{
						com1 = com1 + "7";
					}
				} else {
					if (com2 == null) {
						com2 = "7";
					} else {
						com2 = com2 + "7";
					}
				}
			}
			
			//Value for 8
			if (source.equals(button8)) {
				if (chosen == false) {
					if (com1 == null) {
						com1 = "8";
					} else 
					{
						com1 = com1 + "8";
					}
				} else {
					if (com2 == null) {
						com2 = "8";
					} else {
						com2 = com2 + "8";
					}
				}
			}
			
			//Value for 9
			if (source.equals(button9)) {
				if (chosen == false) {
					if (com1 == null) {
						com1 = "9";
					} else 
					{
						com1 = com1 + "9";
					}
				} else {
					if (com2 == null) {
						com2 = "9";
					} else {
						com2 = com2 + "9";
					}
				}
			}
			
			//Value for 0
			if (source.equals(button0)) {
				if (chosen == false) {
					if (com1 == null) {
						com1 = "0";
					} else 
					{
						com1 = com1 + "0";
					}
				} else {
					if (com2 == null) {
						com2 = "0";
					} else {
						com2 = com2 + "0";
					}
				}
			}
			
			
			// if loop used with the boolean equalsClicked. This loop allows for the numbers to be 
			//displayed by setting the text to the values stored in com1 and com2
			if (equalsClicked == false) 
			{
				if (chosen == false)
				{
				txt.setText(com1);
				}
				else
				{
				txt.setText(com2);
				}
			}
			
			
			
			
			
			
	}
 }
	
    public class Calculators implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		JButton source = (JButton) e.getSource();

    		if(source.equals(add))
    		{
    			chosen = true;
    			operation=1; //sets operation to equal 1
    			txt.setText(""); //sets textfield to blank
    		}

    		else if (source.equals(minus))
    		{
    			chosen = true;
    			operation=2;
    			txt.setText("");
    		}

    		else if (source.equals(divide))
    		{
    			chosen = true;
    			operation=3;
    			txt.setText("");
    		}

    		else if (source.equals(multi))
    		{
    			chosen = true;
    			operation=4;
    			txt.setText("");
    		}

    		else if (source.equals(equals))
    		{
    			chosen = true;
    			double d1 = 0.0, d2 =0.0; 
    			
    			// if com1 is empty then d1 is 0 
    			if (com1.isEmpty())
    				d1 = 0;
    			else //otherwise d1 = com1
    				d1=Double.parseDouble(com1);
    			if (com2.isEmpty()) //if com2 is empty then d2 is 0 
    				d2 = 0;
    			else // otherwise d2 = com2
    				d2=Double.parseDouble(com2);
    			
    			// if com1 is empty and com2 is not empty then com1 = comAnswer 
    			// and d1 equals com1 therefore d1 = comAnswer
    			if (com1.isEmpty() && !com2.isEmpty() ) {
    				com1=comAnswer;
    				d1=Double.parseDouble(com1);
    			}
    			
    			// switch is used to call the operands for the calculations
    			switch(operation)
    			{
    			case 1: answer=d1+d2; // calls operation 1 which is addition
    			break;
    			
    			case 2: answer=d1-d2; // calls operation 2 which is minus;
    			break;
    			
    			case 3: answer=d1/d2; // calls operation 3 which is division
    			break;

    			case 4: answer=d1*d2; // calls operation 1 which is multiplication
    			break;
    			}	
    			
    			comAnswer = Double.toString(answer); //turns answer to a string and makes 
    												 //it equal comAnswer
    			txt.setText(comAnswer); //sets text to comAnswer
    			
    			// sets the coms to blank
    			com1="";
    			com2="";
    		}
    		
    		else if(source.equals(clear))
    		{
    			
    			chosen = true;
    			// if com1 is empty and com2 is not empty then com1 is blank
    			if (com1.isEmpty() && !com2.isEmpty() ) {
    				com1="";
    			}
    			
    			txt.setText(""); // text will be displayed as blank 
    			com2=""; //com2 is set to blank
    			comAnswer=""; //comAnswer is set to blank
    		}
    		
    		else if(source.equals(delete))
    		{
    			//everything is set to null, blank or 0 therefore this deletes everything... numbers,
    			//displays, and operations
    			operation = 0;
    			chosen = false;
    			com1= "";
    			com2="";
    			txt.setText("0");    			    			
    		}
    		
    		//This is same as the methods used for the numbers. However I used "0."
    		// and "." 
    		else if (source.equals(dot)) {
				if (chosen == false) {
					if (com1 == null) {
						com1 = "0.";
					} else 
					{
						com1 = com1 + ".";
					}
				} else {
					if (com2 == null) {
						com2 = "0.";
					} else {
						com2 = com2 + ".";
					}
				}
			}
    		
    		else if (source.equals(back))
    		{
    			chosen = false;
    			
    			// txt is set to the previous sequence of digit that is in the gotten from textfield
    			txt.setText(txt.getText().substring(0, txt.getText().length() - 1)); 
    			
    			if (com1 !=null) //if com1 is not null
    			{
    			   // com1 is the previous sequence digit removed 
    			   com1 = com1.substring(0, txt.getText().length() - 1);
    			}
    			else if (com2!=null) //if com2 is not null
    			{
    				// com2 is the previous sequence digit removed
    				com2 = com2.substring(0, txt.getText().length() - 1);    				
    			}
    			else if (txt.getText() != "")  // if txt is not blank  				
    			{
    				txt.setText("0"); //set the text to display 0
    			}
    			
    			else if (txt.getText() == "") //if txt is blank
    			{
    				txt.setText("0"); //set the text is 0
    			}
    		
    			
    	//Similar to numbers methods except if com1 is blank then the text is set to a minus 
    			// and the text that is in the text field and then com1 equals com1 + 0 otherwise
    			// textfield is set to number in text field. Similar with com2
    		else if (source.equals(plusminus))
    		{
    			if (chosen == true)
    				if (com1 == "") 
    				{
    					txt.setText("-" + txt.getText());
    					com1 = com1 + 0;
    				}
    				else 
    				{
    				txt.setText(txt.getText());
    				}
    			else 
    				if(com2 == "")
    				{
    					txt.setText("-" + txt.getText());
    					com2 = com2 + 0;   					
    				}
    				else 
    				{
    				txt.setText(txt.getText());
    				}
    	    }
    			
    		else if (source.equals(root))
    		{
    			if (txt.getText().equals("")) //if textfield equals blank
    			{
    				txt.setText(""); //text is set to blanl
    			} else
    			{
    				//otherwise d3 is set to the answer of Math.sqrt and the text that is in textfield
    				d3 = Math.sqrt(Double.parseDouble(txt.getText()));
    				txt.setText("");
    				txt.setText(txt.getText() + d3); //text is then set to the text in textfield and d3
    			}
    		}
    }
  }
}
    
    
    
    
    
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) 
	{
		Calculator calculator = new Calculator();
    }
}
