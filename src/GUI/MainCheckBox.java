package GUI;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainCheckBox {

	public static void main(String[] args) {

		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("CheckBox Örneği");

		JLabel lbl = new JLabel("Seçim yapın.");
		lbl.setBounds(150, 50, 300, 50);

		JCheckBox cb = new JCheckBox("C++");
		JCheckBox cb2 = new JCheckBox("Java");
		cb.setBounds(150, 100, 250, 50);
		cb2.setBounds(150, 150, 250, 50);

		cb.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				lbl.setText("C++ seçim kutucuğu " + (e.getStateChange() == 1 ? "seçildi" : "seçilmedi"));
			}
		});

		cb2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				lbl.setText("Java seçim kutucuğu " + (e.getStateChange() == 1 ? "seçildi" : "seçilmedi"));
			}
		});

		/*
		 * JButton btn = new JButton("Kontrol"); btn.setBounds(150, 200, 100, 30);
		 * btn.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { if(cb.isSelected()) {
		 * System.out.println(cb.getText() + " seçildi"); } if(cb2.isSelected()) {
		 * System.out.println(cb2.getText() + " seçildi"); } } });
		 */

		f.add(cb);
		f.add(cb2);
		// f.add(btn);
		f.add(lbl);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
