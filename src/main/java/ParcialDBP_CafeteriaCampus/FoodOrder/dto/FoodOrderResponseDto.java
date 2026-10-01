package ParcialDBP_CafeteriaCampus.FoodOrder.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class FoodOrderResponseDto {
    private Long id;
    private Long customerld;
    private Long productld;
    private Integer quantity;
    private BigDecimal totalAmount;
    private ZonedDateTime createdAt;
    private String status;

    public Long getId(){return id;}
    public void SetId(Long id){this.id = id;}

    public Long getCustomerld(){return customerld;}
    public void SetCustomerld (Long customelrd){this.customerld = customerld;}

    public Long getProductld(){return productld;}
    public void SetProductld(Long productld){this.productld = productld;}

    public Integer getQuantity(){return quantity;}
    public void SetId (Integer quantity){this.quantity = quantity;}

    public BigDecimal getTotalAmount(){return totalAmount;}
    public void SetTotalAmount(BigDecimal totalAmount){this.totalAmount = totalAmount;}

    public ZonedDateTime getCreatedAt(){return createdAt;}
    public void SetCreatedAt (ZonedDateTime createdAt){this.createdAt = createdAt;}

    public String getStatus(){return status;}
    public void SetStatus (String status){this.status = status;}
}
