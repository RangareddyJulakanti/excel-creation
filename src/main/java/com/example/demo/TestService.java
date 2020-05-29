package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class TestService {

    public void m1(){
        ClassLoader classLoader = this.getClass().getClassLoader();
        File emailTemplate = new File(classLoader.getResource("./emailTemplates/OEmailTemplate.html").getFile());
        File packageTemplate = new File(classLoader.getResource("./emailTemplates/OPTemplate.html").getFile());

    }
}
