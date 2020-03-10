package com.selection.arcmovie.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TmdbPeriod {

    public LocalDate maximum;
    public LocalDate minimum;

}
