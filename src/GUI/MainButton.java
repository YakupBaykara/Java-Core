package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainButton {
	
	public static void main(String[] args) {
		
		// obj.setBounds(x,y,width,height)
		
		JFrame f = new JFrame("Buton Örneği");
		
		JButton btn = new JButton("Gönder");  // constructor boş bırakılıp btn.setText() ile de yapılabilir.
		btn.setBounds(100, 100, 100, 30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Butona tıklandı.");
			}
		});
		
		f.add(btn);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	
	}

}
