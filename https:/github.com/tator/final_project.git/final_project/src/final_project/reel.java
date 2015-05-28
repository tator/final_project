package final_project;

import java.util.ArrayList;

public class reel {
	ArrayList<slot> reel;

	public reel() {

	}

	public void add(slot a) {
		reel.add(a);
	}

	public void add(int a) {
		reel.add(new slot(a));
	}
	
}
