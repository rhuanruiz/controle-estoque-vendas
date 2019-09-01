package projeto.gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;

import projeto.loja.Admin;
import projeto.loja.Cliente;
import projeto.loja.ProjetoLoja;

import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.Scanner;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class InterfaceAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	Scanner sc = new Scanner(System.in);
	public static void newScreen() {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceAdmin frame = new InterfaceAdmin();
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
	
	public InterfaceAdmin() {
		setTitle("ADMIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Admin A = new Admin();
		Object[] opcoesA = {"Produto Solido","Produto Liquido"};
		
		JButton btnCadastrarProdutoLiquido = new JButton("Cadastrar produto liquido");
		btnCadastrarProdutoLiquido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de itens liquidos que deseja cadastrar: "));
				A.cadastraProdutoLiquido(a);
			}
		});
		btnCadastrarProdutoLiquido.setBounds(10, 11, 165, 35);
		contentPane.add(btnCadastrarProdutoLiquido);
		
		JButton btnCadastrarProdutoSolido = new JButton("Cadastrar produto solido");
		btnCadastrarProdutoSolido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de itens solidos que deseja cadastrar: "));
				A.cadastrarProdutoSolido(b);
			}
		});
		btnCadastrarProdutoSolido.setBounds(10, 57, 165, 35);
		contentPane.add(btnCadastrarProdutoSolido);
		
		JButton btnCadastrar = new JButton("Listar produtos disponiveis");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjetoLoja.listarProdutosSolidosDisponiveis(A);
                ProjetoLoja.listarProdutosLiquidosDisponiveis(A);
			}
		});
		btnCadastrar.setBounds(10, 103, 165, 35);
		contentPane.add(btnCadastrar);
		
		JButton btnListarProdutosEsgotados = new JButton("Listar produtos esgotados");
		btnListarProdutosEsgotados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjetoLoja.listarProdutosSolidosIndisponiveis(A);
            	ProjetoLoja.listarProdutosLiquidosIndisponiveis(A);
			}
		});
		btnListarProdutosEsgotados.setBounds(10, 149, 165, 35);
		contentPane.add(btnListarProdutosEsgotados);
		
		JButton btnListarTodosOs = new JButton("Listar todos os produtos");
		btnListarTodosOs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjetoLoja.listarProdutosSolidos(A);
            	ProjetoLoja.listarProdutosLiquidos(A);
			}
		});
		btnListarTodosOs.setBounds(10, 195, 165, 35);
		contentPane.add(btnListarTodosOs);
		
		JButton btnAdicionarProdutosAo = new JButton("Adc. produtos ao estoque");
		btnAdicionarProdutosAo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c = JOptionPane.showOptionDialog(null,
			            "Escolha uma das opcoes",
			            "",
			            JOptionPane.YES_NO_CANCEL_OPTION,
			            JOptionPane.DEFAULT_OPTION,
			            null,
			            opcoesA,
			            null);
				int cd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do item que voce quer adicionar ao estoque: "));
				int qt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade que voce gostaria de adicionar ao estoque: "));
				if(c == 0) {
					A.adicinarUnidadeSolida(qt, cd);
				}else {
					A.adicionarUnidadeLiquido(qt, cd);
				}
			}
		});
		btnAdicionarProdutosAo.setBounds(10, 241, 165, 35);
		contentPane.add(btnAdicionarProdutosAo);
		
		JButton btnListarVendas = new JButton("Listar Vendas");
		btnListarVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjetoLoja.listarVendas(A);
			}
		});
		btnListarVendas.setBounds(10, 287, 165, 35);
		contentPane.add(btnListarVendas);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceAdmin.super.dispose();
			}
		});
		btnVoltar.setBounds(371, 287, 165, 35);
		contentPane.add(btnVoltar);
	}
}
