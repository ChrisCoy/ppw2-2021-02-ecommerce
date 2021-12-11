package br.edu.iftm.ecommerce.bean.converter;

import br.edu.iftm.ecommerce.logic.EnderecoLogic;
import br.edu.iftm.ecommerce.model.Endereco;
import br.edu.iftm.ecommerce.util.JSFUtil;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

@FacesConverter(forClass = Endereco.class, value = "enderecoConverter")
public class EnderecoConverter extends JSFUtil implements Converter<Endereco>{

    @Inject
    private EnderecoLogic logic;
    
    @Override
    public Endereco getAsObject(FacesContext fc, UIComponent uic, String idString) {
       Endereco endereco = 
                    (Endereco)uic.getAttributes().get("endereco_"+idString);
       return endereco;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Endereco endereco) {
        if(endereco != null && endereco.getId() != null){
            uic.getAttributes().put("endereco_"+endereco.getId(), endereco);
            return endereco.getId().toString();
        }
        return "";
    }
    
}
