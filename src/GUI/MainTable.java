package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainTable {
	
	public static void main(String[] args) {
		
		// obj.setBounds(x,y,width,height)

		JFrame f = new JFrame("Table Örneği");
		
		String[][] veri = {{"1","Matematik","85"} , {"2","Fen","50"}, {"3","Türkçe","100"}}; 
		// İçteki her parantez satırları belirtiyor.
		
		String[] baslik = {"ID","DERS","NOT"};
		
		JTable tb = new JTable(veri, baslik);
		tb.setBounds(30, 40, 200, 300);
		
		JScrollPane sp = new JScrollPane(tb);
		
		//f.add(tb);
		f.add(sp);
		f.setSize(400, 400);
		//f.setLayout(null); ScrollPane ler null layoutta çalışmaz. Default layout olması şuan için gerekli.
		f.setVisible(true);
	}

}
