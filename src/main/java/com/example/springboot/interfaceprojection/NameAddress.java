package com.example.springboot.interfaceprojection;

import java.util.List;

public interface NameAddress {

    String getFirstName();

    String getLastName();

    List<AddressView> getAddresses();

    interface AddressView {
        String getProvince();
    }
}
