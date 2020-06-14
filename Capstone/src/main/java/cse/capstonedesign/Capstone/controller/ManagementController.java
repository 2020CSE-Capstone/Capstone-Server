package cse.capstonedesign.Capstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("manager")
public class ManagementController {

    @GetMapping("index")
    public String index(){
        return "manager/index";
    }
}