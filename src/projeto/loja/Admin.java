package projeto.loja;
import java.util.*;

public class Admin {
    // variaveis para localizar espaco vazio e colocar o objeto e tambem para lembra qual foi o ultimo espaco utilizado.
    private int ultimoLiquido=1, ultimoSolido=1;
    //variaveis para estoque do solido e do liquido
    private int estoqueLiq = 0;
    private int estoqueSoli = 0;
    //Array de produto liquido e produto solido
    static ProdutoLiquido[] produtoLiq;
    static ProdutoSolido[] produtoSoli;
    static Produto[] vendas;
    Scanner entrada = new Scanner (System.in);
    
    
    //Construtor
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
                System.out.println("Digite o nome do Produto, por favor ");
                String nome=entrada.nextLine();
                System.out.println("Digite a marca do Produto, por favor ");
                String marca = entrada.nextLine();
                System.out.println("Digite o preço: ");
                double preco=entrada.nextDouble();
                ProdutoLiquido produto = new ProdutoLiquido (nome,marca,preco);
                produtoLiq[ultimoLiquido]=produto;
                System.out.println("Digite a quantidade que tem desse produto");
                int estoque =entrada.nextInt();
                produtoLiq[ultimoLiquido].setEstoque(estoque);
                System.out.println("Digite o volume em litros em cada Unidade: ");
                double volume =entrada.nextDouble();
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
                System.out.println("Digite o nome do Produto, por favor ");
                String nome=entrada.nextLine();
                System.out.println("Digite a marca do Produto, por favor ");
                String marca = entrada.nextLine();
                System.out.println("Digite o Preço: ");
                double preco=entrada.nextDouble(); 
                ProdutoSolido produto = new ProdutoSolido (nome,marca,preco);
                produtoSoli[ultimoSolido]=produto;
                System.out.println("Digite a quantidade que tem desse produto:");
                int estoque =entrada.nextInt();
                produtoSoli[ultimoSolido].setEstoque(estoque);
                System.out.println("Digite o volume em kg: ");
                double volume =entrada.nextDouble();
                entrada.nextLine();                
                produtoSoli[ultimoSolido].setPeso(volume);
                ultimoSolido= ultimoSolido+1;
            }
        
         }
    }
    
    public void retirarProdutoLiquido(int cod){
        if (produtoLiq[cod-1].getNome()==null){
        	System.out.println("Não tem produto Com esse codigo!!");
        }else{
        	produtoLiq[cod-1].setEstoque(0);
        	produtoLiq[cod-1].setMarca(null);
        	produtoLiq[cod-1].setNome(null);
        	produtoLiq[cod-1].setQuantidade(0);
        	produtoLiq[cod-1].setPre�o(0);
        }
    }
  
    public void retirarProdutoSolido(int cod){
    	if (produtoSoli[cod-1].getNome()==null){
    		System.out.println("Não tem produto Com esse codigo!!");
    	}else{
    		produtoSoli[cod-1].setEstoque(0);
    		produtoSoli[cod-1].setMarca(null);
    		produtoSoli[cod-1].setNome(null);
    		produtoSoli[cod-1].setPeso(0);
    		produtoSoli[cod-1].setPre�o(0);
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
    System.out.println("Produtos Líquidos: \n");
    for(int i=0; produtoLiq[i]!= null; i++){
        System.out.println(i+ "-" + produtoLiq[i].getNome()); 
       
    }
    return true;
}
    
    public boolean listarProdutosSolidos(){
    System.out.println("Produtos Líquidos: \n");
    for(int i=0; produtoSoli[i]!= null; i++){
        System.out.println(i+ "-" + produtoSoli[i].getNome()); 
       
    }
     return true;
}
    
 // ver como vai mostrar o cod, porque o cod sera a localizaçao no vetor   
}
