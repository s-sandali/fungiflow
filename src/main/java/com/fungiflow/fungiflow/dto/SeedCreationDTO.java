package com.fungiflow.fungiflow.dto;

import com.fungiflow.fungiflow.model.Seed;
import java.util.List;

public class SeedCreationDTO {

    private Seed.MushroomType type;
    private int initialQuantity;
    private List<MaterialRequestDTO> materialRequests;

    public Seed.MushroomType getType() {
        return type;
    }

    public void setType(Seed.MushroomType type) {
        this.type = type;
    }

    public int getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(int initialQuantity) {
        this.initialQuantity = initialQuantity;
    }

    public List<MaterialRequestDTO> getMaterialRequests() {
        return materialRequests;
    }

    public void setMaterialRequests(List<MaterialRequestDTO> materialRequests) {
        this.materialRequests = materialRequests;
    }
}
