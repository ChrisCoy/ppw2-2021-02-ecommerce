package br.edu.iftm.ecommerce.bean;

import br.edu.iftm.ecommerce.logic.ClienteLogic;
import br.edu.iftm.ecommerce.logic.EnderecoLogic;
import br.edu.iftm.ecommerce.model.Cliente;
import br.edu.iftm.ecommerce.model.Endereco;
import br.edu.iftm.ecommerce.util.exception.ErroNegocioException;
import br.edu.iftm.ecommerce.util.exception.ErroSistemaException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class EnderecoBean extends CrudBean<Endereco, EnderecoLogic> {

    @Inject
    private EnderecoLogic logic;

    @Inject
    private ClienteLogic clientlogic;

    public EnderecoBean() {
        super(Endereco.class);
    }

    @Override
    public EnderecoLogic getLogic() {
        return this.logic;
    }

    public List<Cliente> listaClientes() {
        try {
            return this.clientlogic.buscar(null);
        } catch (ErroSistemaException ex) {
            addErro(ex);
        } catch (ErroNegocioException ex) {
            addAviso(ex);
        }
        return new ArrayList<>();
    }

}
