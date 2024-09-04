package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Beneficiary;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Payment;
import guru.springframework.spring5webapp.domain.Veteran;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 12/23/19.
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());

        Veteran gloriaMendoza = new Veteran("Gloria Mendoza", "886532164");
        Beneficiary gloriaSpouse = new Beneficiary("John Mendoza", "01");
        Payment gloriaSpousePayment01 = new Payment("Regular Recurring", 1038.79F, "04/13/2018", "04/13/2018", "successful");
        Payment gloriaSpousePayment02 = new Payment("Retroactive", 1038.79F, "04/13/2018", "04/13/2018", "returned");

        gloriaMendoza.getBeneficiaries().add(gloriaSpouse);
        // the below line is causing an error
        // Cannot invoke "java.util.Set.add(Object)" because the return value of
        // "guru.springframework.spring5webapp.domain.Beneficiary.getPayments()" is null

//        gloriaSpouse.getPayments().add(gloriaSpousePayment01);
//        gloriaSpouse.getPayments().add(gloriaSpousePayment02);

//        veteranRepository.save(gloriaMendoza);
//        beneficiaryRepository.save(gloriaSpouse);
//        paymentRepository.save(gloriaSpousePayment01);
//        paymentRepository.save(gloriaSpousePayment02);
//
//        System.out.println("number of veterans: " + veteranRepository.count());
//        System.out.println("number of beneficiaries: " + beneficiaryRepository.count());
//        System.out.println("number of payments: " + paymentRepository.count());
    }
}
