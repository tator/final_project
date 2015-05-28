package final_project;
import javax.swing.JFrame;
import java.awt.Component;

public class Slot_Machine extends JFrame {
	protected static final int WIDTH = 800;
	protected static final int HEIGHT = 600;

	public Slot_Machine() {
		super("SLOT MACHINE");
		setSize(WIDTH, HEIGHT);

		Machine theGame = new Machine();
		((Component) theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Slot_Machine run = new Slot_Machine();
	}
}