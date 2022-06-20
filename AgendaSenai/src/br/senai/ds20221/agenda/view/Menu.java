package br.senai.ds20221.agenda.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.ds20221.agenda.model.Aluno;
import javax.swing.JLabel;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 340);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Cadastrar");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Aluno");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroAluno aluno = new CadastroAluno();
				aluno.setVisible(true);
			}
		});

		mntmNewMenuItem.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Professor");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroProfessor cadProf = new CadastroProfessor();
				cadProf.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Laboratório");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroLaboratorio cadLab = new CadastroLaboratorio();
				cadLab.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Turma");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroTurma cadTurma = new CadastroTurma();
				cadTurma.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_6);

		JMenu mnListar = new JMenu("Listar");
		menuBar.add(mnListar);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aluno");
		mnListar.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_4_1 = new JMenuItem("Professor");
		mnListar.add(mntmNewMenuItem_4_1);

		JMenuItem mntmNewMenuItem_5_1 = new JMenuItem("Laboratório");
		mnListar.add(mntmNewMenuItem_5_1);

		JMenuItem mntmNewMenuItem_6_1 = new JMenuItem("Turma");
		mnListar.add(mntmNewMenuItem_6_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sair");
		menuBar.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 471, 300);
		contentPane.add(panel);
		panel.setBackground(new Color(29,79,138));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(112, 39, 245, 225);
		panel.add(lblNewLabel);
		
		ImageIcon imagemMenu = new ImageIcon(this.getClass().getResource("../images/imagemMenu.png"));
		lblNewLabel.setIcon(imagemMenu);
	}
}
