package com.example.den.sec02.person;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class NameService {
    public String getNameFromDatabase1() {
        return "potato";
    }

    public String getNameFromDatabase2() {
        return "carrot";
    }
}
