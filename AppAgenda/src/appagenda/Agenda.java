/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appagenda;

import java.util.ArrayList;

/**
 *
 * @author Paulo Coelho
 */
public class Agenda {

    private ArrayList<ContatoBasico> contatos;

    Agenda() {
        contatos = new ArrayList();
    }

    public void inserir(ContatoBasico c) {
        contatos.add(c);
    }

    public ContatoBasico buscar(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            ContatoBasico c = contatos.get(i);
            if (c.getNome().equalsIgnoreCase(nome)) {
                return contatos.get(i);
            }
        }
        return null;
    }

    public ContatoBasico buscar(int pos) {
        if (pos >= 0 && pos < contatos.size()) {
            return contatos.get(pos);
        }
        return null;
    }

    public ContatoEmpresarial buscarEmail(String email) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i) instanceof ContatoEmpresarial) {
                ContatoEmpresarial c = (ContatoEmpresarial) contatos.get(i);
                if (c.getEmail().equalsIgnoreCase(email)) {
                    return (ContatoEmpresarial) contatos.get(i);
                }
            }

        }
        return null;
    }

    public Contato[] buscaGeral(String palavraChave) {
        ArrayList<ContatoBasico> todos = new ArrayList();
        for (int i = 0; i < contatos.size(); i++) {
            ContatoBasico c = contatos.get(i);
            if (c.getDados().contains(palavraChave)) {
                todos.add(c);
            }
        }
        Contato[] vet = new Contato[todos.size()];
        return (todos.toArray(vet));
    }

    public Contato[] buscarTodos() {
        Contato[] vet = new Contato[contatos.size()];
        return (contatos.toArray(vet));
    }

    public int getQuantidade() {
        return contatos.size();
    }

}
