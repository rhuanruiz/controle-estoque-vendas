
package projeto.loja;

public class ProdutoLiquido extends Produto {
	
	//Essa e a quntidade de produtos no estoque
	public int estoque;
	//Essa quantidade em litros ou ml
	private double quantidade;

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque+this.estoque;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
         
    public ProdutoLiquido(String nome, String marca, double preco) {
        super(nome, marca, preco);
   
    }
    
}
