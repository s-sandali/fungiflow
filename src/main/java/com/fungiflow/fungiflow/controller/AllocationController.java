package com.fungiflow.fungiflow.controller;

import com.fungiflow.fungiflow.dto.AllocationDTO;
import com.fungiflow.fungiflow.service.LabManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/allocations") //issue
public class AllocationController {

    @Autowired
    private LabManagementService labService;

    @PostMapping
    public void allocateCultures(@RequestBody AllocationDTO dto) {
        labService.allocateCultures(dto);
    }
}