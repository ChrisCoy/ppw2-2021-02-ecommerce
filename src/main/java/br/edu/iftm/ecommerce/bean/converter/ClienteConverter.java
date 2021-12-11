package br.edu.iftm.ecommerce.bean.converter;

import br.edu.iftm.ecommerce.model.Cliente;
import br.edu.iftm.ecommerce.util.JSFUtil;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Cliente.class, value = "clienteConverter")
public class ClienteConverter extends JSFUtil implements Converter<Cliente> {

    @Override
    public Cliente getAsObject(FacesContext fc, UIComponent uic, String idString) {
        if ("".equals(idString) || idString.isEmpty() || idString.isBlank()){
            return null;
        }
        return (Cliente) uic.getAttributes().get("cliente_" + idString);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Cliente cliente) {
        if (cliente != null && cliente.getId() != null) {
            uic.getAttributes().put("cliente_" + cliente.getId(), cliente);
            return cliente.getId().toString();
        }
        return "";
    }

}
