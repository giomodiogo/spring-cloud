package ms.rest;

import ms.model.Stuff;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:2222/stuff
@RestController
public class StuffController {

    @RequestMapping(value = "/stuff", method = RequestMethod.GET,
            produces = "application/json")
    public Stuff stuff() {
        return new Stuff(String.valueOf(Math.random() * 10));
    }
}
