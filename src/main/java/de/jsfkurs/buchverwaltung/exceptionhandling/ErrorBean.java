package de.jsfkurs.buchverwaltung.exceptionhandling;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named(value = "errorBean")
@RequestScoped
public class ErrorBean {

    public void throwError(){
        throw new RuntimeException("throwing new error");
    }
}
