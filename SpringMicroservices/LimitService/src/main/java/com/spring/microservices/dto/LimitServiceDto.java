package com.spring.microservices.dto;

public class LimitServiceDto {
    int max;
    int min;

    public int getMin() {
        return min;
    }

    public LimitServiceDto(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
