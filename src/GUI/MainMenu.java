package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MainMenu {

	public static void main(String[] args) {

		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("Menü Örneği");
		
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("Ana Menü");
		JMenu submenu = new JMenu("Alt Menü");
		
		JMenuItem i1 = new JMenuItem("Menu 1");
		JMenuItem i2 = new JMenuItem("Menu 2");
		JMenuItem i3 = new JMenuItem("Menu 3");
		JMenuItem i4 = new JMenuItem("Menu 4");
		
		i1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Menüye tıklandı");
			}
		});
		
		JMenuItem a1 = new JMenuItem("AltMenu 1");
		JMenuItem a2 = new JMenuItem("AltMenu 2");
		
		submenu.add(a1);
		submenu.add(a2);
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		menu.add(submenu);
		
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
