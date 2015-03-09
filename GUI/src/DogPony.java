import java.awt.FlowLayout;

import javax.swing.*;
import java.awt.Font;


public class DogPony extends JFrame {
	public static void main(String [] args){
		new DogPony("DOG AND PONY SHOW");
	}
	
	public JLabel animalLabel;
	public JLabel countLabel;
	public Integer n = 0;
	
	public DogPony (String title){
		super(title);
		setSize(800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		
		animalLabel = new JLabel("Dog");
		animalLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		countLabel = new JLabel("0");
		getContentPane().add (animalLabel);
		
		JButton button = new JButton("Print Pony");
		button.addActionListener(new ButtonPressingResponse(this));
		getContentPane().add(button);
		
		getContentPane().add (countLabel);
		setVisible(true);
	}
}
