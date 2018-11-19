/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package eaiproject.eaiprojectPayment.data.domain;

public class Discount {
    private Double factor;

    public Discount(Double factor) {
        this.factor = factor;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }
}

