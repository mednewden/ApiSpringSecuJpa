package com.smailox.dream.app.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class PassGenEncod {

    public static void main(String[] args){
        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
        String rawPass="pass";
        String encodedPass =encoder.encode(rawPass);
        System.out.println(" .. encodedPass .. " + encodedPass);
        // $2a$10$dHlPGzrPUL8f5rKQrqhT9.jCAFdTEL2nUzjLXVHn9N3/Ik0En1ATS
    }

}
