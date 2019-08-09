import java.awt.*;
import java.util.*;
import javax.swing.*;

public class MainWindow extends JFrame {
	private Car car;
	private Bike bike;
	private Plane plane;

	public MainWindow() {
		// Program Title
		super("Vehicles");

		// Layout
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);

		// Components
		this.initComponents();
		this.graftComponents();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow window = new MainWindow();
	}

	// Create the vehicles.
	private void initComponents() {
		car   = new Car();
		bike  = new Bike();
		plane = new Plane();
	}

	// Add the vehicles to the window.
	private void graftComponents() {
		this.add(car);
		this.add(bike);
		this.add(plane);
	}
}
