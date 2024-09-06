package guru.springframework.spring5webapp.apis;

import guru.springframework.spring5webapp.domain.Beneficiary;
import guru.springframework.spring5webapp.domain.Payment;
import guru.springframework.spring5webapp.domain.Veteran;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeteranController {
    @GetMapping("/greet")
    public String greetTheUser(){
        return "hello";
    }

    @GetMapping("/")
    public String root(){
        return "this is the root";
    }

    @GetMapping("/veteran")
    public Veteran veteran() {
        Veteran gloriaMendoza = new Veteran("Gloria Mendoza", "886532164");
        Beneficiary gloriaSpouse = new Beneficiary("John Mendoza", "01");
        Beneficiary gloriaChild = new Beneficiary("Michael Mendoza", "02");

        Payment gloriaSpousePayment01 = new Payment("Regular Recurring", 1038.79F, "04/13/2018", "04/13/2018", "successful");
        Payment gloriaSpousePayment02 = new Payment("Retroactive", 1038.79F, "04/13/2018", "04/13/2018", "returned");

        gloriaMendoza.getBeneficiaries().add(gloriaSpouse);
        gloriaMendoza.getBeneficiaries().add(gloriaChild);

        gloriaSpouse.getPayments().add(gloriaSpousePayment01);
        gloriaSpouse.getPayments().add(gloriaSpousePayment02);

        return gloriaMendoza;
    }
    @GetMapping("/veteran-old")
    public String veteranOld(){
        return "{\n" +
                "    \"participantId\": \"32246727\",\n" +
                "    \"veteranName\": \"Gloria Mendoza\",\n" +
                "    \"beneficiaryName\": \"Spouse Mendoza\",\n" +
                "    \"beneficiaryType\": \"10\", \n" +
                "    \"payments\": [\n" +
                "        { \n" +
                "            \"type\": \"Regular Recurring\",\n" +
                "            \"amount\": 1038.79,\n" +
                "            \"paymentDate\": \"04/13/2018\",\n" +
                "            \"scheduleDate\": \"04/13/2018\",\n" +
                "            \"returnedStatus\": \"successful\",\n" +
                "            \"paymentMethod\": \"Electronic Funds Transfer (EFT)\",\n" +
                "            \"routingCode\": \"123456789\",\n" +
                "            \"accountNumber\": \"1233456789012345678\",\n" +
                "            \"accountType\": \"Checking\",\n" +
                "            \"addressType\": \"Residential\",\n" +
                "            \"address1\": \"123\",\n" +
                "            \"address2\": \"123\",\n" +
                "            \"address3\": \"123\",\n" +
                "            \"city\": \"San Francisco\",\n" +
                "            \"state\": \"CA\",\n" +
                "            \"zip\": \"94016\",\n" +
                "            \"country\": \"United States\",\n" +
                "            \"processingStation\": \"123\",\n" +
                "            \"financeStationOfJurisdiction\": \"317\",\n" +
                "            \"paidByOrganization\": \"Corporate\",\n" +
                "            \"programType\": \"Compensation\",\n" +
                "            \"awardType\": \"Restored Entitlement Program\"\n" +
                "        },\n" +
                "        { \n" +
                "            \"type\": \"Retroactive\",\n" +
                "            \"amount\": 1038.79,\n" +
                "            \"paymentDate\": \"04/13/2018\",\n" +
                "            \"scheduleDate\": \"04/13/2018\",\n" +
                "            \"returnedStatus\": \"returned\",\n" +
                "            \"paymentMethod\": \"Physical Check\",\n" +
                "            \"routingCode\": \"123456789\",\n" +
                "            \"accountNumber\": \"1233456789012345678\",\n" +
                "            \"accountType\": \"Saving\",\n" +
                "            \"addressType\": \"Commercial\",\n" +
                "            \"address1\": \"123\",\n" +
                "            \"address2\": \"123\",\n" +
                "            \"address3\": \"123\",\n" +
                "            \"city\": \"Dallas\",\n" +
                "            \"state\": \"TX\",\n" +
                "            \"zip\": \"75001\",\n" +
                "            \"country\": \"United States\",\n" +
                "            \"processingStation\": \"123\",\n" +
                "            \"financeStationOfJurisdiction\": \"317\",\n" +
                "            \"paidByOrganization\": \"Corporate\",\n" +
                "            \"programType\": \"Compensation\",\n" +
                "            \"awardType\": \"Restored Entitlement Program\"\n" +
                "        },\n" +
                "    ]\n" +
                "}\n";
    }
}
