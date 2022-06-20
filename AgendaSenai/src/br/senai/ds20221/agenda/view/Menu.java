package br.senai.ds20221.agenda.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JTable;
import com.toedter.calendar.JDayChooser;
import org.junit.matchers.JUnitMatchers;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;

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
		setBounds(100, 100, 714, 355);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		
		JMenu mnAgendar = new JMenu("Agendar");
		menuBar.add(mnAgendar);
		
		JMenu mnNewMenu = new JMenu("Cadastrar");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Aluno");
		mntmNewMenuItem.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Professor");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Laboratório");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Turma");
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
		
		JMenu mnAlterar = new JMenu("Alterar");
		menuBar.add(mnAlterar);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Aluno");
		mnAlterar.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_4_2 = new JMenuItem("Professor");
		mnAlterar.add(mntmNewMenuItem_4_2);
		
		JMenuItem mntmNewMenuItem_5_2 = new JMenuItem("Laboratório");
		mnAlterar.add(mntmNewMenuItem_5_2);
		
		JMenuItem mntmNewMenuItem_6_2 = new JMenuItem("Turma");
		mnAlterar.add(mntmNewMenuItem_6_2);
		
		JMenu mnExcluir = new JMenu("Excluir");
		menuBar.add(mnExcluir);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Aluno");
		mnExcluir.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4_3 = new JMenuItem("Professor");
		mnExcluir.add(mntmNewMenuItem_4_3);
		
		JMenuItem mntmNewMenuItem_5_3 = new JMenuItem("Laboratório");
		mnExcluir.add(mntmNewMenuItem_5_3);
		
		JMenuItem mntmNewMenuItem_6_3 = new JMenuItem("Turma");
		mnExcluir.add(mntmNewMenuItem_6_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
