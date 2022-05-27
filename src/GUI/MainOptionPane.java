package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainOptionPane {
	
	public static void main(String[] args) {
		
		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("OptionPane Örneği");
		
		//JOptionPane.showMessageDialog(f, "Merhaba, Kodlama Vaki"); // Çok sık kullanıldığı için static tanımlanmışır. Nesne Üretmeye gerek yoktur.
		
		//JOptionPane.showMessageDialog(f, "Abone oldun.", "Abone ol", JOptionPane.WARNING_MESSAGE); // frame, mesaj, başlık, ikon
		
		String str = JOptionPane.showInputDialog(f, "Adınız");
		System.out.println(str);
		
		f.setSize(400, 400);
		f.setLayout(null); 
		f.setVisible(true);
	}

}
