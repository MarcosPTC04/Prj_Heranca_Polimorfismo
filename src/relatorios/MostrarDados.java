/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexemploheranca.relatorios;

import com.mycompany.prjexemploheranca.modelos.Carro;
import com.mycompany.prjexemploheranca.modelos.Pessoa;
import com.mycompany.prjexemploheranca.modelos.PessoaFisica;
import com.mycompany.prjexemploheranca.modelos.PessoaJuridica;
import java.util.List;

/**
 *
 * @author Marcos
 */
    public class MostrarDados{

        // 🔹 Mostrar Pessoa (usa instanceof)
        public void mostrarPessoa(Pessoa p) {

            System.out.println("Nome: " + p.getNome());

            if (p instanceof PessoaFisica pf) {
                System.out.println("CPF: " + pf.getCpf());
                System.out.println("RG: " + pf.getRg());

            } else if (p instanceof PessoaJuridica pj) {
                System.out.println("CNPJ: " + pj.getCnpj());
                System.out.println("Inscrição Estadual: " + pj.getInscEstadual());
            }

            System.out.println("----------------------------------");
        }

        // 🔹 Mostrar lista de pessoas
        public void mostrarPessoas(List<Pessoa> pessoas) {
            for (Pessoa p : pessoas) {
                mostrarPessoa(p);
            }
        }

        // 🔹 Mostrar UM carro
        public void mostrarCarro(Carro c) {

            System.out.println("*************** CARRO ***************");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Marca: " + c.getMarca());
            System.out.println("Modelo: " + c.getModelo());
            System.out.println("Placa: " + c.getPlaca());
            System.out.println("Ano: " + c.getAno());

            System.out.println("----------- PROPRIETÁRIO -----------");

            if (c.getPessoa() != null) {
                mostrarPessoa(c.getPessoa());
            } else {
                System.out.println("Sem proprietário");
            }
        }

        // 🔹 Mostrar lista de carros
        public void mostrarCarros(List<Carro> carros) {
            for (Carro c : carros) {
                mostrarCarro(c);
            }
        }
}
