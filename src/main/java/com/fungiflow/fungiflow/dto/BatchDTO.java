package com.fungiflow.fungiflow.dto;

import com.fungiflow.fungiflow.model.Seed;
import lombok.Data;
import java.time.LocalDate;

@Data
public class BatchDTO {
    private Seed.MushroomType type;
    private int initialQuantity;
    private LocalDate cultivationStartDate;
}
