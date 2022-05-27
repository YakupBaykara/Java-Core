package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameMain {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Frame");
		frame.setSize(400,400);
		
		JPanel panel = new JPanel();

		JButton btn = new JButton("Buton");
		panel.add(btn);
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
