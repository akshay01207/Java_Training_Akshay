package com.bhavna.assignment;

public class UserDetails  {

      private int id;
      private String  Name;
      private String  email;
      private String  mobile;
      private String  password;
      
      public int getId() {
          return id;
      }
      public void setId(int id) {
          this.id = id;
      }

      public String getName() {
        return Name;
      }
      public void setName(String name) {
        Name = name;
      }
      public String getEmail() {
        return email;
      }
      public void setEmail(String email) {
        this.email = email;
      }
      public String getMobile() {
        return mobile;
      }
      public void setMobile(String mobile) {
        this.mobile = mobile;
      }
      public String getPassword() {
        return password;
      }

      public void setPassword(String password) {
        this.password = password;
      }
    
    @Override
    public String toString() {
        return "User [id=" + id + ", Name=" + Name + ", email=" + email
                + ", mobile=" + mobile + ", password=" + password + "]";
    }
}