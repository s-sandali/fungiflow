package com.fungiflow.fungiflow.dto;

import com.fungiflow.fungiflow.model.InventoryItem;
import com.fungiflow.fungiflow.model.MaterialRequest;
import lombok.Data;

@Data
public class MaterialRequestDTO {
    private InventoryItem.MaterialType materialType;
    private int quantity;
    private String requester;
}

