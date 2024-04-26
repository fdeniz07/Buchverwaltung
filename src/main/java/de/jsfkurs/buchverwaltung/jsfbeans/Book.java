package de.jsfkurs.buchverwaltung.jsfbeans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.event.ActionEvent;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.inject.Named;

import java.util.LinkedHashMap;

@Named(value = "book")
@RequestScoped
public class Book {

    private String author;

    private String name;

    private String publishDate;

    private String price;

    private String [] emailAddresses;

    private String language = "de";

    private static LinkedHashMap<String, String> languages;

    static {
        languages = new LinkedHashMap<>();
        languages.put("Deutsch", "de");
        languages.put("Englisch", "en");
        languages.put("Italienisch","it");
        languages.put("Koreanisch", "kr");
    }

    public String save () {
        // TODO: Abspeichern
        return "index";
    }

    public void saveListener (ActionEvent e)
    {
        System.out.println("Abteilungen benachrichtigen: "+java.util.Arrays.toString(this.emailAddresses));
    }
    public void emailAddressChanged (ValueChangeEvent e) {
        System.out.println("Adressen haben sich geändert "+java.util.Arrays.toString((String []) e.getNewValue()));
    }

    public void emailAddressChangedAjax (AjaxBehaviorEvent e) {

        if (emailAddresses.length > 1)
            specialMessage = "Zu viele Abteilungen selektiert. Bitte Emailflut eingrenzen.";
        else
            specialMessage = "";
    }




    private String specialMessage;

    public String getSpecialMessage() {
        return specialMessage;
    }

    public void setSpecialMessage(String specialMessage) {
        this.specialMessage = specialMessage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LinkedHashMap<String, String> getLanguages() {
        return languages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String[] getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
    }
}
