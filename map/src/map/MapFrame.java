package map;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MapFrame extends JFrame{
	
	MapFrame(){
		
		
		this.add(new Map(),BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
		
	}
	
}
