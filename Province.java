package com.example.lab1ofmobiledevelopment;

import java.io.Serializable;
import java.util.ArrayList;

public class Province implements Serializable {
    String Name;

    public Province(String name) {
        Name = name;
    }

    public Province() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
