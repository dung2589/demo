package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @Autowired
    public Outfit outfit;

    public Girl(Outfit outfit) {
        this.outfit = outfit;
    }

}

