package projeto.loja;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Venda {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void CadastrarVenda(Produto c){
        int h =1;
        while(Admin.vendas[h] != null){
            h++;
        }
        Admin.vendas[h] = c ;        
    }
	
	public static void comprarProdutoSolido(Cliente cliente, Admin A){
		int p = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do produto que você quer comprar: "));
		int i = 0;
		while (i < p-1){
			i++;
		}
		double preco = A.produtoSoli[i].preço;
		JOptionPane.showMessageDialog(null, "O preco do produto e: " + A.produtoSoli[i].preço);
		double pagamento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite com quanto pagara: "));
		double troco = pagamento - preco;
		cliente.adicionarCompra(A.produtoSoli[i]);
		CadastrarVenda(A.produtoSoli[i]);
		A.retirarUnidadeSolido(1, i);
		JOptionPane.showMessageDialog(null, "Venda Realizada! Troco: " + troco + " reais");
    }
	
	public static void comprarProdutoLiquido(Cliente cliente, Admin A){
		int p = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do produto que você quer comprar: "));
		int i = 0;
		while (i < p-1){
			i++;
		}
		double preco = A.produtoLiq[i].preço;
		JOptionPane.showMessageDialog(null, "O preco do produto e: " + A.produtoLiq[i].preço);
		double pagamento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite com quanto pagara: "));
		double troco = pagamento - preco;
		cliente.adicionarCompra(A.produtoLiq[i]);
		CadastrarVenda(A.produtoLiq[i]);
		A.retirarUnidadeLiquido(1, i);
		JOptionPane.showMessageDialog(null, "Venda Realizada! Troco: " + troco + " reais"); 
	}
	
	
}
