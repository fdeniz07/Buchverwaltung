package jsfbeans;
	
import de.jsfkurs.buchverwaltung.jsfbeans.Book;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.model.DataModel;
import jakarta.faces.model.ListDataModel;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;

@Named(value = "bookShelf")
@SessionScoped
public class BookShelf implements Serializable{

           private static final long serialVersionUID = 1L;
           private static final ArrayList<Book> books;

           static{
               books = new ArrayList<>();
               Book book1 = new Book();
               book1.setAuthor("Johann Wolfgang von Goethe");
               book1.setName("Faust");
               book1.setLanguage("de");
               book1.setPublishDate("19.01.1829");
               book1.setPrice("5.00");
               books.add(book1);
	
               Book book2 = new Book();
               book2.setAuthor("William Shakespeare");
               book2.setName("Romeo und Julia");
               book2.setLanguage("en");
               book2.setPublishDate("1597");
               book2.setPrice("8.49");
               books.add(book2);

               Book book3 = new Book();
               book3.setAuthor("Stephen King");
               book3.setName("Es - It");
               book3.setLanguage("en");
               book3.setPublishDate("1986");
               book3.setPrice("14.99");
               books.add(book3);
           };

           transient
           private DataModel<Book> booksDataModel;
           
           public DataModel<Book> getBooks() {
        	   if (booksDataModel == null)
        		   booksDataModel = new ListDataModel<Book>(books);

        	   return booksDataModel;
           }   
}