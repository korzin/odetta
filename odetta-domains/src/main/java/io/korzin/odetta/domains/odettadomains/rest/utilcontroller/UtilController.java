package io.korzin.odetta.domains.odettadomains.rest.utilcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Home redirection to swagger api documentation
 */
@Controller
public class UtilController {

    @RequestMapping(value = "/open-api/ui")
    public String index() {
        return "redirect:swagger-ui.html";
    }

    @GetMapping("/isAlive")
    @ResponseBody
    public Boolean isAlive(){
        return true;
    }

}
