package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField jTnome;
	private JPasswordField jPsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(54, 74, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(54, 118, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		jTnome = new JTextField();
		jTnome.setBounds(110, 71, 211, 20);
		contentPane.add(jTnome);
		jTnome.setColumns(10);
		
		jPsenha = new JPasswordField();
		jPsenha.setBounds(110, 115, 211, 20);
		contentPane.add(jPsenha);
		
		JButton jBentrar = new JButton("Entrar");
		jBentrar.setBounds(173, 146, 89, 23);
		contentPane.add(jBentrar);
		
		JButton jBcancelar = new JButton("Cancelar");
		jBcancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		jBcancelar.setBounds(173, 180, 89, 23);
		contentPane.add(jBcancelar);
	}
}
