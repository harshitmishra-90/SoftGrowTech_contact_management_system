package com.harshit.contact;

public class contact {


    private String name;
    private Long phone_number;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(Long phone_number) {
        this.phone_number = phone_number;
    }
    @Override
   public String toString() {
    return  "-------------------------\n" +
            "Name : " + name + "\n" +
            "Phone: " + phone_number + "\n" +
            "-------------------------";
}


}
