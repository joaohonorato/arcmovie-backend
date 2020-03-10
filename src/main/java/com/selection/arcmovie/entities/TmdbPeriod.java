package com.selection.arcmovie.entities;

import java.time.LocalDate;

public class TmdbPeriod {

    public LocalDate maximum;
    public LocalDate minimum;

    public TmdbPeriod() {
    }

    public LocalDate getMaximum() {
        return maximum;
    }

    public void setMaximum(LocalDate maximum) {
        this.maximum = maximum;
    }

    public LocalDate getMinimum() {
        return minimum;
    }

    public void setMinimum(LocalDate minimum) {
        this.minimum = minimum;
    }

    @Override
    public String toString() {
        return "TmdbPeriod{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}
