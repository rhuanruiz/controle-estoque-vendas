package projeto.loja;
import java.util.*;

import javax.swing.JOptionPane;

public class Admin {
   
    private int ultimoLiquido=1, ultimoSolido=1;
    private int estoqueLiq = 0;
    private int estoqueSoli = 0;
   
    static ProdutoLiquido[] produtoLiq;
    static ProdutoSolido[] produtoSoli;
    static Produto[] vendas;
    
    Scanner entrada = new Scanner (System.in);
    
    public Admin() {
            produtoLiq = new ProdutoLiquido [500];
            ProdutoLiquido produtoL = new ProdutoLiquido("Agua Mineral", "01", 1);
           	produtoLiq[0] = produtoL;
           	produtoLiq[0].setEstoque(10);
           	produtoLiq[0].setQuantidade(1);
           	
            produtoSoli = new ProdutoSolido [500];
            ProdutoSolido produtoS = new ProdutoSolido("Sabao", "01", 1);
           	produtoSoli[0] = produtoS;
           	produtoSoli[0].setEstoque(10);
           	produtoSoli[0].setPeso(0.5);
           	
            vendas = new Produto[500];
    }
    
    public void cadastraProdutoLiquido(int quantidade){
        //Recebe a quantidade de produtos que quer cadastrar
        
        for (int i=1;i<=quantidade;i++){
            if (produtoLiq[499]!=null){
                System.out.println("O estoque esta cheio!");
            }else{
                System.out.println("\n/////////////// Cadastrando Produto Liquido \\\\\\\\\\\\\\\\\\");
                String nome = (JOptionPane.showInputDialog(null, "Digite o nome do produto: "));
                String marca = (JOptionPane.showInputDialog(null, "Digite a marca do produto: "));    
                double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preco: "));
                ProdutoLiquido produto = new ProdutoLiquido (nome,marca,preco);
                produtoLiq[ultimoLiquido]=produto;
                int estoque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade do estoque do produto: "));
                produtoLiq[ultimoLiquido].setEstoque(estoque);
                double volume = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o volume em litros de cada unidade: "));
                entrada.nextLine();
                produtoLiq[ultimoLiquido].setQuantidade(volume);
                ultimoLiquido= ultimoLiquido+1;
            }
            
        }
       
    }
    public void cadastrarProdutoSolido(int quantidade){
         
        for (int i=1;i<=quantidade;i++){
            if (produtoSoli[499]!=null){
                System.out.println("O estoque esta cheio!");
            }else{
                System.out.println("\n///////////// Cadastrando Produto Solido \\\\\\\\\\\\\\\\");
                String nome = (JOptionPane.showInputDialog(null, "Digite o nome do produto: "));
                String marca = (JOptionPane.showInputDialog(null, "Digite a marca do produto: "));
                double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preco: ")); 
                ProdutoSolido produto = new ProdutoSolido (nome,marca,preco);
                produtoSoli[ultimoSolido]=produto;
                int estoque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade do estoque do produto: "));
                produtoSoli[ultimoSolido].setEstoque(estoque);
                double volume = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o volume em litros de cada unidade: "));
                entrada.nextLine();                
                produtoSoli[ultimoSolido].setPeso(volume);
                ultimoSolido= ultimoSolido+1;
            }
        
         }
    }
    
    public void retirarProdutoLiquido(int cod){
        if (produtoLiq[cod-1].getNome()==null){
        	System.out.println("Nao ha produto com este codigo!!");
        }else{
        	produtoLiq[cod-1].setEstoque(0);
        	produtoLiq[cod-1].setMarca(null);
        	produtoLiq[cod-1].setNome(null);
        	produtoLiq[cod-1].setQuantidade(0);
        	produtoLiq[cod-1].setPreço(0);
        }
    }
  
    public void retirarProdutoSolido(int cod){
    	if (produtoSoli[cod-1].getNome()==null){
    		System.out.println("Nao ha produto com este codigo!!");
    	}else{
    		produtoSoli[cod-1].setEstoque(0);
    		produtoSoli[cod-1].setMarca(null);
    		produtoSoli[cod-1].setNome(null);
    		produtoSoli[cod-1].setPeso(0);
    		produtoSoli[cod-1].setPreço(0);
    	}
    }
    
    // quantidade de produto do mesmo tipo que vai acrescentar ao estoque
    // o codigo vai ser o parametro para localizar o produto no vetor e mudar a variavel estoque
    
    public void adicionarUnidadeLiquido(int quantidade, int cod){
        int aux;
        aux =  quantidade + produtoLiq[cod].getEstoque();
        produtoLiq[cod].setEstoque(aux);
    }
    
    public void adicinarUnidadeSolida (int quantidade, int cod ){
        int aux;
        aux = quantidade + produtoSoli[cod].getEstoque();
        produtoSoli[cod].setEstoque(aux);
    }
    
    public void retirarUnidadeLiquido (int quantidade, int cod){
        int aux;
        for(int i=1; i<=quantidade;i++){
            if (produtoLiq[cod].getEstoque()==0){
                System.out.println("Nao tem mais produto em estoque");
                break;
            }else{
                aux = produtoLiq[cod].getEstoque()-1;
                produtoLiq[cod].setEstoque(aux);
            }
        }
    }
    
    public void retirarUnidadeSolido(int quantidade, int cod){
        int aux;
        for(int i=1; i<=quantidade;i++){
            if (produtoSoli[cod].getEstoque()==0){
                System.out.println("Nao tem mais produto em estoque");
                break;
            }else{
                aux = produtoSoli[cod].getEstoque()-1;
                produtoSoli[cod].setEstoque(aux);
            }
        }
    }
    
    public boolean listarProdutosLiquidos(){
    System.out.println("Produtos Liquidos: \n");
    for(int i=0; produtoLiq[i]!= null; i++){
        System.out.println(i+ "-" + produtoLiq[i].getNome()); 
       
    }
    return true;
}
    
    public boolean listarProdutosSolidos(){
    System.out.println("Produtos Solidos: \n");
    for(int i=0; produtoSoli[i]!= null; i++){
        System.out.println(i+ "-" + produtoSoli[i].getNome()); 
       
    }
     return true;
}
    
 // ver como vai mostrar o cod, porque o cod sera a localizaÃ§ao no vetor   
}
