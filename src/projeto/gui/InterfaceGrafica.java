package projeto.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import projeto.loja.Admin;
import projeto.loja.Cliente;
import projeto.loja.ProdutoLiquido;
import projeto.loja.Venda;

import java.util.Arrays;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class InterfaceGrafica extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafica frame = new InterfaceGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public InterfaceGrafica() {
		
		Object[] opcoesA = {"Sim","Nao"}, opcoesB = {"Produto Liquido","Produto Solido"}, opcoesC = {"Cadastrar Cliente","Listar Clientes"};
		
		Cliente[] cliente = new Cliente[500];
		Cliente cliente1 = new Cliente("John", 1);
		cliente[1] = cliente1;
		Admin A = new Admin();
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceAdmin ia = new InterfaceAdmin();
				ia.newScreen();
			}
		});
		
		btnAdmin.setBounds(10, 195, 198, 73);
		contentPane.add(btnAdmin);
		
		JButton btnCliente = new JButton("CLIENTE");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c = JOptionPane.showOptionDialog(null,
			            "",
			            "",
			            JOptionPane.YES_NO_CANCEL_OPTION,
			            JOptionPane.DEFAULT_OPTION,
			            null,
			            opcoesC,
			            null);
				if(c == 0) {
					Cliente.cadastrarCliente(cliente, 1);
				}else {
					int g = 1;
                    while(cliente[g] != null){
                    	System.out.println(g + "- " + cliente[g].nome);
                        g++;
                    }
				}
			}
		});
		btnCliente.setBounds(337, 195, 198, 73);
		contentPane.add(btnCliente);
		
		JButton btnVenda = new JButton("REALIZAR VENDA");
		btnVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showOptionDialog(null,
			            "Cliente cadastrado?",
			            "",
			            JOptionPane.YES_NO_CANCEL_OPTION,
			            JOptionPane.DEFAULT_OPTION,
			            null,
			            opcoesA,
			            null);
				if(a == 0) {
					int g = 1;
					while(cliente[g] != null){
                    	System.out.println(g + "- " + cliente[g].nome);
                        g++;
                    }
					int i = 0;
					int cc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo (nº) do cliente: "));
	                while (i < cc){
	                    i++;
	                }
	                int b = JOptionPane.showOptionDialog(null,
				            "",
				            "",
				            JOptionPane.YES_NO_CANCEL_OPTION,
				            JOptionPane.DEFAULT_OPTION,
				            null,
				            opcoesB,
				            null);
	                if(b == 0) {
	                	A.listarProdutosLiquidos();
	                	Venda.comprarProdutoLiquido(cliente[cc], A);
	                }else {
	                	A.listarProdutosSolidos();
	                    Venda.comprarProdutoSolido(cliente[cc], A);
	                }
				}else {
					Cliente.cadastrarCliente(cliente, 1);
				}
			}
		});
		btnVenda.setBounds(174, 86, 198, 73);
		contentPane.add(btnVenda);
		
		JLabel lblNewLabel = new JLabel(" SISTEMA DE CONTROLE DE ESTOQUE");
		lblNewLabel.setFont(new Font("Maiandra GD", Font.BOLD, 27));
		lblNewLabel.setBounds(10, 11, 525, 50);
		contentPane.add(lblNewLabel);
	}
	

	
}
