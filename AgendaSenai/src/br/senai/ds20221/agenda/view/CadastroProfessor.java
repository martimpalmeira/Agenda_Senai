package br.senai.ds20221.agenda.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

public class CadastroProfessor extends JFrame {


	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
						CadastroProfessor frame = new CadastroProfessor();
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
	public CadastroProfessor() {
		setTitle("GereciamentoSENAI");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Cadastro de professor", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel.setToolTipText("Cadastro de aluno");
		panel.setBounds(20, 6, 380, 246);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(58,105,173));

		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(27, 19, 37, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data de nascimento");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(186, 19, 145, 16);
		panel.add(lblNewLabel_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(186, 47, 145, 26);
		panel.add(dateChooser);
		dateChooser.setBackground(new Color(58,105,173));
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setBounds(27, 85, 61, 16);
		panel.add(lblCpf);
		
		JLabel lblNmeroDeMatrcula = new JLabel("Formação");
		lblNmeroDeMatrcula.setForeground(Color.WHITE);
		lblNmeroDeMatrcula.setBounds(186, 85, 145, 16);
		panel.add(lblNmeroDeMatrcula);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(242, 211, 117, 29);
		panel.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField_1.setBackground(new Color(29, 79, 138));
		textField_1.setBounds(27, 47, 130, 26);
		panel.add(textField_1);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField.setBackground(new Color(29, 79, 138));
		textField.setBounds(27, 102, 130, 26);
		panel.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField_2.setBackground(new Color(29, 79, 138));
		textField_2.setBounds(186, 102, 130, 26);
		panel.add(textField_2);
	}

}
