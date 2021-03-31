package com.company.spring5;

public class Book {

    private String bname;
    private String bauthor;
    private String bAddress;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public  void setbAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public void testBook() {
        System.out.println("name =" + this.bname);
        System.out.println("author =" + this.bauthor);
    }
}
