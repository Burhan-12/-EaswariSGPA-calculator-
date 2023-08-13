package easwari;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Semster6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semster6 window = new Semster6();
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
	
	public Semster6() {
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
		
		
		JLabel lblSixthSemster = new JLabel("SIXTH SEMSTER");
		lblSixthSemster.setHorizontalAlignment(SwingConstants.CENTER);
		lblSixthSemster.setForeground(new Color(128, 0, 255));
		lblSixthSemster.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblSixthSemster.setBounds(324, 29, 304, 40);
		panel.add(lblSixthSemster);
		
		JLabel lblEnterYourGrade = new JLabel("Enter your Grade against each subject");
		lblEnterYourGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourGrade.setForeground(Color.RED);
		lblEnterYourGrade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterYourGrade.setBounds(42, 79, 325, 65);
		panel.add(lblEnterYourGrade);
		
		JLabel lblArtificialIntelligence = new JLabel("Artificial Intelligence");
		lblArtificialIntelligence.setHorizontalAlignment(SwingConstants.LEFT);
		lblArtificialIntelligence.setForeground(Color.RED);
		lblArtificialIntelligence.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblArtificialIntelligence.setBounds(36, 185, 331, 40);
		panel.add(lblArtificialIntelligence);
		
		JLabel lblCompilerDesign = new JLabel("Compiler Design");
		lblCompilerDesign.setHorizontalAlignment(SwingConstants.LEFT);
		lblCompilerDesign.setForeground(Color.RED);
		lblCompilerDesign.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblCompilerDesign.setBounds(36, 224, 268, 40);
		panel.add(lblCompilerDesign);
		
		JLabel lblApplicationDevLab = new JLabel("Application Development Laboratory");
		lblApplicationDevLab.setHorizontalAlignment(SwingConstants.LEFT);
		lblApplicationDevLab.setForeground(Color.RED);
		lblApplicationDevLab.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblApplicationDevLab.setBounds(36, 270, 353, 40);
		panel.add(lblApplicationDevLab);
		
		JLabel lblInterpersonalSkill = new JLabel("Interpersonal Skills");
		lblInterpersonalSkill.setHorizontalAlignment(SwingConstants.LEFT);
		lblInterpersonalSkill.setForeground(Color.RED);
		lblInterpersonalSkill.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblInterpersonalSkill.setBounds(36, 319, 375, 40);
		panel.add(lblInterpersonalSkill);
		
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
		
		JLabel lblMobileComputing = new JLabel("Mobile Computing");
		lblMobileComputing.setHorizontalAlignment(SwingConstants.LEFT);
		lblMobileComputing.setForeground(Color.RED);
		lblMobileComputing.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblMobileComputing.setBounds(36, 138, 283, 40);
		panel.add(lblMobileComputing);
		
		JLabel lblIndianConstitution = new JLabel("Indian Constitution");
		lblIndianConstitution.setHorizontalAlignment(SwingConstants.LEFT);
		lblIndianConstitution.setForeground(Color.RED);
		lblIndianConstitution.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblIndianConstitution.setBounds(42, 445, 311, 40);
		panel.add(lblIndianConstitution);
		
		JLabel lblImplantTraining = new JLabel("Implant Training");
		lblImplantTraining.setHorizontalAlignment(SwingConstants.LEFT);
		lblImplantTraining.setForeground(Color.RED);
		lblImplantTraining.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblImplantTraining.setBounds(36, 495, 311, 40);
		panel.add(lblImplantTraining);
		
		JFormattedTextField mc = new JFormattedTextField();
		mc.setBounds(447, 151, 107, 19);
		panel.add(mc);
		
		JFormattedTextField ai = new JFormattedTextField();
		ai.setBounds(447, 198, 107, 19);
		panel.add(ai);
		
		JFormattedTextField cd = new JFormattedTextField();
		cd.setBounds(447, 237, 107, 19);
		panel.add(cd);
		
		JFormattedTextField adl = new JFormattedTextField();
		adl.setBounds(447, 283, 107, 19);
		panel.add(adl);
		
		JFormattedTextField is = new JFormattedTextField();
		is.setBounds(447, 332, 107, 19);
		panel.add(is);
		
		JFormattedTextField pe = new JFormattedTextField();
		pe.setBounds(447, 379, 107, 19);
		panel.add(pe);
		
		JFormattedTextField oe = new JFormattedTextField();
		oe.setBounds(447, 423, 107, 19);
		panel.add(oe);

		JFormattedTextField ic = new JFormattedTextField();
		ic.setBounds(447, 458, 107, 19);
		panel.add(ic);
		
		JFormattedTextField it = new JFormattedTextField();
		it.setBounds(447, 508, 107, 19);
		panel.add(it);

		
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
				int mobileComputing = 0, artificialIntelligence = 0, compilerDesign = 0,
						applicationDevelopmentlaboratary = 0, interpersonalSkills = 0,
						professionalElective = 0,openElective = 0,
						indianConstitution = 0, implantTraining = 0;
				boolean val= false;
				
				try {
					mobileComputing = Integer.parseInt(mc.getText());
					 artificialIntelligence = Integer.parseInt(ai.getText());
					 compilerDesign = Integer.parseInt(cd.getText());
					 applicationDevelopmentlaboratary = Integer.parseInt(adl.getText());
					 interpersonalSkills = Integer.parseInt(is.getText());
					 professionalElective = Integer.parseInt(pe.getText());
					 openElective = Integer.parseInt(oe.getText());
					 indianConstitution = Integer.parseInt(ic.getText());
					 implantTraining = Integer.parseInt(it.getText());
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,"Invalid Input Please enter the valid Input",
							"Invalid Input Error", JOptionPane.WARNING_MESSAGE);
					val= true;
				}
				
				if (mobileComputing < 0 || mobileComputing > 10 ||
					    artificialIntelligence < 0 || artificialIntelligence > 10 ||
					    compilerDesign < 0 || compilerDesign > 10 ||
					    applicationDevelopmentlaboratary < 0 || applicationDevelopmentlaboratary > 10 ||
					    interpersonalSkills < 0 || interpersonalSkills > 10 ||
					    professionalElective < 0 || professionalElective > 10 ||
					    openElective < 0 || openElective > 10 ||
					    indianConstitution < 0 || indianConstitution > 10 ||
					    implantTraining < 0 || implantTraining > 10) {

					    // Display a warning about the invalid range
					    JOptionPane.showMessageDialog(null, "Please enter values between 0 and 10.",
					            "Invalid Input", JOptionPane.WARNING_MESSAGE);
					    val = true; // Set the flag to indicate invalid input
					}
				if(val==false)
				{
					int total = (openElective*3) + (professionalElective*3) + (compilerDesign*4) + 
							(mobileComputing*3) + (artificialIntelligence*3) + (applicationDevelopmentlaboratary*2) + 
							(interpersonalSkills) + implantTraining;
					double sgpa = (double)total/23.0;
					String formattedSgpa = String.format("your sgpa is %.3f", sgpa);
					JOptionPane.showMessageDialog(null,formattedSgpa,"SGPA calculation",
							JOptionPane.INFORMATION_MESSAGE);
				}
				
				oe.setText("");
				pe.setText("");
				mc.setText("");
				ai.setText("");
				cd.setText("");
				adl.setText("");
				is.setText("");
				ic.setText("");
						
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
