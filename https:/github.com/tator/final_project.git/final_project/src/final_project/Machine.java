package final_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import static java.lang.Character.*;

import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Machine extends Canvas implements KeyListener, Runnable {
	ArrayList<reel> reels;
	private boolean[] keys;
	private BufferedImage back;

	public Machine() {
		setBackground(Color.black);

		keys = new boolean[5];
		reels = new ArrayList<reel>();
		reels.add(new reel());
		reels.add(new reel());
		reels.add(new reel());
		setReels();
		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true);
	}

	public void setReels(){
		try {
			Scanner z = new Scanner(new File("data/reels.dat"));
			while(z.hasNextLine()){
				String b = z.nextLine();
				System.out.println(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		Graphics2D twoDGraph = (Graphics2D) window;
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));
		Graphics graphToBack = back.createGraphics();
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {

		repaint();
	}

	public void keyReleased(KeyEvent e) {

		repaint();
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(5);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}
