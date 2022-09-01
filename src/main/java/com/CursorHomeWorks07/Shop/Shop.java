package com.CursorHomeWorks07.Shop;

public class Shop {
    private final long id;
    private final String city;
    private final String street;
    private final String name;
    private final int staff;
    private final boolean siteAvail;

    public Shop(long id, String city, String street, String name, int staff, boolean siteAvail) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.name = name;
        this.staff = staff;
        this.siteAvail = siteAvail;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", name='" + name + '\'' +
                ", staff=" + staff +
                ", siteAvail=" + siteAvail +
                '}';
    }
}
