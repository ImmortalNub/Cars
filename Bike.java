import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Bike extends Vehicle {
	public Bike() {
		this(0, "Bike");
	}

	public Bike(int speed, String type) {
		super(speed, type);
		this.modifyComponents();
	}

	// Update the speed label so that you are biking somewhere as opposed to going somewhere.
	private void modifyComponents() {
		super.labelSpeed.setText("You are biking " + super.speed + " MPH.");
	}

	// Increase speed by 1 MPH and update speed label.
	public void speedUp() {
		super.speed += 1;
		super.labelSpeed.setText("You are biking " + super.speed + " MPH.");
	}

	// Reduce speed by 1 MPH and update speed label.
	public void slowDown() {
		super.speed -= 1;
		super.labelSpeed.setText("You are biking " + super.speed + " MPH.");
	}
}
