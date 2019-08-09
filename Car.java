import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Car extends Vehicle {
	public Car() {
		this(0, "Car");
	}

	public Car(int speed, String type) {
		super(speed, type);
		this.modifyComponents();
	}

	// Update the speed label so that you are driving somewhere as opposed to going somewhere.
	private void modifyComponents() {
		super.labelSpeed.setText("You are driving " + super.speed + " MPH.");
	}

	// Increase speed by 5 MPH and update speed label.
	public void speedUp() {
		super.speed += 5;
		super.labelSpeed.setText("You are driving " + super.speed + " MPH.");
	}

	// Reduce speed by 5 MPH and update speed label.
	public void slowDown() {
		super.speed -= 5;
		super.labelSpeed.setText("You are driving " + super.speed + " MPH.");
	}
}
