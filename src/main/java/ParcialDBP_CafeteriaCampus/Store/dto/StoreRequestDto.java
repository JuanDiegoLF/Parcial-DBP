package ParcialDBP_CafeteriaCampus.Store.dto;

public class StoreRequestDto {
    private String name;
    private Long ownerld;
    private String location;
    private String status;

    public String getName(){return name;}
    public void SetName (String username){this.name = name;}

    public Long getOwnerld(){return ownerld;}
    public void SetOwnerld (Long ownerld){this.ownerld = ownerld;}

    public String getLocation(){return location;}
    public void SetLocation (String id){this.location = location;}

    public String getStatus(){return status;}
    public void SetStatus (String status){this.status = status;}
}
