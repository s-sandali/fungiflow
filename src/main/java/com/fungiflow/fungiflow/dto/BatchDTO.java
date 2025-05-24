package com.fungiflow.fungiflow.dto;

import com.fungiflow.fungiflow.model.Seed;
import java.time.LocalDate;

public class BatchDTO {

    private Seed.MushroomType type;
    private int initialQuantity;
    private LocalDate cultivationStartDate;

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

    public LocalDate getCultivationStartDate() {
        return cultivationStartDate;
    }

    public void setCultivationStartDate(LocalDate cultivationStartDate) {
        this.cultivationStartDate = cultivationStartDate;
    }
}
