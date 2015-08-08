package Master;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class stackoverflow extends JFrame {
	private JMenuBar bar;
	private JMenu difficulty;
	//private JMenuItem wimp, novice, beast, daredevil;
	
	stackoverflow(String name){
	super(name);
	
	// Add JMenu items to jmenu bar				
		for(DifficultyMenuItem menuitem : DifficultyMenuItem.values()){
			difficulty.add(menuitem.item);
		}
	// add JMenu to JMenuBar	
		bar.add(difficulty);
	
	//set up JFrame
		this.setJMenuBar(bar);
		
		this.setPreferredSize(new Dimension(1000,700));
			this.setResizable(true);
				this.setLocation(300, 200);
					this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						this.setVisible(true);
	}
	private enum DifficultyMenuItem{
		WIMP("Wimp"),
		NOVICE("Novice"),
		BEAST("Beast"),
		DAREDEVIL("DareDevil");
		private JMenuItem item;
		
		private DifficultyMenuItem(String difficulty){
			item = new JMenuItem(difficulty);
		}
		/*
		 * item.add(
		 */
		public JMenuItem getDifficulty(){
			return item;
		}
		
		
	}
	private static void main(String args[]){
		stackoverflow j = new stackoverflow("test");
	}
}
