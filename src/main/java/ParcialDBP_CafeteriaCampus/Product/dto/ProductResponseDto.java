package ParcialDBP_CafeteriaCampus.Product.dto;

import java.math.BigDecimal;

public class ProductResponseDto {
    private Long id;
    private Long storeld;
    private String name;
    private BigDecimal price;
    private Integer stock;
    private String status;

    public Long getId(){return id;}
    public void SetId (Long id){this.id = id;}

    public Long getStoreld(){return storeld;}
    public void SetStoreld(Long storeld){this.storeld = storeld;}

    public String getName(){return name;}
    public void SetName (String name){this.name = name;}

    public BigDecimal getPrice(){return price;}
    public void SetPrice (Long id){this.price = price;}

    public Integer getStock(){return stock;}
    public void SetStock (Integer id){this.stock = stock;}

    public String getStatus(){return status;}
    public void SetStatus (String id){this.status = status;}
}
