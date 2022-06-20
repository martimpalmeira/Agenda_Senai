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
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class CadastroLaboratorio extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
						CadastroLaboratorio frame = new CadastroLaboratorio();
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
	public CadastroLaboratorio() {
		setTitle("GereciamentoSENAI");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Cadastro de laborat\u00F3rio", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("Cadastro de aluno");
		panel.setBounds(20, 6, 380, 246);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(30, 29, 37, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prédio");
		lblNewLabel_1.setBounds(186, 29, 145, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblCpf = new JLabel("Andar");
		lblCpf.setBounds(27, 85, 61, 16);
		panel.add(lblCpf);
		
		JLabel lblNmeroDeMatrcula = new JLabel("Número de máquinas");
		lblNmeroDeMatrcula.setBounds(186, 85, 145, 16);
		panel.add(lblNmeroDeMatrcula);
		
		textField_2 = new JTextField();
		textField_2.setBounds(185, 102, 130, 26);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(242, 211, 117, 29);
		panel.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(27, 47, 130, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CIMATEC 1", "CIMATEC 2", "CIMATEC 3 ", "CIMATEC 4", "SESI"}));
		comboBox.setBounds(186, 48, 129, 27);
		panel.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Térreo");
		chckbxNewCheckBox.setBounds(27, 103, 128, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("1º ");
		chckbxNewCheckBox_1.setBounds(27, 124, 128, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("2º");
		chckbxNewCheckBox_1_1.setBounds(27, 145, 128, 23);
		panel.add(chckbxNewCheckBox_1_1);
	}

}
