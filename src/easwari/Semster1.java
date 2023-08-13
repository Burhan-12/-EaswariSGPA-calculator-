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


public class Semster1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semster1 window = new Semster1();
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
	public Semster1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 969, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 128, 0), new Color(0, 255, 0), null, null));
		panel.setBounds(47, 26, 878, 514);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSemsterFirst = new JLabel("FIRST SEMSTER");
		lblSemsterFirst.setForeground(new Color(128, 0, 255));
		lblSemsterFirst.setHorizontalAlignment(SwingConstants.CENTER);
		lblSemsterFirst.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblSemsterFirst.setBounds(324, 29, 268, 40);
		panel.add(lblSemsterFirst);
		
		JLabel lblEnterYourGrade = new JLabel("Enter your Grade against each subject");
		lblEnterYourGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourGrade.setForeground(new Color(255, 0, 0));
		lblEnterYourGrade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterYourGrade.setBounds(42, 79, 325, 65);
		panel.add(lblEnterYourGrade);
		
		JLabel lblPhysicsAndChemistryLaboratory = new JLabel("Physics and Chemistry Laboratory ");
		lblPhysicsAndChemistryLaboratory.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhysicsAndChemistryLaboratory.setForeground(Color.RED);
		lblPhysicsAndChemistryLaboratory.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPhysicsAndChemistryLaboratory.setBounds(36, 185, 288, 40);
		panel.add(lblPhysicsAndChemistryLaboratory);
		
		JLabel lblEngineeringGraphics = new JLabel("Engineering Graphics");
		lblEngineeringGraphics.setHorizontalAlignment(SwingConstants.LEFT);
		lblEngineeringGraphics.setForeground(Color.RED);
		lblEngineeringGraphics.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEngineeringGraphics.setBounds(36, 224, 182, 40);
		panel.add(lblEngineeringGraphics);
		
		JLabel lblProblemSolvingThroughPyhtonProgramming = new JLabel("Problem Sovling through Python Programming");
		lblProblemSolvingThroughPyhtonProgramming.setHorizontalAlignment(SwingConstants.LEFT);
		lblProblemSolvingThroughPyhtonProgramming.setForeground(Color.RED);
		lblProblemSolvingThroughPyhtonProgramming.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblProblemSolvingThroughPyhtonProgramming.setBounds(36, 270, 353, 40);
		panel.add(lblProblemSolvingThroughPyhtonProgramming);
		
		JLabel lblPythonProgrammingLaboratory = new JLabel("Python Programming Laboratory");
		lblPythonProgrammingLaboratory.setHorizontalAlignment(SwingConstants.LEFT);
		lblPythonProgrammingLaboratory.setForeground(Color.RED);
		lblPythonProgrammingLaboratory.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPythonProgrammingLaboratory.setBounds(36, 319, 353, 40);
		panel.add(lblPythonProgrammingLaboratory);
		
		JLabel lblTechnicalEnglish = new JLabel("Technical English");
		lblTechnicalEnglish.setHorizontalAlignment(SwingConstants.LEFT);
		lblTechnicalEnglish.setForeground(Color.RED);
		lblTechnicalEnglish.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTechnicalEnglish.setBounds(36, 366, 182, 40);
		panel.add(lblTechnicalEnglish);
		
		JLabel lblEngineeringMathematics1 = new JLabel("Engineering Mathematics-1");
		lblEngineeringMathematics1.setHorizontalAlignment(SwingConstants.LEFT);
		lblEngineeringMathematics1.setForeground(Color.RED);
		lblEngineeringMathematics1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEngineeringMathematics1.setBounds(36, 410, 216, 40);
		panel.add(lblEngineeringMathematics1);
		
		JLabel lblEngineeringChemistry = new JLabel("Engineering Chemistry");
		lblEngineeringChemistry.setHorizontalAlignment(SwingConstants.LEFT);
		lblEngineeringChemistry.setForeground(Color.RED);
		lblEngineeringChemistry.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEngineeringChemistry.setBounds(36, 138, 182, 40);
		panel.add(lblEngineeringChemistry);
		
		JLabel lblEngineeringPhysics = new JLabel("Engineering Physics");
		lblEngineeringPhysics.setHorizontalAlignment(SwingConstants.LEFT);
		lblEngineeringPhysics.setForeground(Color.RED);
		lblEngineeringPhysics.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEngineeringPhysics.setBounds(36, 460, 182, 40);
		panel.add(lblEngineeringPhysics);
		
		
		
		JFormattedTextField ec = new JFormattedTextField();
		ec.setBounds(447, 151, 107, 19);
		panel.add(ec);
		
	
		JFormattedTextField pcl = new JFormattedTextField();
		pcl.setBounds(447, 198, 107, 19);
		panel.add(pcl);
		
		
		JFormattedTextField eg = new JFormattedTextField();
		eg.setBounds(447, 237, 107, 19);
		panel.add(eg);
		
		
		JFormattedTextField pspp = new JFormattedTextField();
		pspp.setBounds(447, 283, 107, 19);
		panel.add(pspp);
		
		
		JFormattedTextField ppl = new JFormattedTextField();
		ppl.setBounds(447, 332, 107, 19);
		panel.add(ppl);
		
		
		JFormattedTextField te = new JFormattedTextField();
		te.setBounds(447, 379, 107, 19);
		panel.add(te);
		
		JFormattedTextField em1 = new JFormattedTextField();
		em1.setBounds(447, 423, 107, 19);
		panel.add(em1);
		
		
		JFormattedTextField ep = new JFormattedTextField();
		ep.setBounds(447, 473, 107, 19);
		panel.add(ep);
		
		
		JButton Return = new JButton("return");
		Return.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Return.setBounds(721, 178, 122, 54);
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
				int engChemistry=0 , phyChemLab=0, engGraphics=0, probSolvingThroughPythonProgramming=0;
				int pythonProgLab=0 ,techEnglish=0 ,engMath1=0 ,engPhysics=0;
				boolean val=false;
				try {
					 engChemistry= Integer.parseInt(ec.getText());
					 phyChemLab= Integer.parseInt(pcl.getText());
					 engGraphics= Integer.parseInt(eg.getText());
					 probSolvingThroughPythonProgramming = Integer.parseInt(pspp.getText());
					 pythonProgLab = Integer.parseInt(ppl.getText());
					 techEnglish= Integer.parseInt(te.getText());
					 engMath1= Integer.parseInt(em1.getText());
					 engPhysics= Integer.parseInt(ep.getText());
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,"Invalid Input Please Enter the Valid Input","Input Error",JOptionPane.WARNING_MESSAGE);
					val=true;
				}
				if (engChemistry < 0 || engChemistry > 10 ||
				        phyChemLab < 0 || phyChemLab > 10 ||
				        engGraphics < 0 || engGraphics > 10 ||
				        probSolvingThroughPythonProgramming < 0 || probSolvingThroughPythonProgramming > 10 ||
				        pythonProgLab < 0 || pythonProgLab > 10 ||
				        techEnglish < 0 || techEnglish > 10 ||
				        engMath1 < 0 || engMath1 > 10 ||
				        engPhysics < 0 || engPhysics > 10) {

				        // Display a warning about the invalid range
				        JOptionPane.showMessageDialog(null, "Please enter values between 0 and 10.",
				                "Invalid Input", JOptionPane.WARNING_MESSAGE);
				        val=true;
				    }
				
				if(val==false)
				{
					//THE NUMBER MULTIPLYING IS THEIR NUMBER OF CREDITS ASSIGNED BY THE UNVIERSITY
					
					int total= (engChemistry*3) + (phyChemLab*2) + (engGraphics*4) 
							+ (probSolvingThroughPythonProgramming*3) + (pythonProgLab*2)
							+ (techEnglish*3) + (engMath1*4) + (engPhysics*3);
					double sgpa=(double)total/24.0;
					//System.out.println(sgpa);
					
					String formattedSGPA = String.format("your calculated sgpa is %.3f", sgpa);
					JOptionPane.showMessageDialog(null, formattedSGPA, "SGPA Calculation Result", JOptionPane.INFORMATION_MESSAGE);
					
					
				}
				ec.setText("");
				pcl.setText("");
				eg.setText("");
				pspp.setText("");
				ppl.setText("");
				te.setText("");
				em1.setText("");
				ep.setText("");
				
				
				
			}
		});
		
		JButton exit1 = new JButton("exit");
		exit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		exit1.setBounds(721, 352, 122, 54);
		panel.add(exit1);
		
	}

}
