package br.senai.ds20221.agenda.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.senai.ds20221.agenda.model.Admin;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JTable table;
	private JPasswordField textSenha;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 455, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(58, 105, 173));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textUsuario = new JTextField();
		textUsuario.setForeground(new Color(255, 255, 255));
		textUsuario.setBounds(258, 104, 130, 26);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		textUsuario.setBackground(new Color(29, 79, 138));
		textUsuario.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setBounds(258, 158, 51, 16);
		contentPane.add(lblSenha);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 186, 278);
		panel.setBackground(new Color(29, 79, 138));
		contentPane.add(panel);
		panel.setBorder(new LineBorder(new Color(29, 79, 138)));
		panel.setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(1, 1, 1, 276);
		panel.add(layeredPane);

		table = new JTable();
		table.setBounds(1, 277, 184, 0);
		panel.add(table);

		JLabel lblAgendaSenai = new JLabel("AGENDA SENAI");
		lblAgendaSenai.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 17));
		lblAgendaSenai.setForeground(Color.WHITE);
		lblAgendaSenai.setBounds(24, 23, 129, 33);
		panel.add(lblAgendaSenai);
		ImageIcon loginImage = new ImageIcon(this.getClass().getResource("../images/loginIcon.png"));

		JLabel lblNewLabel_2 = new JLabel("");
		ImageIcon agendaImg = new ImageIcon(this.getClass().getResource("../images/agendaIcon.png"));
		lblNewLabel_2.setIcon(agendaImg);
		lblNewLabel_2.setBounds(147, 23, 33, 33);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(6, 68, 179, 193);
		panel.add(lblNewLabel_1);

		lblNewLabel_1.setIcon(loginImage);
		lblNewLabel_1.setBackground(new Color(0, 0, 0));

		JButton btnEntrar = new JButton("Entrar\n");
		
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario, senha;
				usuario = textUsuario.getText();
				senha = textSenha.getText();
				if (!usuario.equals(Admin.getLogin()) || !senha.equals(Admin.getPassword())) {
					JOptionPane.showMessageDialog(null, "\n" + "Usuário ou senha incorretos.");
				} else {
					Menu menu = new Menu();
					menu.setVisible(true);
					

				}
			}
		});
		btnEntrar.setForeground(new Color(240, 88, 47));
		btnEntrar.setBounds(258, 231, 117, 29);
		contentPane.add(btnEntrar);
		btnEntrar.setBackground(new Color(100, 149, 237));

		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setBounds(258, 80, 48, 16);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));

		textSenha = new JPasswordField();
		textSenha.setForeground(Color.WHITE);
		textSenha.setBounds(258, 175, 130, 26);
		textSenha.setBackground(new Color(29, 79, 138));
		textSenha.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(textSenha);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_1.setBounds(211, 24, 213, 248);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(58, 105, 173));
	}
}
