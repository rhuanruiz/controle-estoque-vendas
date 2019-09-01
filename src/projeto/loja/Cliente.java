package projeto.loja;
import java.util.Scanner;

public class Cliente {
    public String nome;
    public int cadastro;
    public static Produto [] listacompra;
    static Scanner sc = new Scanner(System.in);

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
            System.out.println("Digite seu nome");
            String nome=sc.next();
            while(cliente[i]!=null){
                i++;
            }
            cliente[i]= new Cliente(nome,i);                     
        }
        System.out.println("Cadastro feito com sucesso!");
    }
           
}
