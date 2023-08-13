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

public class Semster5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semster5 window = new Semster5();
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
	
	public Semster5() {
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
		
		
		JLabel lblFifthSemster = new JLabel("FIFTH SEMSTER");
		lblFifthSemster.setHorizontalAlignment(SwingConstants.CENTER);
		lblFifthSemster.setForeground(new Color(128, 0, 255));
		lblFifthSemster.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblFifthSemster.setBounds(324, 29, 304, 40);
		panel.add(lblFifthSemster);
		
		JLabel lblEnterYourGrade = new JLabel("Enter your Grade against each subject");
		lblEnterYourGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourGrade.setForeground(Color.RED);
		lblEnterYourGrade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterYourGrade.setBounds(42, 79, 325, 65);
		panel.add(lblEnterYourGrade);
		
		JLabel lblObjectOrientedAnalysis = new JLabel("Object Oriented Analysis And Design");
		lblObjectOrientedAnalysis.setHorizontalAlignment(SwingConstants.LEFT);
		lblObjectOrientedAnalysis.setForeground(Color.RED);
		lblObjectOrientedAnalysis.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblObjectOrientedAnalysis.setBounds(36, 185, 331, 40);
		panel.add(lblObjectOrientedAnalysis);
		
		JLabel lblDataMining = new JLabel("Data Mining");
		lblDataMining.setHorizontalAlignment(SwingConstants.LEFT);
		lblDataMining.setForeground(Color.RED);
		lblDataMining.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDataMining.setBounds(36, 224, 268, 40);
		panel.add(lblDataMining);
		
		JLabel lblComputerNetworksLaboratory = new JLabel("Computer Networks Laboratory");
		lblComputerNetworksLaboratory.setHorizontalAlignment(SwingConstants.LEFT);
		lblComputerNetworksLaboratory.setForeground(Color.RED);
		lblComputerNetworksLaboratory.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblComputerNetworksLaboratory.setBounds(36, 270, 353, 40);
		panel.add(lblComputerNetworksLaboratory);
		
		JLabel lblObjectOrientedAnalysis_1 = new JLabel("Object Oriented Analysis And Design Laboratory");
		lblObjectOrientedAnalysis_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblObjectOrientedAnalysis_1.setForeground(Color.RED);
		lblObjectOrientedAnalysis_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblObjectOrientedAnalysis_1.setBounds(36, 319, 375, 40);
		panel.add(lblObjectOrientedAnalysis_1);
		
		JLabel lblProfessional = new JLabel("Professional Elective");
		lblProfessional.setHorizontalAlignment(SwingConstants.LEFT);
		lblProfessional.setForeground(Color.RED);
		lblProfessional.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblProfessional.setBounds(36, 366, 311, 40);
		panel.add(lblProfessional);
		
		JLabel lblOpenElective = new JLabel("Open Elective");
		lblOpenElective.setHorizontalAlignment(SwingConstants.LEFT);
		lblOpenElective.setForeground(Color.RED);
		lblOpenElective.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblOpenElective.setBounds(36, 410, 311, 40);
		panel.add(lblOpenElective);
		
		JLabel lblComputerNetworks = new JLabel("Computer Networks");
		lblComputerNetworks.setHorizontalAlignment(SwingConstants.LEFT);
		lblComputerNetworks.setForeground(Color.RED);
		lblComputerNetworks.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblComputerNetworks.setBounds(36, 138, 283, 40);
		panel.add(lblComputerNetworks);
		
		JLabel lblSocialServicePhase = new JLabel("Social Service Phase");
		lblSocialServicePhase.setHorizontalAlignment(SwingConstants.LEFT);
		lblSocialServicePhase.setForeground(Color.RED);
		lblSocialServicePhase.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSocialServicePhase.setBounds(42, 475, 311, 40);
		panel.add(lblSocialServicePhase);
		
		JFormattedTextField cn = new JFormattedTextField();
		cn.setBounds(447, 151, 107, 19);
		panel.add(cn);
		
		JFormattedTextField ooad = new JFormattedTextField();
		ooad.setBounds(447, 198, 107, 19);
		panel.add(ooad);
		
		JFormattedTextField dm = new JFormattedTextField();
		dm.setBounds(447, 237, 107, 19);
		panel.add(dm);
		
		JFormattedTextField cnl = new JFormattedTextField();
		cnl.setBounds(447, 283, 107, 19);
		panel.add(cnl);
		
		JFormattedTextField ooadl = new JFormattedTextField();
		ooadl.setBounds(447, 332, 107, 19);
		panel.add(ooadl);
		
		JFormattedTextField pe = new JFormattedTextField();
		pe.setBounds(447, 379, 107, 19);
		panel.add(pe);
		
		JFormattedTextField oe = new JFormattedTextField();
		oe.setBounds(447, 423, 107, 19);
		panel.add(oe);

		JFormattedTextField ssp = new JFormattedTextField();
		ssp.setBounds(447, 488, 107, 19);
		panel.add(ssp);
		
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
				int computerNetworks = 0, objectOrientedAnalysisAndDesign = 0, dataMining = 0,
				computerNetworksLab = 0, objectOrientedAnalysisAndDesignLab = 0,
				professionElective = 0, openElective = 0,  socialServicePhase = 0;
				boolean val= false;
				
				try {
					computerNetworks = Integer.parseInt(cn.getText());
					objectOrientedAnalysisAndDesign = Integer.parseInt(ooad.getText());
					dataMining = Integer.parseInt(dm.getText());
					computerNetworksLab = Integer.parseInt(cnl.getText());
					objectOrientedAnalysisAndDesignLab = Integer.parseInt(ooadl.getText());
					professionElective = Integer.parseInt(pe.getText());
					openElective = Integer.parseInt(oe.getText());
					socialServicePhase = Integer.parseInt(ssp.getText());
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,"Invalid Input Please enter the valid Input",
							"Invalid Input Error", JOptionPane.WARNING_MESSAGE);
					val= true;
				}
				
				if (computerNetworks < 0 || computerNetworks > 10 ||
					    objectOrientedAnalysisAndDesign < 0 || objectOrientedAnalysisAndDesign > 10 ||
					    dataMining < 0 || dataMining > 10 ||
					    computerNetworksLab < 0 || computerNetworksLab > 10 ||
					    objectOrientedAnalysisAndDesignLab < 0 || objectOrientedAnalysisAndDesignLab > 10 ||
					    professionElective < 0 || professionElective > 10 ||
					    openElective < 0 || openElective > 10 ||
					    socialServicePhase < 0 || socialServicePhase > 10) {

					    // Display a warning about the invalid range
					    JOptionPane.showMessageDialog(null, "Please enter values between 0 and 10.",
					            "Invalid Input", JOptionPane.WARNING_MESSAGE);
					    val = true; // Set the flag to indicate invalid input
					}
				if(val==false)
				{
					int total = (openElective*3) + (professionElective*3) + (computerNetworks*4) + 
							(objectOrientedAnalysisAndDesignLab*3) + (dataMining*3) + (computerNetworksLab*2) + 
							(objectOrientedAnalysisAndDesignLab*1) + (socialServicePhase);
					double sgpa = (double)total/20.0;
					String formattedSgpa = String.format("your sgpa is %.3f", sgpa);
					JOptionPane.showMessageDialog(null,formattedSgpa,"SGPA calculation",
							JOptionPane.INFORMATION_MESSAGE);
				}
				
				oe.setText("");
				pe.setText("");
				cn.setText("");
				ooad.setText("");
				dm.setText("");
				cnl.setText("");
				ooadl.setText("");
				ssp.setText("");
						
			}
		});
		
		
		JButton Exit1 = new JButton("exit");
		Exit1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Exit1.setBounds(721, 352, 122, 54);
		panel.add(Exit1);
		Exit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
	}
}
