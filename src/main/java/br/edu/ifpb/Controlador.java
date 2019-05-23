package br.edu.ifpb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/05/2019, 09:52:03
 */
@Named
@RequestScoped
public class Controlador {

    @Inject
    private Calculadora calculadora;

    public String getMensagem() {
        return this.calculadora.nome();
    }
}
