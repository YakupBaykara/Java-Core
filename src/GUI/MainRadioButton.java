package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MainRadioButton {
	
	public static void main(String[] args) {
		
		// obj.setBounds(x,y,width,height)
		
		JFrame f = new JFrame("RadioButton Örneği");
		
		JRadioButton r1 = new JRadioButton("Kadın",true);
		r1.setBounds(100, 50, 100, 30);
		r1.setActionCommand("k");
		
		JRadioButton r2 = new JRadioButton("Erkek");
		r2.setBounds(100, 100, 100, 30);
		r2.setActionCommand("e");
		
		JRadioButton r3 = new JRadioButton("İstemiyorum");
		r3.setBounds(100, 150, 100, 30);
		r3.setActionCommand("n");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		JButton btn = new JButton("Gönder");
		btn.setBounds(100, 200, 100, 30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected()) {
					System.out.println(r1.getText() + " seçildi");
				}
				System.out.println(bg.getSelection().getActionCommand());
			}
		});
		
		
		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(btn);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
