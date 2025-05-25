package com.fungiflow.fungiflow.controller;

import com.fungiflow.fungiflow.dto.PreAllocationDto;
import com.fungiflow.fungiflow.service.PreAllocationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/preorderAllocation")
public class PreAllocationController {

    private final PreAllocationService preallocationService;

    // Create Allocation
    @PostMapping
    public ResponseEntity<PreAllocationDto> createPreAllocation(@RequestBody PreAllocationDto allocationDto) {
        Long branchId = allocationDto.getBranchId();
        if (branchId == null) {
            return ResponseEntity.badRequest().body(null);
        }
        PreAllocationDto savedPreAllocation = preallocationService.createPreAllocation(branchId, allocationDto);
        return new ResponseEntity<>(savedPreAllocation, HttpStatus.CREATED);
    }

    // Get Allocation by ID
    @GetMapping("/{id}")
    public ResponseEntity<PreAllocationDto> getPreAllocationById(@PathVariable Long id) {
        PreAllocationDto preallocationDto = preallocationService.getPreAllocationById(id);
        return ResponseEntity.ok(preallocationDto);
    }

    // Get all Allocations
    @GetMapping
    public ResponseEntity<List<PreAllocationDto>> getAllPreAllocations() {
        List<PreAllocationDto> preallocations = preallocationService.getAllPreAllocations();
        return ResponseEntity.ok(preallocations);
    }

    // Update Allocation
    @PutMapping("/{id}")
    public ResponseEntity<PreAllocationDto> updatePreAllocation(@PathVariable Long id, @RequestBody PreAllocationDto preallocationDto) {
        PreAllocationDto updatedPreAllocation = preallocationService.updatePreAllocation(id, preallocationDto);
        return ResponseEntity.ok(updatedPreAllocation);
    }

    // Delete Allocation
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePreAllocation(@PathVariable Long id) {
        preallocationService.deletePreAllocation(id);
        return ResponseEntity.ok("Deleted successfully");
    }

    // Allocate Products to Branch
    @PostMapping("/allocate")
    public ResponseEntity<Void> allocateProductsToBranch(@RequestParam Long branchId, @RequestParam Long productId, @RequestParam int quantity) {
        preallocationService.allocateProductsToBranch(branchId, productId, quantity);
        return ResponseEntity.ok().build();
    }
}
