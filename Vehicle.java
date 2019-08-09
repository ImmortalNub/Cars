import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public abstract class Vehicle extends JPanel implements ActionListener {
	protected int speed;
	protected String type;

	protected JButton btnSpeedUp;
	protected JButton btnSlowDown;
	protected JLabel attribSpeed;
	protected JLabel labelSpeed;
	protected JLabel attribType;

	public Vehicle() {
		this(0, "Vehicle");
	}

	public Vehicle(int speed, String type) {
		this.speed = speed;
		this.type  = type;

		// Layout
		this.setLayout(new BorderLayout(5, 5));
		this.setSize(300, 300);
		this.setVisible(true);

		// Components
		this.initComponents();
		this.graftComponents();
		this.addListeners();
	}

	// Create the components.
	private void initComponents() {
		btnSpeedUp  = new JButton(">>");
		btnSlowDown = new JButton("<<");
		attribSpeed = new JLabel("Speed");
		labelSpeed  = new JLabel("You are going " + this.speed + " MPH.");
		attribType  = new JLabel(this.type);
	}

	// Add components to the layout.
	private void graftComponents() {
		this.add(attribType, BorderLayout.PAGE_START);
		this.add(btnSlowDown, BorderLayout.LINE_START);
		this.add(attribSpeed, BorderLayout.CENTER);
		this.add(btnSpeedUp, BorderLayout.LINE_END);
		this.add(labelSpeed, BorderLayout.PAGE_END);
	}

	// Add listeners to the buttons.
	private void addListeners() {
		btnSlowDown.addActionListener(this);
		btnSpeedUp.addActionListener(this);
	}
	
	// Increase speed by 5 MPH and update speed label.
	public void speedUp() {
		this.speed += 5;
		labelSpeed.setText("You are going " + this.speed + " MPH.");
	}

	// Reduce speed by 5 MPH and update speed label.
	public void slowDown() {
		this.speed -= 5;
		labelSpeed.setText("You are going " + this.speed + " MPH.");
	}

	// Grant functionality to the buttons.
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btnSlowDown)
	 		this.slowDown();
			
		else if (event.getSource() == btnSpeedUp)
	 		this.speedUp();
	}
}
