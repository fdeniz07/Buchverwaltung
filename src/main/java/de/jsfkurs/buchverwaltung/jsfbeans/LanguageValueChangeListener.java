package de.jsfkurs.buchverwaltung.jsfbeans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.faces.event.ValueChangeListener;
import jakarta.inject.Named;

@Named(value = "languageChangeListener")
@RequestScoped
public class LanguageValueChangeListener implements ValueChangeListener {

    @Override
    public void processValueChange(ValueChangeEvent e) throws AbortProcessingException {
        System.out.println("Sprache geändert: " + e.getNewValue());
    }
}
