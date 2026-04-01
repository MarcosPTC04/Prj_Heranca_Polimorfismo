/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexemploheranca.menus;

import com.mycompany.prjexemploheranca.gerenciar_dados.ManterArquivoCarro;
import com.mycompany.prjexemploheranca.gerenciar_dados.ManterArquivoPessoa;
import com.mycompany.prjexemploheranca.modelos.Carro;
import com.mycompany.prjexemploheranca.modelos.Pessoa;
import com.mycompany.prjexemploheranca.modelos.PessoaFisica;
import com.mycompany.prjexemploheranca.modelos.PessoaJuridica;
import com.mycompany.prjexemploheranca.relatorios.MostrarDados;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class MenuPrincipal {

    public MenuPrincipal() {

        Scanner sc = new Scanner(System.in);

        ManterArquivoPessoa mp = new ManterArquivoPessoa();
        ManterArquivoCarro mc = new ManterArquivoCarro();
        MostrarDados md = new MostrarDados();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Listar Pessoas");
            System.out.println("4 - Cadastrar Carro");
            System.out.println("5 - Listar Carros");
            System.out.println("6 - Buscar Carros por Pessoa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1 -> {
                    PessoaFisica pf = new PessoaFisica();

                    System.out.print("Nome: ");
                    pf.setNome(sc.nextLine());

                    System.out.print("CPF: ");
                    pf.setCpf(sc.nextLine());

                    System.out.print("RG: ");
                    pf.setRg(sc.nextLine());

                    mp.escreverArquivo(pf);
                    System.out.println("Pessoa Física cadastrada!");
                }

                case 2 -> {
                    PessoaJuridica pj = new PessoaJuridica();

                    System.out.print("Nome: ");
                    pj.setNome(sc.nextLine());

                    System.out.print("CNPJ: ");
                    pj.setCnpj(sc.nextLine());

                    System.out.print("Inscrição Estadual: ");
                    pj.setInscEstadual(sc.nextLine());

                    mp.escreverArquivo(pj);
                    System.out.println("Pessoa Jurídica cadastrada!");
                }

                case 3 -> {
                    List<Pessoa> pessoas = mp.lerArquivo();
                    md.mostrarPessoas(pessoas);
                }

                case 4 -> {
                    Carro c = new Carro();

                    System.out.print("Nome: ");
                    c.setNome(sc.nextLine());

                    System.out.print("Marca: ");
                    c.setMarca(sc.nextLine());

                    System.out.print("Modelo: ");
                    c.setModelo(sc.nextLine());

                    System.out.print("Ano: ");
                    c.setAno(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Placa: ");
                    c.setPlaca(sc.nextLine());

                    System.out.print("Documento da Pessoa: ");
                    String doc = sc.nextLine();

                    List<Pessoa> pessoas = mp.lerArquivo();

                    for (Pessoa p : pessoas) {
                        if (p.getDocumento().equals(doc)) {
                            c.setPessoa(p);
                            break;
                        }
                    }

                    mc.escreverArquivo(c);
                    System.out.println("Carro cadastrado!");
                }

                case 5 -> {
                    List<Carro> carros = mc.lerArquivo();
                    md.mostrarCarros(carros);
                }

                case 6 -> {
                    System.out.print("Documento: ");
                    String doc = sc.nextLine();

                    List<Carro> carros = mc.buscarCarrosPorPessoa(doc);
                    md.mostrarCarros(carros);
                }

                case 0 -> System.out.println("Encerrando...");

                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
    

