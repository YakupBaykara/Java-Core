package GUI;

import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class MainScrollBar {

	public static void main(String[] args) {
		
		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("ScrollBar Örneği");

		JLabel l = new JLabel();
		l.setBounds(100, 30, 300, 100);

		JScrollBar s = new JScrollBar(Scrollbar.VERTICAL, 0, 10, 0, 100); // 0:Başlangıç nok., 10:Bar yüksekliği,
																			// 0:Minimum, 100:Maximum. 0-90 arası değer
																			// alacaktır.
		/*
		 * s.setMaximum(100); s.setMinimum(0); 0-90 arası değer alacaktır. Bar
		 * yüksekliği 10 otomatik olarak alınır
		 */
		s.setBounds(100, 100, 50, 100);
		s.addAdjustmentListener(new AdjustmentListener() {

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				l.setText("ScrollBar Değeri : " + s.getValue()); // s.getModel().getExtend() ile bar yüksekliği
																	// eklenebilir.
			}
		});

		f.add(l);
		f.add(s);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
