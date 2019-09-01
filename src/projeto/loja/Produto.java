package projeto.loja;

 
public class Produto {
    String nome;
    String marca;
    double preço;
     
   
    public Produto(String nome, String marca, double preço) {
        this.nome = nome;
        this.marca = marca;
        this.preço = preço;
        
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }




     
}
