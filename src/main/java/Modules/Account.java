package Modules;

public class Account {
    private int id;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String uniqueNumber;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getUniqueNumber() { return uniqueNumber; }
    public void setUniqueNumber(String uniqueNumber) { this.uniqueNumber = uniqueNumber; }
}