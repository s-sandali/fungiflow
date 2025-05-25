package com.fungiflow.fungiflow.controller;

import com.fungiflow.fungiflow.dto.PreordersDto;
import com.fungiflow.fungiflow.service.PreordersService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/preorders")
public class PreordersController {

    private final PreordersService preordersService;

    //Build add sale REST API
    @PostMapping
    public ResponseEntity<PreordersDto> createPreorders(@RequestBody PreordersDto preordersDto) {
        try {
            PreordersDto savedPreorders = preordersService.createPreorders(preordersDto);
            return new ResponseEntity<>(savedPreorders, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //Build get sale REST API
    @GetMapping("{id}")
    public ResponseEntity<PreordersDto> getPreordersById(@PathVariable("id") Long preordersId) {
        try {
            PreordersDto preordersDto = preordersService.getPreordersById(preordersId);
            return ResponseEntity.ok(preordersDto);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Build get all Preorders REST API
    @GetMapping
    public ResponseEntity<List<PreordersDto>> getAllPreorders() {
        try {
            List<PreordersDto> preorders = preordersService.getAllPreorders();
            return ResponseEntity.ok(preorders);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Build update Preorders REST API
    @PutMapping("{id}")
    public ResponseEntity<PreordersDto> updatePreorders(@PathVariable("id") Long preordersId, @RequestBody PreordersDto updatedPreorders) {
        try {
            PreordersDto preordersDto = preordersService.updatePreorders(preordersId, updatedPreorders);
            return ResponseEntity.ok(preordersDto);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Build delete Preorders REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deletePreorders(@PathVariable("id") Long preordersId) {
        try {
            preordersService.deletePreorders(preordersId);
            return ResponseEntity.ok("Deleted successfully");
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to delete preorder", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/total")
    public ResponseEntity<List<Object[]>> getTotalPreorders() {
        try {
            return ResponseEntity.ok(preordersService.TotalPreorders());
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}




