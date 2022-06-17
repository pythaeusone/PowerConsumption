package de.musti;

import java.awt.EventQueue;


public class Main {

	public static void main(String[] args) {
		
		MainView frame = new MainView();
		buildView(frame);		

	}
	
	private static void buildView(MainView frame) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
