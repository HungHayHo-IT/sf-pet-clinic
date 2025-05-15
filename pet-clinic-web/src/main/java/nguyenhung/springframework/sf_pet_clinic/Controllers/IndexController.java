package nguyenhung.springframework.sf_pet_clinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oups" )
    public String ooops(Model model){
        return "notimplemented";
    }
}
