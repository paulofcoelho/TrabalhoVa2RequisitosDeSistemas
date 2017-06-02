/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appagenda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Paulo Coelho
 */
public class Tarefa {

    String nome, descricao, local;
    LocalDateTime data;

    public Tarefa(String nome, String descricao, String local, LocalDateTime data) {
        this.nome = nome;
        this.descricao = descricao;
        this.local = local;
        this.data = data;
    }

    public Tarefa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String toString() {
        return "Nome: " + this.getNome() + "\n" + "Descrição: " + this.getDescricao() + "\n" + "Local: " + this.getLocal() + "\n" + "Data e hora: " + this.getData().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }
}
