package de.jsfkurs.buchverwaltung.jsfbeans;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

@FacesValidator("vornameNachnameValidator")
public class VornameNachnameValidator implements Validator {
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if (!(((String) value).split(" ").length >= 2)) {
            FacesMessage message = new FacesMessage("Vorname und Nachname angeben", "Vorname und Nachname bitte angeben");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);

            throw new ValidatorException(message);
        }
    }
}
