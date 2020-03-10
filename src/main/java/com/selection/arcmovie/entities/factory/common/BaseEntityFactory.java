package com.selection.arcmovie.entities.factory.common;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseEntityFactory<S, T> {

    public abstract T getDTO(S entity);
    public abstract S getEntity(T dto);

    public List<T> getDTOs(List<S> entities) {
        if(entities==null) {
            return null;
        }
        List<T> dtos = new ArrayList<>();
        for(S entidade:entities) {
            dtos.add(getDTO(entidade));
        }
        return dtos;
    }

    public List<S> getEntities(List<T> dtos) {
        List<S> entities = new ArrayList<>();
        if(dtos != null) {
            for (T dto : dtos) {
                entities.add(getEntity(dto));
            }
        }
        return entities;
    }

}
