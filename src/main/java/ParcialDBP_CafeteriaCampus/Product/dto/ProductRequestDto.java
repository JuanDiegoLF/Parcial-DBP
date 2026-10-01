package ParcialDBP_CafeteriaCampus.Product.dto;

import java.math.BigDecimal;

public class ProductRequestDto {
    private Long id;
    private Long storeld;
    private String name;
    private BigDecimal price;

    public Long getId(){return id;}
    public void SetId (Long id){this.id = id;}

    public Long getStoreld(){return storeld;}
    public void SetStoreld(Long storeld){this.storeld = storeld;}

    public String getName(){return name;}
    public void SetName (String name){this.name = name;}

    public BigDecimal getPrice(){return price;}
    public void SetPrice (Long id){this.price = price;}
}
