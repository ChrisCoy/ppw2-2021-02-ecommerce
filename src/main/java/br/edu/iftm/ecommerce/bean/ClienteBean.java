package br.edu.iftm.ecommerce.bean;

import br.edu.iftm.ecommerce.logic.ClienteLogic;
import br.edu.iftm.ecommerce.model.Cliente;
import br.edu.iftm.ecommerce.util.exception.ErroNegocioException;
import br.edu.iftm.ecommerce.util.exception.ErroSistemaException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class ClienteBean extends CrudBean<Cliente, ClienteLogic> {

    @Inject
    private ClienteLogic logic;

    public ClienteBean() {
        super(Cliente.class);
    }

    @Override
    public ClienteLogic getLogic() {
        return this.logic;
    }


}
