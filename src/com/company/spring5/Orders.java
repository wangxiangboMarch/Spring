package com.company.spring5;

public class Orders {

    private String oName;
    private String oAddress;

    public Orders(String oName, String oAddress) {
        this.oAddress = oAddress;
        this.oName = oName;

    }

    public void testOrders() {
        System.out.println("name =" + this.oName);
        System.out.println("author =" + this.oAddress);
    }

}
