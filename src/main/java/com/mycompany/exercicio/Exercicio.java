
package com.mycompany.exercicio;
public class Exercicio {

    public static void main(String[] args) {
        Pessoa [] p = new Pessoa [1];
        Livro [] l = new Livro [2];
        
        p[0] = new Pessoa("Juca",21,"Masculino");
        l[0] = new Livro ("Scientific Adversiting", "Claude Hopkins", 80, p[0]);
        
        System.out.println("Leituras de Juca no ano 2023: ");
        System.out.println(l[0].detalhes());
        System.out.println(p[0].informacoes());
        
        System.out.println("\n\nLeituras de Juca no ano 2024: ");
        
        p[0].fazerAniversario();
        l[0].setPaginaAtual(67);
        l[1] = new Livro("Sell or be Sold", "Grant CArdone", 120, p[0]);
        
        System.out.println(p[0].informacoes());
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
