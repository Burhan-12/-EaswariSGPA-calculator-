package easwari;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(()->{
			MainMenu mainmenu = new MainMenu();
			mainmenu.getFrame().setVisible(true);
		});
		

	}

}
