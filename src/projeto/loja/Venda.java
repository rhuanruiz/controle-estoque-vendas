package projeto.loja;
import java.util.Scanner;

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
		System.out.println("Digite o numero do produto que voce quer comprar: ");
		int p = sc.nextInt();
		int i = 0;
		while (i < p-1){
			i++;
		}
		double preco = A.produtoSoli[i].preço;
		System.out.println("O preco do produto e: " + A.produtoSoli[i].preço);
		System.out.println("Digite com quanto voce vai pagar: ");
		double pagamento = sc.nextInt();
		double troco = pagamento - preco;
		cliente.adicionarCompra(A.produtoSoli[i]);
		CadastrarVenda(A.produtoSoli[i]);
		A.retirarUnidadeSolido(1, i);
		System.out.println("Seu troco sera de: " + troco + " reais");
    }
	
	public static void comprarProdutoLiquido(Cliente cliente, Admin A){
		System.out.println("Digite o numero do produto que voce quer comprar");
		int p = sc.nextInt();
		int i = 0;
		while (i < p-1){
			i++;
		}
		double preco = A.produtoLiq[i].preço;
		System.out.println("O preco do produto e:" + A.produtoLiq[i].preço);
		System.out.println("Digite com quanto voce vai pagar: ");
		double pagamento = sc.nextDouble();
		double troco = pagamento - preco;
		cliente.adicionarCompra(A.produtoLiq[i]);
		CadastrarVenda(A.produtoLiq[i]);
		A.retirarUnidadeLiquido(1, i);
		System.out.println("Seu troco sera de: " + troco + " reais");   
	}
}
