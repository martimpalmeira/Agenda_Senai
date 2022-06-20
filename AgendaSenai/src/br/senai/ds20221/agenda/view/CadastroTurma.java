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
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class CadastroTurma extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
						CadastroTurma frame = new CadastroTurma();
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
	public CadastroTurma() {
		setTitle("GereciamentoSENAI");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Cadastro de turma", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel.setToolTipText("Cadastro de aluno");
		panel.setBounds(6, 19, 427, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(58,105,173));
		
		JLabel lblNewLabel = new JLabel("Número");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(27, 32, 98, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Curso");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(186, 32, 145, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblCpf = new JLabel("Semestre");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setBounds(27, 102, 61, 16);
		panel.add(lblCpf);
		
		JLabel lblNmeroDeMatrcula = new JLabel("Turno");
		lblNmeroDeMatrcula.setForeground(Color.WHITE);
		lblNmeroDeMatrcula.setBounds(186, 102, 145, 16);
		panel.add(lblNmeroDeMatrcula);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setForeground(new Color(29,79,138));
		btnNewButton.setBounds(271, 211, 117, 29);
		panel.add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(196, 65, 1, 1);
		panel.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desenvolvimento de Sistemas", "Eletrotécnica", "Eletromecânica", "Logística", "Redes de Computadores", "Automação Industrial"}));
		comboBox.setBounds(179, 60, 135, 27);
		comboBox.setForeground(new Color(29,79,138));
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setForeground(new Color(29,79,138));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2021.1", "2021.2", "2022.1", "2022.2", "Outro"}));
		comboBox_1.setBounds(27, 129, 130, 27);
		panel.add(comboBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Matutino");
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setBounds(186, 117, 128, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxVespertino = new JCheckBox("Vespertino");
		chckbxVespertino.setForeground(Color.WHITE);
		chckbxVespertino.setBounds(186, 140, 128, 23);
		panel.add(chckbxVespertino);
		
		JCheckBox chckbxNoturno = new JCheckBox("Noturno");
		chckbxNoturno.setForeground(Color.WHITE);
		chckbxNoturno.setBounds(186, 162, 128, 23);
		panel.add(chckbxNoturno);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField.setBackground(new Color(29, 79, 138));
		textField.setBounds(27, 60, 130, 26);
		panel.add(textField);
	}
}
