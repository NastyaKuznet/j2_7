package Model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserProfile{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "login", unique = true, updatable = false)
    private String login;
    @Column(name = "email", updatable = false)
    private String email;
    @Column(name = "password", updatable = false)
    private String password;

    public UserProfile() {
    }

    public UserProfile(String login,  String password, String email){
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

}
