/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appagenda;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Paulo Coelho
 */
public class Contato extends ContatoBasico {

    protected Calendar dtnasc;

    public Contato(String nome, Calendar dtnasc) {
        super(nome);
        this.dtnasc = dtnasc;
    }

    @Override
    public String getDados() {
        return super.getDados() + "Nascido em"
                + dtnasc.get(Calendar.DATE) + "/"
                + dtnasc.get(Calendar.MONTH) + "/"
                + dtnasc.get(Calendar.YEAR) + "\nIdade: ";
    }

    public int getIdade() {
        Calendar hoje = new GregorianCalendar();
        int idade = hoje.get(Calendar.YEAR) - dtnasc.get(Calendar.YEAR);
        hoje.set(Calendar.YEAR, dtnasc.get(Calendar.YEAR));
        if (hoje.before(dtnasc)) {
            idade--;
        }
        return idade;
    }
}
