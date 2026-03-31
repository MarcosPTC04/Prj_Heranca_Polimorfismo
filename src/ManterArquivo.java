/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexemploheranca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class ManterArquivo {
    
    private final String NOME_ARQUIVO = "c://teste_pessoas.txt";
    
    public void escreverArquivo(Pessoa p){
        String texto = Obj2Str(p);
        File f = new File(NOME_ARQUIVO);
        
        try{
            FileWriter fw = new FileWriter (f, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(texto);
            fw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public List<Pessoa> lerArquivo(){
        List<Pessoa> pessoas = new ArrayList();
        try{
            File f = new File(NOME_ARQUIVO);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            while(br.ready()){
                pessoas.add(Str2Obj(br.readLine()));
            }
            fr.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return pessoas;
    }
    private String Obj2Str(Pessoa p){
        String dados = "";
        if(p instanceof PessoaFisica pf){
            dados = "Tipo: PF; Nome:"+ pf.getNome()+"; CPF:"+pf.getCpf()+"; RG:"+ pf.getRg();
        }else{
            PessoaJuridica pj = (PessoaJuridica) p;
            dados = "Tipo: PJ; Nome:"+pj.getNome()+". CNPJ:"+pj.getCnpj()+"; InscEst:"+pj.getInscEstadual();
        }
        return dados;
    }
    private Pessoa Str2Obj(String texto){
        Pessoa p = new Pessoa();
        
        if(texto.contains("Tipo: PF")){
            PessoaFisica pf = new PessoaFisica();
            String atributos[] = extraiAtributos(texto);
            pf.setNome(atributos[1]);
            pf.setCpf(atributos[2]);
            pf.setRg(atributos[3]);
            p=pf;
        }else{
            PessoaJuridica pj = new PessoaJuridica();
            String atributos[]= extraiAtributos(texto);
            pj.setNome(atributos[1]);
            pj.setCnpj(atributos[2]);
            pj.setInscEstadual(atributos[3]);
            p = pj;
        }
        return p;
    }
    private String[] extraiAtributos(String texto){
        String partes[] = texto.split(";");
        String atributos[] = new String[partes.length];
        int conte = 0;
        for(String parte : partes){
            atributos[conte] = parte.split(":")[1].trim();
            conte++;
        }
        return atributos;
    }
    
}
