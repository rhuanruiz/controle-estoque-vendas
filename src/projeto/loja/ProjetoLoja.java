package projeto.loja;
import java.util.Scanner;

public class ProjetoLoja {
	
	static Scanner sc = new Scanner(System.in); 

	public static void listarProdutosSolidos(Admin A){
		System.out.println("Produtos Solidos: ");
		for(int i=0; A.produtoSoli[i]!= null; i++){
			System.out.print(i+1 + " - "); 
			System.out.println(A.produtoSoli[i].nome);
		}
		System.out.println("\n");
	}

	public static void listarProdutosLiquidos(Admin A){
		System.out.println("Produtos Liquidos: ");
		for(int i=0; Admin.produtoLiq[i]!= null; i++){
			System.out.print(i+1 + " - "); 
			System.out.println(Admin.produtoLiq[i].nome);
		}
		System.out.println("\n");
	}
	
	public static void listarProdutosSolidosDisponiveis(Admin A){
		System.out.println("Produtos Solidos Disponiveis: \n");
		for(int i=0; A.produtoSoli[i]!= null; i++){
			if (A.produtoSoli[i].estoque != 0){
				++i;
				System.out.print(i+ " - "); 
				i--;
				System.out.println(A.produtoSoli[i].nome);
			}
		}
	}
	
	public static void listarProdutosSolidosIndisponiveis(Admin A){
		System.out.println("Produtos Solidos Indisponiveis: \n");
		for(int i=0; A.produtoSoli[i]!= null; i++){
			if (A.produtoSoli[i].estoque == 0){
				++i;
				System.out.print(i+ " - "); 
				i--;
				System.out.println(A.produtoSoli[i].nome);
			}
		}
	}
	
	public static void listarProdutosLiquidosDisponiveis(Admin A){
		System.out.println("Produtos Liquidos Disponiveis: \n");
		for(int i=0; A.produtoLiq[i]!= null; i++){
			if (A.produtoLiq[i].estoque != 0){
				i++;
				System.out.print(i+ " - "); 
				i--;
				System.out.println(A.produtoLiq[i].nome);
			}
		}
	}
	
	public static void listarProdutosLiquidosIndisponiveis(Admin A){
		System.out.println("Produtos Liquidos Indisponiveis: \n");
		for(int i=0; A.produtoLiq[i]!= null; i++){
			if (A.produtoLiq[i].estoque == 0){
				i++;
				System.out.print(i+ " - "); 
				i--;
				System.out.println(A.produtoLiq[i].nome);
			}
		}
	}   
}
                                
                   
                                
                        
                

 
   



    
    
    
    
    
    
    
    
    

