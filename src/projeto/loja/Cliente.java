package projeto.loja;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente {
    public String nome;
    public int cadastro;
    public static Produto [] listacompra;
    static Scanner sc = new Scanner(System.in);
    
    /*public static Cliente[] cliente = new Cliente[500];
    
    public static Cliente[] getNumCliente() {
        return cliente;
    }*/
    
    public Cliente(){
    	
    }
    
    public Cliente(String nome, int cadastro) {
        this.nome = nome;
        this.cadastro = cadastro;
        listacompra = new Produto[500];
    }
    
    public static void adicionarCompra(Produto c){
        int y = 0;
        while(listacompra[y] != null){
            y++;
        }
        listacompra[y] = c;
    }
    
    public static void cadastrarCliente(Cliente[] cliente,int a){ 
        for(int b=0;b<a;b++){
            int i=2;
            String nome = (JOptionPane.showInputDialog(null, "Digite o nome do cliente: "));
            while(cliente[i]!=null){
                i++;
            }
            cliente[i]= new Cliente(nome,i);             
        }
        JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
    }
           
}
