package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Home(){
        
        return "index";
//JSP (JavaServer Sayfaları)
//JSP, server da çalışan ve istemci tarafı dillerinde 
//(HTML, CSS, JavaScript, vb.) Şablon metni yazmanıza izin veren bir Java görünüm teknolojisidir .
    }
    
}

