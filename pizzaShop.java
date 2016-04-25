package programminExercise19Pg971;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class pizzaShop extends JApplet implements ItemListener, ActionListener  {
	//Added ActionListener to line above
	private int intBold = Font.PLAIN;
	private int intItalic = Font.PLAIN;
	
	private Color currentColor= Color.black;
	private String currentFontName = "Courier";
	
	private Button calculateJB;  //changed to a button not a jbutton
	
	private JLabel headingL, toppingL, crustL;
	
	private JCheckBox tomatoCB, greenPepperCB, blackOlivesCB, mushroomsCB, eCheeseCB, pepproniCB, sausageCB;
	
	private JRadioButton smallRB, mediumRB, largeRB, crustThinRB, crustMediumRB, crustPanRB;
	
	private ButtonGroup PizzaSizeGroup, PizzaCrustGroup;
	
	JPanel pizzaSize, pizzaToppings;
	JTextArea textArea;
	
	
	
	public void init(){
		//setTitle("Pizza Shop");
		
		Container c = getContentPane();
		c.setLayout(null);
		
		// labels for heading, topping and pizza crust
		headingL = new JLabel ("Welcome to home style pizza shop");
		toppingL = new JLabel("Each topping $1.50");
		crustL = new JLabel("Pizza Type");
		
		// Check boxes with toppings 
		tomatoCB = new JCheckBox("Tomato");
		greenPepperCB = new JCheckBox("Green Pepper");
		blackOlivesCB = new JCheckBox("Black Olives");
		mushroomsCB = new JCheckBox("Mushrooms");
		eCheeseCB = new JCheckBox("Extra Cheese");
		pepproniCB = new JCheckBox("Pepperoni");
		sausageCB = new JCheckBox("Sausage");
		
		// Radio buttons for pizza size
		smallRB = new JRadioButton("Small: $6.50");
		mediumRB = new JRadioButton("Medium: $8.50");
		largeRB = new JRadioButton("Large: $10.00");
		
		//Radio buttons for pizza crust
		crustThinRB= new JRadioButton("Thin Crust");
		crustMediumRB = new JRadioButton("Medium Crust");
		crustPanRB = new JRadioButton("Pan Crust");
		
		//Calculate button
		calculateJB = new Button("Total");
		calculateJB.setSize(100, 25);
		headingL.getHorizontalAlignment();
		
		//TextArea 
		textArea = new JTextArea();
		textArea.setSize(200, 200);
		
		//Setting size for checkboxes with toppings
		tomatoCB.setSize(80, 30); 
		greenPepperCB.setSize(150, 30); 
		blackOlivesCB.setSize(150, 30); 
		mushroomsCB.setSize(150, 30);
		eCheeseCB.setSize(200, 30); 
		pepproniCB.setSize(100, 30); 
		sausageCB.setSize(100, 30);
		
		//Setting size for Radiobuttons for pizza size
		smallRB.setSize(110,30);
		mediumRB.setSize(110,30);
		largeRB.setSize(110,30);
		
		//Setting size for radio buttons for pizza type
		crustThinRB.setSize(110,30);
		crustMediumRB.setSize(110,30);
		crustPanRB.setSize(110,30);
		
		//Setting size for for toping label and crust label
		toppingL.setSize(5,5);
		crustL.setSize(5,5);
		
		//Setting location for label for topping and pizza crust 
		toppingL.setLocation(1,10);
		crustL.setLocation(50,10);
		
		//Setting location for Check box for toppings
		tomatoCB.setLocation(10, 70);
		greenPepperCB.setLocation(10, 110);
		blackOlivesCB.setLocation(10, 150);
		mushroomsCB.setLocation(10, 190); 
		eCheeseCB.setLocation(10, 230); 
		pepproniCB.setLocation(10, 270);
		sausageCB.setLocation(10, 310);
		
		//Setting radio button location for pizza size
		smallRB.setLocation(110,130);
		mediumRB.setLocation(110,170);
		largeRB.setLocation(110,210);
		
		//Setting location for pizza crust type
		crustThinRB.setLocation(250,130);
		crustMediumRB.setLocation(250,170);
		crustPanRB.setLocation(250,210);
		
		//Setting location for text box field
		textArea.setLocation(130,300);
		
		//Listener for calculate button
		calculateJB.setLocation(130,270);
		calculateJB.addActionListener(this);  //Changed to actionListener not item listener
		
		//Listeners for check boxes
		tomatoCB.addItemListener(this); 
		greenPepperCB.addItemListener(this); 
		blackOlivesCB.addItemListener(this); 
		mushroomsCB.addItemListener(this);
		eCheeseCB.addItemListener(this); 
		pepproniCB.addItemListener(this); 
		sausageCB.addItemListener(this);
		
		//Listeners for pizza size radio buttons
		smallRB.addItemListener(this);
		mediumRB.addItemListener(this);
		largeRB.addItemListener(this);
		
		//Listeners for pizza crust radio buttons
		crustThinRB.addItemListener(this);
		crustMediumRB.addItemListener(this);
		crustPanRB.addItemListener(this);
		
		
		// adding pizza toppings		
		c.add(tomatoCB); 
		c.add(greenPepperCB);
		c.add(blackOlivesCB);
		c.add(mushroomsCB); 
		c.add(eCheeseCB); 
		c.add(pepproniCB);
		c.add(sausageCB);
		
		//adding pizza size radio buttons
		c.add(smallRB);
		c.add(mediumRB);
		c.add(largeRB);
		
		//adding pizza type radio buttons
		c.add(crustThinRB);
		c.add(crustMediumRB);
		c.add(crustPanRB);
	
		//adding calculate button
		c.add(textArea);
		c.add(calculateJB);
		
		//adding topping label
		c.add(toppingL);
		
		//RadioButton Group for pizza size
		PizzaSizeGroup = new ButtonGroup();
		PizzaSizeGroup.add(smallRB);
		PizzaSizeGroup.add(mediumRB);
		PizzaSizeGroup.add(largeRB);
		
		//Radiobutton Group for Pizza type
		PizzaCrustGroup = new ButtonGroup();
		PizzaCrustGroup.add(crustThinRB);
		PizzaCrustGroup.add(crustMediumRB);
		PizzaCrustGroup.add(crustPanRB);
		
		
	}//init
	
	
	public void paint (Graphics g){
		super.paint(g);
		g.setColor(Color.RED);
		g.drawRoundRect(10, 50, 100, 330, 10, 10);
		g.drawRoundRect(113, 100, 100, 150, 10, 10);
		g.drawRoundRect(250, 100, 100, 150, 10, 10);
		
		g.setFont(new Font (currentFontName, intBold + intItalic, 24));
		g.drawString("Welcome to home style pizza shop", 15, 15);
		
		g.setFont(new Font (currentFontName, intBold + intItalic, 15));
		g.drawString("Each topping $1.50", 5, 50);
		
		g.setFont(new Font (currentFontName, intBold + intItalic, 15));
		g.drawString("Pizza Size", 115, 100);
		
		g.setFont(new Font (currentFontName, intBold + intItalic, 15));
		g.drawString("Pizza type", 250,100);
		
		
		
		
	}//paint
	
	public void actionPerformed(ActionEvent event)
	{
		double total=0;
		String text = "Items selected are:\n";
		JCheckBox check;
		//Added this to make sure I entered this method when the button is clicked
		//You can remove or comment out
		System.out.println("In Listener");  
			
		if (tomatoCB.isSelected())
		{
			total=total+1.50;
			text= text + "Tomato,\n "; //You can build it like this (simpler)
		}
		
		if (greenPepperCB.isSelected())
		{
			total=total+1.50;
			text= text + "Green Peppers, \n"; //You can build it like this (simpler)
		}
		
		if (blackOlivesCB.isSelected())
		{
			total=total+1.50;
			text= text + "Black Olives, \n";
		}
		
		if (mushroomsCB.isSelected())
		{
			total=total+1.50;
			text= text + "Mushrooms, \n";
		}
		
		if (eCheeseCB.isSelected())
		{
		
			total=total+1.50;
			text= text + "Extra Cheese, \n";
		}
		
		if (pepproniCB.isSelected())
		{
			total=total+1.50;
			text= text + "Pepperoni, \n";
		}
		
		if (sausageCB.isSelected())
		{
			total=total+1.50;
			text= text + "Sausage, \n";
		}
		
		if (smallRB.isSelected())
		{
			total=total+6.50;
			text= text + "Small Pizza, \n";
		}
		
		if (mediumRB.isSelected())
		{
			total=total+8.50;
			text= text + "Medium Pizza, \n";
		}
		
		if (largeRB.isSelected())
		{
			total=total+10.00;
			text= text + "large Pizza, \n";
			
		}
		
		if (crustThinRB.isSelected())
		{
			text=text+ "Thin crust pizza \n";
		}
		
		if (crustMediumRB.isSelected())
		{
			text=text+ "Medium crust pizza \n";
		}
		
		if (crustPanRB.isSelected())
		{
			text=text+ "Pan pizza \n";
		}
		
		//Make sure you add all of the text and total values to your text area someplace down here.
		textArea.append(" ");
		textArea.append("\nTotal for selected items is: "+total+"\n" +text);
		textArea.append(" ");
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}//class
