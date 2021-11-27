package co.com.gm.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class EncriptarPassword {
    public static void main(String[] args) {
       
        var paswword = "145678910**";
        System.out.println("password: " + paswword);
        System.out.println("password encriptado: " + encriptarPassword(paswword));
    }
    
    public static String encriptarPassword(String password) {
         BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
         return encoder.encode(password);
    }
}
