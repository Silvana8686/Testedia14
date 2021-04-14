
package atividade_1s;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Atividade_1S_Main {

    public static void main(String[] args) {
        
         
         
 
        List<Produto> produto = new ArrayList<Produto>();
    
    
        Produto c0 = new  Produto ("Amendoim",8,"Unidade","R$",5.50);
        Produto c1 = new  Produto ("Pipoca ",9,"Unidade" ,"R$",3.90);
        Produto c2 = new  Produto ("Merengue",7, "Unidade","R$",2.50);
    
        produto.add (c0);
        produto.add (c1);
        produto.add (c2);
        System.out.println("--------------------");
        
        System.out.println(produto);
        System.out.println("3° Produto da  Lista de Compras na posição  [2]:"+produto.get(2)); //chamando um elemento especifico no vetor//
        produto.remove(c1);
        System.out.println(produto);
        
        // elemento Pipoca removido//
    }         
}
