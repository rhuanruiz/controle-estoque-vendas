package projeto.loja;

 
public class Produto {
    String nome;
    String marca;
    double pre�o;
     
   
    public Produto(String nome, String marca, double pre�o) {
        this.nome = nome;
        this.marca = marca;
        this.pre�o = pre�o;
        
       
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

    public double getPre�o() {
        return pre�o;
    }

    public void setPre�o(double pre�o) {
        this.pre�o = pre�o;
    }




     
}
