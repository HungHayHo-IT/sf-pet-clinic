package nguyenhung.springframework.sf_pet_clinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
