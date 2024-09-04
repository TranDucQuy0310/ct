package com.example.demo.service;

import com.example.demo.model.DemoModel;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoRepository Repository;

    public List<DemoModel> getAllDemo() {
        return Repository.findAll();
    }
}
