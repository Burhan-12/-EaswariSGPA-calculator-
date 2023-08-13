package easwari;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class MainMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 26, 700, 471);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(128, 255, 255), null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel headingCSE = new JLabel("Department Of CSE");
		headingCSE.setHorizontalAlignment(SwingConstants.CENTER);
		headingCSE.setForeground(new Color(128, 0, 255));
		headingCSE.setBounds(87, 25, 469, 34);
		headingCSE.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		panel.add(headingCSE);
		
		JLabel cgpaCalucationSystem = new JLabel("CGPA Calucation System");
		cgpaCalucationSystem.setHorizontalAlignment(SwingConstants.CENTER);
		cgpaCalucationSystem.setForeground(new Color(255, 0, 0));
		cgpaCalucationSystem.setFont(new Font("Times New Roman", Font.BOLD, 24));
		cgpaCalucationSystem.setBounds(82, 69, 500, 55);
		panel.add(cgpaCalucationSystem);
		
		JLabel semsterSelection = new JLabel("select your semster from the drop down menu");
		semsterSelection.setHorizontalAlignment(SwingConstants.CENTER);
		semsterSelection.setForeground(new Color(0, 0, 0));
		semsterSelection.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		semsterSelection.setBounds(149, 144, 358, 34);
		panel.add(semsterSelection);
		
		JComboBox<String> semsterSelector = new JComboBox<String>();
		semsterSelector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedSemster =(String) semsterSelector.getSelectedItem() ;
				openSelectedSemster(selectedSemster);
				
			}
		});
		
		
		semsterSelector.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		semsterSelector.setModel(new DefaultComboBoxModel<String>(new String[] {"Semester 1", 
				"Semester 2", "Semester 3", "Semester 4", "Semester 5","Semster 6"}));
		semsterSelector.setBounds(246, 215, 159, 43);
		panel.add(semsterSelector);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnExit.setBounds(351, 392, 250, 58);
		panel.add(btnExit);
		
		JButton btnNewButton = new JButton("About Developer");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(20, 392, 241, 58);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = " I am an aspiring software developer seeking"
						+ " a challenging position in a reputable organization"
						+ " to expandand utilize\r\n "
						+ "my learning skills and knowledge. Possess excellent "
						+ "communication skills and flexible to work in any environment.";
				
				JOptionPane.showMessageDialog(null, message, "Burhan Aijaz", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
	}
	public JFrame getFrame() {
	    return frame;
	}
	private void openSelectedSemster(String selectedSemster) {
		switch(selectedSemster) {
		case "Semester 1":
			frame.dispose();
			Semster1 sem1 =new Semster1();
			sem1.getFrame().setVisible(true);
			break;
			
		case "Semester 2":
			frame.dispose();
			Semster2 sem2 =new Semster2();
			sem2.getFrame().setVisible(true);
			break;
			
		case "Semester 3":
			frame.dispose();
			Semster3 sem3 =new Semster3();
			sem3.getFrame().setVisible(true);
			break;
			
		case "Semester 4":
			frame.dispose();
			Semster4 sem4 =new Semster4();
			sem4.getFrame().setVisible(true);
			break;
			
		case "Semester 5":
			frame.dispose();
			Semster5 sem5 =new Semster5();
			sem5.getFrame().setVisible(true);
			break;
		
		case "Semster 6":
			frame.dispose();
			Semster6 sem6 =new Semster6();
			sem6.getFrame().setVisible(true);
			break;
			
		default:
			break;
		}
		
	}
}
