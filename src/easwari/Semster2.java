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

public class Semster2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public JFrame getFrame() {
	    return frame;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semster2 window = new Semster2();
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
	public Semster2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 940, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 128, 0), new Color(0, 255, 0), null, null));
		panel.setBounds(55, 43, 988, 597);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSecondSemster = new JLabel("SECOND SEMSTER");
		lblSecondSemster.setBounds(324, 29, 304, 40);
		lblSecondSemster.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondSemster.setForeground(new Color(128, 0, 255));
		lblSecondSemster.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		panel.add(lblSecondSemster);
		
		JLabel lblEnterYourGrade = new JLabel("Enter your Grade against each subject");
		lblEnterYourGrade.setBounds(42, 79, 325, 65);
		lblEnterYourGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourGrade.setForeground(Color.RED);
		lblEnterYourGrade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(lblEnterYourGrade);
		
		JLabel lblBasicElectrical = new JLabel("Basic Electrical and Electronics Engineering");
		lblBasicElectrical.setBounds(36, 185, 331, 40);
		lblBasicElectrical.setHorizontalAlignment(SwingConstants.LEFT);
		lblBasicElectrical.setForeground(Color.RED);
		lblBasicElectrical.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel.add(lblBasicElectrical);
		
		JLabel lblProgrammingInC = new JLabel("Programming In C");
		lblProgrammingInC.setBounds(36, 224, 182, 40);
		lblProgrammingInC.setHorizontalAlignment(SwingConstants.LEFT);
		lblProgrammingInC.setForeground(Color.RED);
		lblProgrammingInC.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel.add(lblProgrammingInC);
		
		JLabel lblEngineeringPracticesLaboratory = new JLabel("Engineering Practices Laboratory");
		lblEngineeringPracticesLaboratory.setBounds(36, 270, 353, 40);
		lblEngineeringPracticesLaboratory.setHorizontalAlignment(SwingConstants.LEFT);
		lblEngineeringPracticesLaboratory.setForeground(Color.RED);
		lblEngineeringPracticesLaboratory.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel.add(lblEngineeringPracticesLaboratory);
		
		JLabel lblCProgrammingLaboratory = new JLabel("C Programming Laboratory");
		lblCProgrammingLaboratory.setBounds(36, 319, 353, 40);
		lblCProgrammingLaboratory.setHorizontalAlignment(SwingConstants.LEFT);
		lblCProgrammingLaboratory.setForeground(Color.RED);
		lblCProgrammingLaboratory.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel.add(lblCProgrammingLaboratory);
		
		JLabel lblProfessionalCommunication = new JLabel("Professional Communication");
		lblProfessionalCommunication.setBounds(36, 366, 250, 40);
		lblProfessionalCommunication.setHorizontalAlignment(SwingConstants.LEFT);
		lblProfessionalCommunication.setForeground(Color.RED);
		lblProfessionalCommunication.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel.add(lblProfessionalCommunication);
		
		JLabel lblEngineeringMathematics2 = new JLabel("Engineering Mathematics-II");
		lblEngineeringMathematics2.setBounds(36, 410, 216, 40);
		lblEngineeringMathematics2.setHorizontalAlignment(SwingConstants.LEFT);
		lblEngineeringMathematics2.setForeground(Color.RED);
		lblEngineeringMathematics2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel.add(lblEngineeringMathematics2);
		
		JLabel lblEnvironmentalScience = new JLabel("Environmental Science");
		lblEnvironmentalScience.setBounds(36, 138, 182, 40);
		lblEnvironmentalScience.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnvironmentalScience.setForeground(Color.RED);
		lblEnvironmentalScience.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel.add(lblEnvironmentalScience);
		
		JLabel lblPhysicsForInformation = new JLabel("Physics For Information Science");
		lblPhysicsForInformation.setBounds(36, 460, 250, 40);
		lblPhysicsForInformation.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhysicsForInformation.setForeground(Color.RED);
		lblPhysicsForInformation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel.add(lblPhysicsForInformation);
		
		JFormattedTextField es = new JFormattedTextField();
		es.setBounds(447, 151, 107, 19);
		panel.add(es);
		
		JFormattedTextField bee = new JFormattedTextField();
		bee.setBounds(447, 198, 107, 19);
		panel.add(bee);
		
		JFormattedTextField pic = new JFormattedTextField();
		pic.setBounds(447, 237, 107, 19);
		panel.add(pic);
		
		JFormattedTextField epl = new JFormattedTextField();
		epl.setBounds(447, 283, 107, 19);
		panel.add(epl);
		
		JFormattedTextField cpl = new JFormattedTextField();
		cpl.setBounds(447, 332, 107, 19);
		panel.add(cpl);
		
		JFormattedTextField pc = new JFormattedTextField();
		pc.setBounds(447, 379, 107, 19);
		panel.add(pc);
		
		JFormattedTextField em2 = new JFormattedTextField();
		em2.setBounds(447, 423, 107, 19);
		panel.add(em2);
		
		JFormattedTextField pis = new JFormattedTextField();
		pis.setBounds(447, 473, 107, 19);
		panel.add(pis);
		
		JButton Return = new JButton("return");
		Return.setBounds(721, 185, 122, 54);
		Return.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(Return);
		Return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainMenu mainmenu = new MainMenu();
				mainmenu.getFrame().setVisible(true);	
			}
		});
		
		JButton calculate1 = new JButton("calculate");
		calculate1.setBounds(721, 270, 122, 54);
		calculate1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(calculate1);
		calculate1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int environmentalScience = 0, basicElectricalEngineering = 0
						, programmingInC= 0, engineeringPracticesLab= 0, 
						cProgrammingLab= 0, professionalCommunication= 0,
						engineeringMaths2= 0, physicsforInformation= 0;
				boolean val=false;
				
				try {
					environmentalScience = Integer.parseInt(es.getText());
					basicElectricalEngineering = Integer.parseInt(bee.getText());
					programmingInC= Integer.parseInt(pic.getText());
					engineeringPracticesLab = Integer.parseInt(epl.getText());
					cProgrammingLab = Integer.parseInt(cpl.getText());
					professionalCommunication= Integer.parseInt(pc.getText());
					engineeringMaths2 = Integer.parseInt(em2.getText());
					physicsforInformation = Integer.parseInt(pis.getText());
					
				}catch(NumberFormatException ex) {// Display a warning about the invalid input 
					JOptionPane.showMessageDialog(null,"Invalid Input Please Enter the Valid Input","Input Error",JOptionPane.WARNING_MESSAGE);
					val=true; // Use this to check whether the exception was thrown or not
				}
				
				if (environmentalScience < 0 || environmentalScience > 10 ||
					    basicElectricalEngineering < 0 || basicElectricalEngineering > 10 ||
					    programmingInC < 0 || programmingInC > 10 ||
					    engineeringPracticesLab < 0 || engineeringPracticesLab > 10 ||
					    cProgrammingLab < 0 || cProgrammingLab > 10 ||
					    professionalCommunication < 0 || professionalCommunication > 10 ||
					    engineeringMaths2 < 0 || engineeringMaths2 > 10 ||
					    physicsforInformation < 0 || physicsforInformation > 10) {

					    // Display a warning about the invalid range
					    JOptionPane.showMessageDialog(null, "Please enter values between 0 and 10.",
					            "Invalid Input", JOptionPane.WARNING_MESSAGE);
					    val = true; // Set the flag to indicate invalid input
					}
				
				if(val==false) {
					int total = (environmentalScience*3) + (basicElectricalEngineering*3) + 
							(programmingInC*3) + (engineeringPracticesLab*2) +
							(cProgrammingLab*2) + (professionalCommunication*3)+
							(engineeringMaths2*4) + (physicsforInformation*3);
					double sgpa = (double)total/23.0;
					
					String formattedSGPA = String.format("your calculated sgpa is %.3f", sgpa);
					JOptionPane.showMessageDialog(null, formattedSGPA, "SGPA Calculation Result"
							, JOptionPane.INFORMATION_MESSAGE);
					
				}
				es.setText("");
				bee.setText("");
				pic.setText("");
				epl.setText("");
				cpl.setText("");
				pc.setText("");
				em2.setText("");
				pis.setText("");
			
					
			}
		});

		
		JButton Exit1 = new JButton("exit");
		Exit1.setBounds(721, 352, 122, 54);
		Exit1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(Exit1);
		Exit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
		
	

}
