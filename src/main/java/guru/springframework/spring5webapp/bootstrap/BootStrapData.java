package guru.springframework.spring5webapp.bootstrap;


import guru.springframework.spring5webapp.domain.Beneficiary;
import guru.springframework.spring5webapp.domain.Payment;
import guru.springframework.spring5webapp.domain.Veteran;
import guru.springframework.spring5webapp.repositories.VeteranRepository;
import guru.springframework.spring5webapp.repositories.BeneficiaryRepository;
import guru.springframework.spring5webapp.repositories.PaymentRepository;
import guru.springframework.spring5webapp.repositories.ReturnedPaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 12/23/19.
 */
@Component
public class BootStrapData implements CommandLineRunner {
    private final VeteranRepository veteranRepository;
    private final BeneficiaryRepository beneficiaryRepository;
    private final PaymentRepository paymentRepository;
    private final ReturnedPaymentRepository returnedPaymentRepository;


    public BootStrapData(VeteranRepository veteranRepository, BeneficiaryRepository beneficiaryRepository, PaymentRepository paymentRepository, ReturnedPaymentRepository returnedPaymentRepository) {
        this.veteranRepository = veteranRepository;
        this.beneficiaryRepository = beneficiaryRepository;
        this.paymentRepository = paymentRepository;
        this.returnedPaymentRepository = returnedPaymentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Veteran gloriaMendoza = new Veteran("Gloria Mendoza", "886532164");
        Beneficiary gloriaSpouse = new Beneficiary("John Mendoza", "01");
        Beneficiary gloriaChild = new Beneficiary("Michael Mendoza", "02");

        Payment gloriaSpousePayment01 = new Payment("Regular Recurring", 1038.79F, "04/13/2018", "04/13/2018", "successful");
        Payment gloriaSpousePayment02 = new Payment("Retroactive", 1038.79F, "04/13/2018", "04/13/2018", "returned");

        gloriaMendoza.getBeneficiaries().add(gloriaSpouse);
        gloriaMendoza.getBeneficiaries().add(gloriaChild);
        System.out.println(gloriaSpouse.toString());

//        why don't both beneficiaries show up in the System.out.println?
//        why don't both payments show up?
//        Veteran{id=1, name='Gloria Mendoza', participantId='886532164', beneficiaries=[Beneficiary{id=2, name='John Mendoza', type='01', payments=[Payment{id=3, type='Regular Recurring', amount=1038.79, paymentDate='04/13/2018', scheduleDate='04/13/2018', returnedStatus='successful'}], returnedPayments=[]}]}

        gloriaSpouse.getPayments().add(gloriaSpousePayment01);
        gloriaSpouse.getPayments().add(gloriaSpousePayment02);

        veteranRepository.save(gloriaMendoza);
        beneficiaryRepository.save(gloriaSpouse);
        paymentRepository.save(gloriaSpousePayment01);
        paymentRepository.save(gloriaSpousePayment02);

        System.out.println("number of veterans: " + veteranRepository.count());
        System.out.println("number of beneficiaries: " + beneficiaryRepository.count());
        System.out.println("number of payments: " + paymentRepository.count());
        System.out.println(gloriaMendoza.toString());
        System.out.println(gloriaSpouse.toString());
    }
}
