package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class MainPopup {
	
	public static void main(String[] args) {
		
		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("Popup Menü Örneği");
		
		JPopupMenu pm = new JPopupMenu("Menü");
		
		JMenuItem cut = new JMenuItem("Kes");
		JMenuItem copy = new JMenuItem("Kopyala");
		JMenuItem paste = new JMenuItem("Yapıştır");
		
		pm.add(cut);
		pm.add(copy);
		pm.add(paste);
		
		f.addMouseListener(new MouseAdapter() {
					
			@Override
			public void mouseClicked(MouseEvent e) {
				pm.show(f, e.getX(), e.getY());
			}
		});		
		
		cut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Kes Butonuna Tıklandı");
			}
		});
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
