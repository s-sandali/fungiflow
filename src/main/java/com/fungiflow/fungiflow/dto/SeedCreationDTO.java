package com.fungiflow.fungiflow.dto;

import com.fungiflow.fungiflow.model.Seed;
import lombok.Data;
import java.util.List;

@Data
public class SeedCreationDTO {
    private Seed.MushroomType type;
    private int initialQuantity;
    private List<MaterialRequestDTO> materialRequests;
}
