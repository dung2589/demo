package com.example.demo.test;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("ddax mawc bi ki ni");
    }
}
