package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OuputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("inputValue", val);
        // output.htmlに画面遷移
        return "output";
    }
}
