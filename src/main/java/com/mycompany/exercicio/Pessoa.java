package com.mycompany.exercicio;

public class Pessoa {
    private String name;
    private int idade;
    private String sexo;
    
    public void fazerAniversario(){
        this.idade+=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String name, int idade, String sexo) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
    }

    
    public String informacoes() {
        return "Pessoa{" + "name = " + name + ", idade = " + idade + ", sexo = " + sexo + '}';
    }
    
    
  
}
