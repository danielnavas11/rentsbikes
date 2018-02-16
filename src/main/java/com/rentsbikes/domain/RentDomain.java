package com.rentsbikes.domain;

import com.rentsbikes.enums.TypeRent;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class RentDomain {
    @Id
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private List<Bike> bikes;

    private TypeRent typeRent;

    private boolean isPromotion;

    private BigDecimal TotalPrice;
    private BigDecimal price;
    private BigDecimal DiscountPrice;

    public List<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(List<Bike> bikes) {
        this.bikes = bikes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeRent getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(TypeRent typeRent) {
        this.typeRent = typeRent;
    }

    public boolean isPromotion() {
        return isPromotion;
    }

    public void setPromotion(boolean promotion) {
        isPromotion = promotion;
    }

    public BigDecimal getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        TotalPrice = totalPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountPrice() {
        return DiscountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        DiscountPrice = discountPrice;
    }
}
