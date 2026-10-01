package ParcialDBP_CafeteriaCampus.User.dto;

public class UserResponseDto {
    private Long id;
    private String username;
    private Long email;
    private String password;
    private String role;

    public Long getId(){return id;}
    public void SetId (Long id){this.id = id;}

    public String getUsername(){return username;}
    public void SetUsername (String username){this.username = username;}

    public Long getEmail(){return email;}
    public void SetEmail (Long email){this.email = email;}

    public String getPassword(){return password;}
    public void SetPassword (String password){this.password = password;}

    public String getRole(){return role;}
    public void SetRole (String role){this.role = role;}
}
