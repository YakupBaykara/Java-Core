package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainLabel {

	public static void main(String[] args) {
		
		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("Label Örneği");

		JLabel l1 = new JLabel();
		l1.setText("Yazı Kısmı");
		l1.setBounds(100, 50, 200, 30);

		JButton btn = new JButton("Değiştir");
		btn.setBounds(100, 100, 100, 30);
		btn.addActionListener(new ActionListener() {
			
			int c=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("Butona " + c++ + " kez tıklandı.");
			}
		});
		
		f.add(btn);
		f.add(l1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
