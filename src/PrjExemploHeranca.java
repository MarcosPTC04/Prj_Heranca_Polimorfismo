/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prjexemploheranca;

/**
 *
 * @author Marcos
 */
public class PrjExemploHeranca {

    public static void main(String[] args) {
        
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Teste PF");
        pf.setRg("12345678");
        pf.setCpf("123.456.789-00");
        
        /*System.out.println("Nome: " + pf.getNome());
        System.out.println("Rg: " + pf.getRg());
        System.out.println("Cpf: " + pf.getCpf()+"\n");*/
                
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Teste PJ");
        pj.setInscEstadual("1234569874");
        pj.setCnpj("012345678912345");
        
        /*System.out.println("Nome: " + pj.getNome());
        System.out.println("Inscricao Estadual: " + pj.getInscEstadual());
        System.out.println("CNPJ: " + pj.getCnpj()+"\n");
        
        Pessoa p1 = pj;
        Pessoa p2 = pf;
        
        System.out.println("Pessoa 01: "+ p1.getNome());
        System.out.println("Pessoa 02: "+ p2.getNome());*/
        
        MostrarDados md = new MostrarDados();
        
        md.mostrar(pf);
        md.mostrar(pj);
        
    }
}
