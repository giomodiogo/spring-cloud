package microservices.rest;

import microservices.model.Stuff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@ResponseBody
public class AccountsController {

    public static final String ACCOUNTS_SERVICE_URL = "http://ACCOUNTS-MICROSERVICE";

    @Autowired
    protected RestTemplate restTemplate;

    @RequestMapping(value = "/stuff", method = RequestMethod.GET)
    public Stuff stuff() {
        return restTemplate.getForObject(ACCOUNTS_SERVICE_URL + "/stuff", Stuff.class);
    }
}
