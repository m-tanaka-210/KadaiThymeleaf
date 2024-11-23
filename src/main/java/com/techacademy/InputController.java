package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(@RequestParam(value = "previous", required = false) String previous, Model model) {
        // 前回入力がされていれば値をModelに引き渡す
        if (previous != null && !previous.isEmpty()) {
            model.addAttribute("previousMessage", "前回入力された値は「" + previous + "」でした。");
        } else {
            model.addAttribute("previousMessage", "");
        }

        // input.htmlに画面遷移
        return "input";
        }
}
