package com.fungiflow.fungiflow.dto;

import com.fungiflow.fungiflow.model.Seed;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContaminationStatDTO {
    private Seed.MushroomType type;
    private int totalBatches;
    private int contaminatedBatches;
    private double contaminationRate;
}
