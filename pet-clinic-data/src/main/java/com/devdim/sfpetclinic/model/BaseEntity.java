package com.devdim.sfpetclinic.model;

import java.io.Serializable;

/**
 * created by Dima on 7/28/2019.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
