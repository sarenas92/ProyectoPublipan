package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class formu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formu frame = new formu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public formu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CREAR CLIENTE");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(154, 48, 159, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(43, 83, 84, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Empresa");
		lblNewLabel_2.setBounds(43, 172, 84, 21);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(154, 172, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(154, 83, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDireccion = new JLabel("DIreccion");
		lblDireccion.setBounds(43, 115, 84, 14);
		contentPane.add(lblDireccion);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 112, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIdentificacioon = new JLabel("Identificacioon");
		lblIdentificacioon.setBounds(43, 147, 84, 14);
		contentPane.add(lblIdentificacioon);
		
		JLabel lblNewLabel_3 = new JLabel("Logotipo");
		lblNewLabel_3.setBounds(267, 86, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 432, 21);
		contentPane.add(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Inicio");
		menuBar.add(mntmNewMenuItem);
		
		
		
		JMenuItem mntmPublicaciones = new JMenuItem("Publicaciones");
		menuBar.add(mntmPublicaciones);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		menuBar.add(mntmSalir);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "CC  :", "ID   :", "NIT :"}));
		comboBox.setBounds(154, 143, 86, 18);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(154, 222, 91, 23);
		contentPane.add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(335, 89, 86, 43);
		contentPane.add(textPane);
		
		JButton btnNewButton_1 = new JButton("Subir");
		btnNewButton_1.setBounds(345, 143, 65, 23);
		contentPane.add(btnNewButton_1);
	}
}
