import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Plane extends Vehicle {
	public Plane() {
		this(0, "Plane");
	}

	public Plane(int speed, String type) {
		super(speed, type);
		this.modifyComponents();
	}

	// Update the speed label so that you are flying somewhere as opposed to going somewhere.
	private void modifyComponents() {
		super.labelSpeed.setText("You are flying " + super.speed + " MPH.");
	}

	// Increase speed by 50 MPH and update speed label.
	public void speedUp() {
		super.speed += 50;
		super.labelSpeed.setText("You are flying " + super.speed + " MPH.");
	}

	// Reduce speed by 50 MPH and update speed label.
	public void slowDown() {
		super.speed -= 50;
		super.labelSpeed.setText("You are flying " + super.speed + " MPH.");
	}
}
