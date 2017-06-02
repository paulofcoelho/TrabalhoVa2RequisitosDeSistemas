/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appagenda;

public class Telefone {

    private String numero;
    private String tipo;

    public Telefone(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getTelefone() {
        return numero + " " + tipo;
    }

}
