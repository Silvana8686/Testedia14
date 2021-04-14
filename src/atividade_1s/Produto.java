
package atividade_1s;

public class Produto {
    
   
    public String nome,unidade,R$;
    public int qtd;
    public double preco;
     

    public Produto() {
           
    }

    public Produto ( String nome, int qtd,String unidade,String R$,double preco) {
      
        this.nome = nome;
        this.qtd  = qtd;
        this.unidade = unidade;
        this.R$ = R$;
        this.preco = preco;
              
    }

    @Override
    public String toString() {
        //return nome;//
        return  "-" + nome + "-" +qtd+ "-"+unidade+"-"+R$+"-"+preco;
        
    }
    
}
