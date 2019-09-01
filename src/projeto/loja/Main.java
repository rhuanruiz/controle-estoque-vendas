package projeto.loja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
		
        /*Admin A = new Admin();
        
        int c = 1;
        do{  
        System.out.println("1-Admin");
        System.out.println("2-Cliente");
        System.out.println("3-Sair"); 
        int c2 = sc.nextInt();
        switch(c2){
            case 1:
                System.out.println("1- Cadastrar Produto Liquido");
                System.out.println("2- Cadastrar Produto Solido");
                System.out.println("3- Cadastrar Cliente");
                System.out.println("4- Listar produtos disponiveis");
                System.out.println("5- Listar produtos esgotados");
                System.out.println("6- Listar todos os produtos");
                System.out.println("7- Adicionar produtos no estoque");
                System.out.println("8- Listar todos os clientes cadastrados");
                System.out.println("9- Listar vendas");
                
                
                switch(sc.nextInt()){
                    case 1:
                        System.out.println("Digite a quantidade de itens liquidos que deseja cadastrar");
                        A.cadastraProdutoLiquido(sc.nextInt());
                        break;
                    
                    case 2:
                        System.out.println("Digite a quantidade de itens solidos que deseja cadastrar");
                        A.cadastrarProdutoSolido(sc.nextInt());
                        break;
                    case 3: 
                        System.out.println("Digite a quantidade de clientes que deseja cadastrar");
                        //Cliente.cadastrarCliente(cliente, sc.nextInt());
                        break;
                    case 4:
                        ProjetoLoja.listarProdutosSolidosDisponiveis(A);
                        ProjetoLoja.listarProdutosLiquidosDisponiveis(A);
                        break;
                    case 5: 
                    	ProjetoLoja.listarProdutosSolidosIndisponiveis(A);
                    	ProjetoLoja.listarProdutosLiquidosIndisponiveis(A);
                        break;
                    case 6:
                    	ProjetoLoja.listarProdutosSolidos(A);
                    	ProjetoLoja.listarProdutosLiquidos(A);
                        break;
                    case 7:
                        System.out.println("1- Adicionar produto solido no estoque");
                        System.out.println("2- Adicionar produto liquido no estoque");
                        int d = sc.nextInt();
                        System.out.println("Digite o codigo do item que voce quer adicionar ao estoque: ");
                        int cd = sc.nextInt();
                        System.out.println("Digite a quantidade que voce gostaria de adicionar ao estoque: ");
                        int qt = sc.nextInt();
                        if (d == 1){
                           A.adicinarUnidadeSolida(qt, cd);
                        }
                        else {
                            A.adicionarUnidadeLiquido(qt, cd);
                        }
                        break;
                    case 8: 
                        int x = 1;
                        /*while (cliente2[x] != null){
                            System.out.println("Cliente "+  x + " - " + cliente2[x].nome);
                            x++;
                        }
                        break;
                    case 9:
                    	
                        int g = 1;
                        while(A.vendas[g] != null){
                            System.out.println("Venda " +g+ " - "+A.vendas[g].nome );
                            g++;
                        }
                        break;
                        
                    default: 
                        System.out.println("Digite uma opcaoo valida");
                        break;
                                
                }
                break;
            case 2:
                int i = 0;
                System.out.println("Digite seu codigo:");
                int cc = sc.nextInt();
                while (i < cc){
                    i++;
                }
                //Cliente cliente3 = cliente2[i];
                //System.out.println("Bem vindo "+cliente3.nome+"!");
                System.out.println("1- Comprar produtos solidos");
                System.out.println("2- Comprar produtos liquidos");
                switch(sc.nextInt()){
                    case 1:
                        A.listarProdutosSolidos();
                       // Venda.comprarProdutoSolido(cliente3, A);
                        main(args);
                                
                        break;
                    case 2:
                        A.listarProdutosLiquidos();
                        //Venda.comprarProdutoLiquido(cliente3, A);
                        main(args);
                        break;      
                }
            case 3:
                c = 0;
                break;
            default:
                    break;
        }
        } while(c != 0);*/
	}        
}
