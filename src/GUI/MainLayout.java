package GUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainLayout {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		
		JButton b1 = new JButton("b1");
		JButton b2 = new JButton("b2");
		JButton b3 = new JButton("b3");
		JButton b4 = new JButton("b4");
		JButton b5 = new JButton("b5");
		
		JPanel p = new JPanel();
		/* p.setLayout(new BorderLayout());
		p.add(b1, BorderLayout.NORTH);
		p.add(b2, BorderLayout.WEST);
		p.add(b3, BorderLayout.SOUTH);
		p.add(b4, BorderLayout.EAST);
		p.add(b5, BorderLayout.CENTER); */
		
		/* p.setLayout(new GridLayout(3, 2));    Soldan sağa başlar ve alta geçer.
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5); */
		
		p.setLayout(new FlowLayout(/*FlowLayout.RIGHT*/));   // Soldan sağa başlar ve alta geçer. Constructor ına göre sağa sola vs. yaslanabilir.
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5); 
		
		
		f.add(p);
		// f.pack();   Elemanların boyutlarına göre panel boyutunu ayarlar.
		f.setSize(400, 400);
		f.setVisible(true);
	}

}
