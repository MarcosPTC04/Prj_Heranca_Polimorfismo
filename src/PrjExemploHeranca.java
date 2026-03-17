/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjexemploheranca;

import java.util.ArrayList;
import java.util.List;

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
        
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Teste PJ");
        pj.setInscEstadual("1234569874");
        pj.setCnpj("012345678912345");
        
        Carro c1 = new Carro();
        c1.setNome("Gol");
        c1.setMarca("VW");
        c1.setModelo("G6");
        c1.setAno(2020);
        c1.setPessoa(pf);
        
        Carro c2 = new Carro();
        c2.setNome("Palio");
        c2.setMarca("Fiat");
        c2.setModelo("EX");
        c2.setAno(2018);
        c1.setPessoa(pj);
        
        Carro c3 = new Carro();
        c3.setNome("Fiesta");
        c3.setMarca("Ford");
        c3.setModelo("EXL");
        c3.setAno(2017);
        c1.setPessoa(pf);
        
        List<Carro> lstCarroPf = new ArrayList<>();
        lstCarroPf.add(c1);
        lstCarroPf.add(c3);
        pf.setLstCarro(lstCarroPf);
        
        List<Carro> lstCarroPj = new ArrayList<>();
        lstCarroPj.add(c2);
        pj.setLstCarro(lstCarroPj);
        
        /*System.out.println("Nome: " + pf.getNome());
        System.out.println("Rg: " + pf.getRg());
        System.out.println("Cpf: " + pf.getCpf()+"\n");*/
     
        /*System.out.println("Nome: " + pj.getNome());
        System.out.println("Inscricao Estadual: " + pj.getInscEstadual());
        System.out.println("CNPJ: " + pj.getCnpj()+"\n");
        
        Pessoa p1 = pj;
        Pessoa p2 = pf;
        
        System.out.println("Pessoa 01: "+ p1.getNome());
        System.out.println("Pessoa 02: "+ p2.getNome());*/
        
        MostrarDados md = new MostrarDados();
        MostrarDados2 md2 = new MostrarDados2();
        
        md.mostrar(pf);
        md.mostrar(pj);
        
    }
}
