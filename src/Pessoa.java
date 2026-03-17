/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexemploheranca;

import java.util.List;

/**
 *
 * @author Marcos
 */
public class Pessoa {
    
    private String nome;
    private List<Carro> lstCarro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getLstCarro() {
        return lstCarro;
    }

    public void setLstCarro(List<Carro> lstCarro) {
        this.lstCarro = lstCarro;
    }
    
}
