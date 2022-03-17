package org.primefaces.test;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Daniel Maldonado
 */
@Named
@FacesConverter(value = "playerConverter", managed = true)
public class PlayerConverter implements Converter<Player> {
	
   @Inject
   PlayerService service;
   
   @Override
   public Player getAsObject(FacesContext context, UIComponent component, String value) {
      if (value != null && value.trim().length() > 0) {
         Player found = service.getAvailable().stream()
            .filter(player -> player.getName().equals(value))
            .findAny()
            .orElse(null);

         return found;
      }
      return null;
      
   }

   @Override
   public String getAsString(FacesContext context, UIComponent component, Player o) {
      if (o != null){
         return o.getName();
		}
      return null;
      
   }	

}
