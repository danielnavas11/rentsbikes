package com.rentsbikes.domain;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Bike {
    @Id
    private Long id;

    @ManyToMany(mappedBy = "bikes")
    private List<RentDomain> rentDomains;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
