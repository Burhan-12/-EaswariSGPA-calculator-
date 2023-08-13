package easwari;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Semster4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semster4 window = new Semster4();
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
	public JFrame getFrame() {
	    return frame;
	}
	
	public Semster4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 922, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 128, 0), new Color(0, 255, 0), null, null));
		panel.setBounds(148, 39, 988, 597);
		frame.getContentPane().add(panel);
		
		JLabel lblFourthSemster = new JLabel("FOURTH SEMSTER");
		lblFourthSemster.setHorizontalAlignment(SwingConstants.CENTER);
		lblFourthSemster.setForeground(new Color(128, 0, 255));
		lblFourthSemster.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblFourthSemster.setBounds(324, 29, 304, 40);
		panel.add(lblFourthSemster);
		
		JLabel lblEnterYourGrade = new JLabel("Enter your Grade against each subject");
		lblEnterYourGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourGrade.setForeground(Color.RED);
		lblEnterYourGrade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterYourGrade.setBounds(42, 79, 325, 65);
		panel.add(lblEnterYourGrade);
		
		JLabel lblOperatingSystems = new JLabel("Operating Systems");
		lblOperatingSystems.setHorizontalAlignment(SwingConstants.LEFT);
		lblOperatingSystems.setForeground(Color.RED);
		lblOperatingSystems.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblOperatingSystems.setBounds(36, 185, 331, 40);
		panel.add(lblOperatingSystems);
		
		JLabel lblDatabaseManagementSystems = new JLabel("Database Management Systems");
		lblDatabaseManagementSystems.setHorizontalAlignment(SwingConstants.LEFT);
		lblDatabaseManagementSystems.setForeground(Color.RED);
		lblDatabaseManagementSystems.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDatabaseManagementSystems.setBounds(36, 224, 268, 40);
		panel.add(lblDatabaseManagementSystems);
		
		JLabel lblProgrammingInJava = new JLabel("Programming In Java");
		lblProgrammingInJava.setHorizontalAlignment(SwingConstants.LEFT);
		lblProgrammingInJava.setForeground(Color.RED);
		lblProgrammingInJava.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblProgrammingInJava.setBounds(36, 270, 353, 40);
		panel.add(lblProgrammingInJava);
		
		JLabel lblOperatingSystemsLaboratory = new JLabel("Operating systems Laboratory");
		lblOperatingSystemsLaboratory.setHorizontalAlignment(SwingConstants.LEFT);
		lblOperatingSystemsLaboratory.setForeground(Color.RED);
		lblOperatingSystemsLaboratory.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblOperatingSystemsLaboratory.setBounds(36, 319, 353, 40);
		panel.add(lblOperatingSystemsLaboratory);
		
		JLabel lblDatabseManagementSystems = new JLabel("Databse Management Systems Laboratory");
		lblDatabseManagementSystems.setHorizontalAlignment(SwingConstants.LEFT);
		lblDatabseManagementSystems.setForeground(Color.RED);
		lblDatabseManagementSystems.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDatabseManagementSystems.setBounds(36, 366, 311, 40);
		panel.add(lblDatabseManagementSystems);
		
		JLabel lblJavaProgrammingLaboratory = new JLabel("Java Programming Laboratory");
		lblJavaProgrammingLaboratory.setHorizontalAlignment(SwingConstants.LEFT);
		lblJavaProgrammingLaboratory.setForeground(Color.RED);
		lblJavaProgrammingLaboratory.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblJavaProgrammingLaboratory.setBounds(36, 410, 311, 40);
		panel.add(lblJavaProgrammingLaboratory);
		
		JLabel lblDesignAnalysisOf = new JLabel("Design Analysis Of Algorithm");
		lblDesignAnalysisOf.setHorizontalAlignment(SwingConstants.LEFT);
		lblDesignAnalysisOf.setForeground(Color.RED);
		lblDesignAnalysisOf.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDesignAnalysisOf.setBounds(36, 138, 283, 40);
		panel.add(lblDesignAnalysisOf);
		
		JLabel lblProbabiltyAndNumber = new JLabel("Probabilty And Number Theory");
		lblProbabiltyAndNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblProbabiltyAndNumber.setForeground(Color.RED);
		lblProbabiltyAndNumber.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblProbabiltyAndNumber.setBounds(36, 460, 250, 40);
		panel.add(lblProbabiltyAndNumber);
		
		JFormattedTextField daa = new JFormattedTextField();
		daa.setBounds(447, 151, 107, 19);
		panel.add(daa);
		
		JFormattedTextField os = new JFormattedTextField();
		os.setBounds(447, 198, 107, 19);
		panel.add(os);
		
		JFormattedTextField dbms = new JFormattedTextField();
		dbms.setBounds(447, 237, 107, 19);
		panel.add(dbms);
		
		JFormattedTextField pij = new JFormattedTextField();
		pij.setBounds(447, 283, 107, 19);
		panel.add(pij);
		
		JFormattedTextField osl = new JFormattedTextField();
		osl.setBounds(447, 332, 107, 19);
		panel.add(osl);
		
		JFormattedTextField dbmsl = new JFormattedTextField();
		dbmsl.setBounds(447, 379, 107, 19);
		panel.add(dbmsl);
		
		JFormattedTextField jpl = new JFormattedTextField();
		jpl.setBounds(447, 423, 107, 19);
		panel.add(jpl);
		
		JFormattedTextField pnt = new JFormattedTextField();
		pnt.setBounds(447, 473, 107, 19);
		panel.add(pnt);
		
		JButton Return = new JButton("return");
		Return.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Return.setBounds(721, 185, 122, 54);
		panel.add(Return);
		Return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainMenu mainmenu = new MainMenu();
				mainmenu.getFrame().setVisible(true);	
			}
		});
		
		JButton calculate1 = new JButton("calculate");
		calculate1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		calculate1.setBounds(721, 270, 122, 54);
		panel.add(calculate1);
		calculate1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int designAndAnalysisOfAlgorithm = 0, operatingSystem = 0, databaseManagementSystem = 0, 
						programmingInJava = 0, operatingSystemLab = 0, databaseManagementSystemLab = 0, 
						javaProgrammingLab = 0, probabilityandNumberTheory = 0;
				boolean val=false;
				
				
				try {
					designAndAnalysisOfAlgorithm = Integer.parseInt(daa.getText());
					operatingSystem =Integer.parseInt(os.getText());
					databaseManagementSystem =Integer.parseInt(dbms.getText());
					programmingInJava =Integer.parseInt(pij.getText());
					operatingSystemLab =Integer.parseInt(osl.getText());
					databaseManagementSystemLab =Integer.parseInt(dbmsl.getText());
					javaProgrammingLab =Integer.parseInt(jpl.getText());
					probabilityandNumberTheory =Integer.parseInt(pnt.getText());
					
				}catch(NumberFormatException ex) {
					// Display a warning about the invalid input 
					JOptionPane.showMessageDialog(null,"Invalid Input Please Enter the Valid Input",
							"Input Error",JOptionPane.WARNING_MESSAGE);
					val=true; // Use this to check whether the exception was thrown or not
				}
				
				if (designAndAnalysisOfAlgorithm < 0 || designAndAnalysisOfAlgorithm > 10 ||
					    operatingSystem < 0 || operatingSystem > 10 ||
					    databaseManagementSystem < 0 || databaseManagementSystem > 10 ||
					    programmingInJava < 0 || programmingInJava > 10 ||
					    operatingSystemLab < 0 || operatingSystemLab > 10 ||
					    databaseManagementSystemLab < 0 || databaseManagementSystemLab > 10 ||
					    javaProgrammingLab < 0 || javaProgrammingLab > 10 ||
					    probabilityandNumberTheory < 0 || probabilityandNumberTheory > 10) {

					    // Display a warning about the invalid range
					    JOptionPane.showMessageDialog(null, "Please enter values between 0 and 10.",
					            "Invalid Input", JOptionPane.WARNING_MESSAGE);
					    val = true; // Set the flag to indicate invalid input
				}
				
				if(val==false) {
					int total = (designAndAnalysisOfAlgorithm*3) + (operatingSystem*3) +
							(databaseManagementSystem*3) +
							(programmingInJava*3) + (operatingSystemLab*2) + 
							(databaseManagementSystemLab*2) +
							(javaProgrammingLab*2) + (probabilityandNumberTheory*4);
					
					double sgpa = (double)total/22.0;
					
					String formattedSgpa = String.format("your sgpa is %.3f", sgpa);
					JOptionPane.showMessageDialog(null,formattedSgpa,"SGPA calculation Result",
							JOptionPane.INFORMATION_MESSAGE);
				}
				daa.setText("");
				os.setText("");
				dbms.setText("");
				pij.setText("");
				osl.setText("");
				dbmsl.setText("");
				jpl.setText("");
				pnt.setText("");
				
			}
		});
		
		
		JButton Exit1 = new JButton("exit");
		Exit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Exit1.setBounds(721, 352, 122, 54);
		panel.add(Exit1);
	}

}
