package com.edu.unbosque.store.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encrypt {
    /**
    public static void main(String[] args) {


        String password = "123";
        System.out.println("Password: " + password);
        System.out.println("password encriptado: "+ encryptPassword(password));


    }*/

    public String encryptPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }



}
