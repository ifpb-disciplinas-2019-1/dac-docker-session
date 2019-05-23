package br.edu.ifpb;

import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/05/2019, 09:29:54
 */
@Stateless
public class Calculadora {

    public String nome() {
        return "tesouro";
    }

    
//    public Calculadora() {
//        this.dataSource.getConnection();
//    }
//    @Inject
//    private DataSource dataSource;
//    @PostConstruct
//    public void init() {
//        this.dataSource.getConnection();
//    }
}
