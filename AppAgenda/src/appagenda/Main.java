/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appagenda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class Main {

    static void mostraDados(ContatoBasico obj) {
        System.out.println(obj.getDados());
        if (obj instanceof Contato) {
            System.out.println(((Contato) obj).getIdade());
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public static void main(String[] args) {
        Agenda a;
        a = new Agenda();

        Contato cb;
        cb = new Contato("Teste", new GregorianCalendar(1980, 10, 28));
        cb.setTelefone(new Telefone("3333-5555", "Telefone residencial"));
        cb.setTelefone(new Telefone("99111-1111", "Telefone celular"));
        a.inserir(cb);

        ContatoComercial cc;
        cc = new ContatoComercial("Lanchonete", "Enchedor de rabo");
        cc.setTelefone(new Telefone("2222-0000", "Telefone residencial"));
        a.inserir(cc);

        a.inserir(new ContatoEmpresarial("Exemplo", new GregorianCalendar(1975, 2, 22),
                "lanches@gmail.com", "www.lanches.com.br"));

        ContatoBasico obj = a.buscar("Teste"); //pesquisa por nome
        Tarefa tarefa = new Tarefa("Corre", "Ficar fitness", "Praça", LocalDateTime.of(2017, 06, 02, 15, 30));
        if (obj != null) {
            mostraDados(obj);
            System.out.println(tarefa.toString());
        } else {
            System.out.println("Contato nao encontrado!");
        }
    }
}
