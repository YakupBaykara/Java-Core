package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainTabbedPane {
	
	public static void main(String[] args) {
		
		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("TabbedPane Örneği");
		
		JLabel l1 = new JLabel("İlk Alan");
		JPanel p1 = new JPanel();
		p1.add(l1);
		
		JLabel l2 = new JLabel("İkinci Alan");
		JPanel p2 = new JPanel();
		p2.add(l2);
		
		JLabel l3 = new JLabel("Üçüncü Alan");
		JPanel p3 = new JPanel();
		p3.add(l3);
		
		JTabbedPane jp = new JTabbedPane();
		jp.setBounds(50, 50, 200, 200);
		jp.add("İlk", p1);
		jp.add("İkinci", p2);
		jp.add("Üçüncü", p3);
		
		
		f.add(jp);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
