/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexemploheranca.gerenciar_dados;

import com.mycompany.prjexemploheranca.modelos.Carro;
import com.mycompany.prjexemploheranca.modelos.PessoaFisica;
import com.mycompany.prjexemploheranca.modelos.PessoaJuridica;
import java.util.List;
import java.io.*;
import java.util.*;

/**
 *
 * @author Iftm
 */
public class ManterArquivoCarro {

    private final String NOME_ARQUIVO = "c://teste_carros.txt";

    // 🔹 Escrever no arquivo
    public void escreverArquivo(Carro c) {
        String texto = Obj2Str(c);
        File f = new File(NOME_ARQUIVO);

        try {
            FileWriter fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(texto);
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // 🔹 Ler arquivo
    public List<Carro> lerArquivo() {
        List<Carro> carros = new ArrayList<>();

        try {
            File f = new File(NOME_ARQUIVO);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {
                carros.add(Str2Obj(br.readLine()));
            }

            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return carros;
    }

    // 🔹 Buscar carros por pessoa (CPF/CNPJ)
    public List<Carro> buscarCarrosPorPessoa(String documento) {
        List<Carro> carros = lerArquivo();
        List<Carro> resultado = new ArrayList<>();

        for (Carro c : carros) {
            if (c.getPessoa() != null &&
                c.getPessoa().getDocumento().equals(documento)) {

                resultado.add(c);
            }
        }

        return resultado;
    }

    // 🔹 Buscar carro por placa
    public List<Carro> buscarCarrosPorCarro(String placa) {
        List<Carro> carros = lerArquivo();
        List<Carro> resultado = new ArrayList<>();

        for (Carro c : carros) {
            if (c.getPlaca().equalsIgnoreCase(placa)) {
                resultado.add(c);
            }
        }

        return resultado;
    }

    // 🔹 Objeto → String
    private String Obj2Str(Carro c) {

        String tipo = "";
        String documento = "";

        if (c.getPessoa() instanceof PessoaFisica pf) {
            tipo = "PF";
            documento = pf.getCpf();
        } else if (c.getPessoa() instanceof PessoaJuridica pj) {
            tipo = "PJ";
            documento = pj.getCnpj();
        }

        return "Nome:" + c.getNome() +
               "; Marca:" + c.getMarca() +
               "; Modelo:" + c.getModelo() +
               "; Ano:" + c.getAno() +
               "; Placa:" + c.getPlaca() +
               "; TipoPessoa:" + tipo +
               "; Documento:" + documento;
    }

    // 🔹 String → Objeto
    private Carro Str2Obj(String texto) {

        String atributos[] = extraiAtributos(texto);

        Carro c = new Carro();

        c.setNome(atributos[0]);
        c.setMarca(atributos[1]);
        c.setModelo(atributos[2]);
        c.setAno(Integer.parseInt(atributos[3]));
        c.setPlaca(atributos[4]);

        String tipo = atributos[5];
        String documento = atributos[6];

        if (tipo.equals("PF")) {
            PessoaFisica pf = new PessoaFisica();
            pf.setCpf(documento);
            c.setPessoa(pf);
        } else {
            PessoaJuridica pj = new PessoaJuridica();
            pj.setCnpj(documento);
            c.setPessoa(pj);
        }

        return c;
    }

    // 🔹 Extrair atributos
    private String[] extraiAtributos(String texto) {

        String partes[] = texto.split(";");
        String atributos[] = new String[partes.length];

        int i = 0;

        for (String parte : partes) {
            atributos[i] = parte.split(":")[1].trim();
            i++;
        }

        return atributos;
    }
}