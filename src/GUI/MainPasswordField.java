package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class MainPasswordField {

	public static void main(String[] args) {

		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("PasswordField Örneği");
		
		JLabel lbl = new JLabel("Şifre : ");
		lbl.setBounds(20, 20, 100, 30);
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(20, 50, 100, 30);
		
		JButton btn = new JButton("Göster");
		btn.setBounds(20, 80, 100, 30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String password = new String(pass.getPassword());
				lbl.setText(lbl.getText() + password);
				// lbl.setText(lbl.getText() + pass.getText()); passwordfield den getText() metodu kaldırıldı. Ancak yine de gösteriyor.
			}
		});

		f.add(lbl);
		f.add(pass);
		f.add(btn);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
