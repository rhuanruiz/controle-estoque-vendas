
package projeto.loja;

public class ProdutoSolido extends Produto {
	
    public double peso;
    public int estoque; 
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public ProdutoSolido(String nome, String marca, double pre�o) {
        super(nome, marca, pre�o);
      
    }
    
}

