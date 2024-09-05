package guru.springframework.spring5webapp.apis;

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

    @GetMapping("/payments")
    public String payments(){
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
