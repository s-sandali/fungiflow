package com.fungiflow.fungiflow.controller;

import com.fungiflow.fungiflow.dto.StockDTO;
import com.fungiflow.fungiflow.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping(value = "api/v4/")
public class StockController {
    @Autowired
    private StockService StockService;

    @GetMapping("/getStocks")
    public List<StockDTO> getStocks() {
        return StockService.getAllStocks();
    }
}
