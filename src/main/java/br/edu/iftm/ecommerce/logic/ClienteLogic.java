package br.edu.iftm.ecommerce.logic;

import br.edu.iftm.ecommerce.model.Cliente;
import br.edu.iftm.ecommerce.repository.ClienteRepository;
import br.edu.iftm.ecommerce.util.exception.ErroNegocioException;
import br.edu.iftm.ecommerce.util.exception.ErroSistemaException;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;

public class ClienteLogic implements CrudLogic<Cliente> {

    @Inject
    private ClienteRepository repository;

    @Override
    public Cliente salvar(Cliente entidade) throws ErroSistemaException, ErroNegocioException {
        if (entidade.getDataNacimento() == null) {
            entidade.setDataNacimento(new Date());
        }
        if (entidade.getDataDesativacao() == null) {
            entidade.setDataDesativacao(new Date());
        }
        if (entidade.getDataCadastro() == null) {
            entidade.setDataCadastro(new Date());
        }
        entidade = this.repository.save(entidade);
        return entidade;
    }

    @Override
    public void remover(Cliente entidade) throws ErroSistemaException, ErroNegocioException {
        this.repository.remove(entidade.getId());
    }

    @Override
    public Cliente buscarPorId(Cliente entidade) throws ErroSistemaException, ErroNegocioException {
        return this.repository.findByID(entidade.getId());
    }

    @Override
    public List<Cliente> buscar(Cliente entidade) throws ErroSistemaException, ErroNegocioException {
        return this.repository.list();
    }

}
