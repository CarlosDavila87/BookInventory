import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class InventoryWindow extends JFrame {
	private JPanel panel;
	private JMenuBar menubar;
	private JMenu file, orders, inventory;
	
	public InventoryWindow() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	public InventoryWindow(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public InventoryWindow(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(1200,700));
		menubar = new JMenuBar();
		//inventory items
			file = new JMenu("File");
			orders = new JMenu("Orders");
			inventory = new JMenu("Inventory");
		
		// 	JMenus to the JMenuBar
			menubar.add(file);
			menubar.add(orders);
			menubar.add(inventory);
		
		//	Finalize JFrame
		//add menubar to this Inventory Window
			this.setJMenuBar(menubar);
				this.setSize(1200, 700);
					this.setResizable(false);
						this.setLocation(400, 200);	//location on physical screen
							this.setVisible(true);	
	}
	private enum FileMenuItem{
		OPEN("Open"),
		EXIT("Exit");
		private JMenuItem item;
		
		private FileMenuItem(String title){
			item = new JMenuItem(title);
			
		}
		public JMenuItem getItem(){
			return item;
		}
	}
	private enum OrdersMenuItem{
		NEW("New Order");
		private JMenuItem item;
		
		private OrdersMenuItem(String title){
			item = new JMenuItem(title);
		}
		
		
	
	}
	public InventoryWindow(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
