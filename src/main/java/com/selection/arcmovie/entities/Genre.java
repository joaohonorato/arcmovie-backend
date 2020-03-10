package com.selection.arcmovie.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Genre {

    public Long id;
    public String name;

    public Genre(String name) {
        this.name = name;
    }

}
