package GUI;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MainProgressBar {

	public static void main(String[] args) {

		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("ProgressBar Örneği");
		
		JProgressBar pb = new JProgressBar(0,2000); // 
		pb.setBounds(40, 40, 160, 30);
		pb.setValue(0);
		pb.setStringPainted(true);
		
		f.add(pb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		int i = 0;
		while(i <= 2000) {
			pb.setValue(i);
			i += 20;
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
