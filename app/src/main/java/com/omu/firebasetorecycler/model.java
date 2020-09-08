package com.omu.firebasetorecycler;

public class model {
    String course,email,name,purl;

    model(){

    }

    public model(String course, String email, String name, String purl) {
        this.course = course;
        this.email = email;
        this.name = name;
        this.purl = purl;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
