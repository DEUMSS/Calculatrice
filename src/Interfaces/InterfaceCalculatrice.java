package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class InterfaceCalculatrice extends JFrame implements ActionListener{
	
	private JButton button0 = new JButton("0");
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton buttonPlus = new JButton("+");
	private JButton buttonMoins = new JButton("-");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");
	private JButton buttonX = new JButton("X");
	//private JButton buttonDiv = new JButton("/");
	private JButton buttonEqual = new JButton("=");
	private JButton buttonAC = new JButton("AC");
	
	private JPanel panel = new JPanel();
	private JPanel conteneur = new JPanel();
	private JLabel ecran = new JLabel();

	public InterfaceCalculatrice(String title) {
		super(title);
		this.setSize(new Dimension(600,600));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		ecran.setPreferredSize(new Dimension(250,100));
		this.setContentPane(panel);
		panel.setLayout(new FlowLayout());
		conteneur.add(ecran);
		panel.add(conteneur);
		this.setSize(300,400);
		panel.setLayout( new FlowLayout());
		conteneur.setBackground(Color.DARK_GRAY);
		panel.setBackground(Color.GRAY);
		buttonPlus.setBackground(Color.GRAY);
		buttonMoins.setBackground(Color.GRAY);
		buttonEqual.setBackground(Color.GRAY);
		buttonX.setBackground(Color.GRAY);
		buttonAC.setBackground(Color.GRAY);
		
		panel.add(this.button0);
		panel.add(this.button1);
		panel.add(this.button2);
		panel.add(this.button3);
		panel.add(this.button4);
		panel.add(this.button5);
		panel.add(this.button6);
		panel.add(this.buttonPlus);
		panel.add(this.buttonMoins);
		panel.add(this.button7);
		panel.add(this.button8);
		panel.add(this.button9);
		panel.add(this.buttonX);
		//panel.add(this.buttonDiv);
		panel.add(this.buttonEqual);
		panel.add(this.buttonAC);
		
		this.button0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button0.getText();
				System.out.println(x);
			}
		});
		this.button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button1.getText();
				System.out.println(x);
			}
		});
		this.button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button2.getText();
				System.out.println(x);
			}
		});
		this.button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button3.getText();
				System.out.println(x);
			}
		});
		this.button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button4.getText();				
				System.out.println(x);
			}
		});
		this.button5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button5.getText();
				System.out.println(x);
			}
		});
		this.button6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button6.getText();
				System.out.println(x);
			}
		});
		this.button7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button7.getText();
				System.out.println(x);
			}
		});
		this.button8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button8.getText();
				System.out.println(x);
			}
		});
		this.button9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button9.getText();
				System.out.println(x);
			}
		});
		this.buttonEqual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = buttonEqual.getText();
				System.out.println(x);
			}
		});
		this.buttonPlus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = button3.getText();
				System.out.println(x);
			}
		});
		this.buttonMoins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = buttonMoins.getText();
				System.out.println(x);
			}
		});
		this.buttonX.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = buttonX.getText();
				System.out.println(x);
			}
		});
		this.buttonAC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = buttonAC.getText();
				System.out.println(x);
			}
		});
	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InterfaceCalculatrice lf = new InterfaceCalculatrice("Calculatrice");
		lf.setVisible(true);
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



}
