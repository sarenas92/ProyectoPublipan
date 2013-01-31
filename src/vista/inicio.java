package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import sun.java2d.Disposer;

import java.awt.Button;
import java.awt.Toolkit;

public class inicio {

	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio window = new inicio();
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
	public inicio() {
		initialize();
	}

	/**
	 * ("imagenes"+System.getProperty("file.separator")+"logotype.png"));
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes"+System.getProperty("file.separator")+"descarga.jpg"));
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().setBackground(new Color(220, 220, 220));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 162, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(97, 192, 84, 18);
		frame.getContentPane().add(lblPassword);
		lblPassword.setFont(new Font("SansSerif", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(97, 162, 70, 19);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 191, 86, 20);
		frame.getContentPane().add(passwordField);
		
		Button button = new Button("Enviar");
		button.setBackground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Bolsa miformulario = new Bolsa();
				miformulario.setVisible(true);
				miformulario.setDefaultCloseOperation(1);
			}
		});
		button.setBounds(159, 222, 70, 22);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("imagenes"+System.getProperty("file.separator")+"logotype.png"));
		lblNewLabel_1.setBounds(10, 21, 424, 130);
		frame.getContentPane().add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu menu = new JMenu("New menu");
		mnNewMenu_1.add(menu);
	}
}
