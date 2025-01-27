package com.example.demo.controller;

import com.example.demo.model.DemoModel;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tem")
public class DemoController {

    @Autowired
    private DemoService dService;

    @GetMapping
    public List<DemoModel> getAllDemo() {
        return dService.getAllDemo();  // Trả về toàn bộ thông tin các department dưới dạng JSON
    }
}
