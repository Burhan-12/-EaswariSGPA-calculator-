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

public class Semster3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semster3 window = new Semster3();
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
	
	
	public Semster3() {
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
		
		JLabel lblThirdSemster = new JLabel("THIRD SEMSTER");
		lblThirdSemster.setHorizontalAlignment(SwingConstants.CENTER);
		lblThirdSemster.setForeground(new Color(128, 0, 255));
		lblThirdSemster.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblThirdSemster.setBounds(324, 29, 304, 40);
		panel.add(lblThirdSemster);
		
		JLabel lblEnterYourGrade = new JLabel("Enter your Grade against each subject");
		lblEnterYourGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourGrade.setForeground(Color.RED);
		lblEnterYourGrade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterYourGrade.setBounds(42, 79, 325, 65);
		panel.add(lblEnterYourGrade);
		
		JLabel objectOrientedProgramming = new JLabel("Object Oriented Programming With C++");
		objectOrientedProgramming.setHorizontalAlignment(SwingConstants.LEFT);
		objectOrientedProgramming.setForeground(Color.RED);
		objectOrientedProgramming.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		objectOrientedProgramming.setBounds(36, 185, 331, 40);
		panel.add(objectOrientedProgramming);
		
		JLabel dataStructures = new JLabel("Data Structures");
		dataStructures.setHorizontalAlignment(SwingConstants.LEFT);
		dataStructures.setForeground(Color.RED);
		dataStructures.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dataStructures.setBounds(36, 224, 182, 40);
		panel.add(dataStructures);
		
		JLabel computerArchitecture = new JLabel("Computer Architecture");
		computerArchitecture.setHorizontalAlignment(SwingConstants.LEFT);
		computerArchitecture.setForeground(Color.RED);
		computerArchitecture.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		computerArchitecture.setBounds(36, 270, 353, 40);
		panel.add(computerArchitecture);
		
		JLabel dataStructuresLaboratory = new JLabel("Data Structures Laboratory in C");
		dataStructuresLaboratory.setHorizontalAlignment(SwingConstants.LEFT);
		dataStructuresLaboratory.setForeground(Color.RED);
		dataStructuresLaboratory.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dataStructuresLaboratory.setBounds(36, 319, 353, 40);
		panel.add(dataStructuresLaboratory);
		
		JLabel objectOrientedProgrammingLab = new JLabel("Object Oriented Programming Laboratory");
		objectOrientedProgrammingLab.setHorizontalAlignment(SwingConstants.LEFT);
		objectOrientedProgrammingLab.setForeground(Color.RED);
		objectOrientedProgrammingLab.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		objectOrientedProgrammingLab.setBounds(36, 366, 311, 40);
		panel.add(objectOrientedProgrammingLab);
		
		JLabel digitalPrinciplesAnd = new JLabel("Digital Principles and System Design");
		digitalPrinciplesAnd.setHorizontalAlignment(SwingConstants.LEFT);
		digitalPrinciplesAnd.setForeground(Color.RED);
		digitalPrinciplesAnd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		digitalPrinciplesAnd.setBounds(36, 410, 311, 40);
		panel.add(digitalPrinciplesAnd);
		
		JLabel softwareEngineering = new JLabel("Software Engineering");
		softwareEngineering.setHorizontalAlignment(SwingConstants.LEFT);
		softwareEngineering.setForeground(Color.RED);
		softwareEngineering.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		softwareEngineering.setBounds(36, 138, 182, 40);
		panel.add(softwareEngineering);
		
		JLabel discreteMathematics = new JLabel("discrete Mathematics");
		discreteMathematics.setHorizontalAlignment(SwingConstants.LEFT);
		discreteMathematics.setForeground(Color.RED);
		discreteMathematics.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		discreteMathematics.setBounds(36, 460, 250, 40);
		panel.add(discreteMathematics);
		
		JFormattedTextField se = new JFormattedTextField();
		se.setBounds(447, 151, 107, 19);
		panel.add(se);
		
		JFormattedTextField oops = new JFormattedTextField();
		oops.setBounds(447, 198, 107, 19);
		panel.add(oops);
		
		JFormattedTextField ds = new JFormattedTextField();
		ds.setBounds(447, 237, 107, 19);
		panel.add(ds);
		
		JFormattedTextField ca = new JFormattedTextField();
		ca.setBounds(447, 283, 107, 19);
		panel.add(ca);
		
		JFormattedTextField dsl = new JFormattedTextField();
		dsl.setBounds(447, 332, 107, 19);
		panel.add(dsl);
		
		JFormattedTextField oopl = new JFormattedTextField();
		oopl.setBounds(447, 379, 107, 19);
		panel.add(oopl);
		
		JFormattedTextField dpsd = new JFormattedTextField();
		dpsd.setBounds(447, 423, 107, 19);
		panel.add(dpsd);
		
		JFormattedTextField dm = new JFormattedTextField();
		dm.setBounds(447, 473, 107, 19);
		panel.add(dm);
		
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
				
				int softwareEngineering = 0, objectOrientedProgramming = 0, dataStructure = 0,
						computerArchitecture = 0, dataStructureLab = 0, oopLab = 0, 
						digitalPrincipleAndSystemDesign = 0, discreteMathematics = 0;
				boolean val=false;
				try {
					softwareEngineering = Integer.parseInt(se.getText());
					objectOrientedProgramming = Integer.parseInt(oops.getText());
					dataStructure = Integer.parseInt(ds.getText());
					computerArchitecture = Integer.parseInt(ca.getText());
					dataStructureLab= Integer.parseInt(dsl.getText());
					oopLab = Integer.parseInt(oopl.getText());
					digitalPrincipleAndSystemDesign = Integer.parseInt(dpsd.getText());
					discreteMathematics = Integer.parseInt(dm.getText());
					
				}catch(NumberFormatException ex)
				{
					// Display a warning about the invalid input 
					JOptionPane.showMessageDialog(null,"Invalid Input Please Enter the Valid Input",
							"Input Error",JOptionPane.WARNING_MESSAGE);
					val=true; // Use this to check whether the exception was thrown or not
				}
				
				if (softwareEngineering < 0 || softwareEngineering > 10 ||
					    objectOrientedProgramming < 0 || objectOrientedProgramming > 10 ||
					    dataStructure < 0 || dataStructure > 10 ||
					    computerArchitecture < 0 || computerArchitecture > 10 ||
					    dataStructureLab < 0 || dataStructureLab > 10 ||
					    oopLab < 0 || oopLab > 10 ||
					    digitalPrincipleAndSystemDesign < 0 || digitalPrincipleAndSystemDesign > 10 ||
					    discreteMathematics < 0 || discreteMathematics > 10) {

					    // Display a warning about the invalid range
					    JOptionPane.showMessageDialog(null, "Please enter values between 0 and 10.",
					            "Invalid Input", JOptionPane.WARNING_MESSAGE);
					    val = true; // Set the flag to indicate invalid input
					}
				if(val == false)
				{
					int total = (softwareEngineering*3) + (objectOrientedProgramming*3)+
							(dataStructure *3) + (computerArchitecture*3) + (dataStructureLab*2)+
							(oopLab*2) + (digitalPrincipleAndSystemDesign*3) + (discreteMathematics*4);
					double sgpa = (double)total/23.0;
					
					String formattedSGPA = String.format("your calculated sgpa is %.3f",sgpa);
					JOptionPane.showMessageDialog(null, formattedSGPA, "SGPA Calculation Result",
							JOptionPane.INFORMATION_MESSAGE);
							
				}
				se.setText("");
				oops.setText("");
				ds.setText("");
				ca.setText("");
				dsl.setText("");
				oopl.setText("");
				dm.setText("");
				dpsd.setText("");
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
