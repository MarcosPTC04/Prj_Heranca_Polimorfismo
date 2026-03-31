/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexemploheranca;

/**
 *
 * @author Marcos
 */
public class MostrarDados2 {
    
    public void mostrar(Pessoa p){
        System.out.println("Nome:"+p.getNome());
        if(p instanceof PessoaFisica pf){
            System.out.println("CPF: "+ pf.getCpf());
            System.out.println("RG: "+ pf.getRg());
        }else{
            PessoaJuridica pj = (PessoaJuridica)p;
            System.out.println("CNPJ: "+pj.getCnpj());
            System.out.println("Inscricao Estadual: "+pj.getInscEstadual());
        }
    }
    
}
