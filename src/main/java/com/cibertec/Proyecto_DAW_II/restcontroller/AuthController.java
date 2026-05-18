package com.cibertec.Proyecto_DAW_II.restcontroller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import com.cibertec.Proyecto_DAW_II.dto.LoginRequestDTO;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")//url por defecto de angular

public class AuthController {

    @Autowired
    private AuthenticationManager authenticacionManger;

    @Autowired
    private JwtProvider jwtProvider;; // Clase utilitaria que crees para generar el token string

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginResquest loginResquest){
        //1. Autenticar con spring security
        Authentication authentication = authenticacionManger.authenticate(
                new UsernamePasswordAuthenticationToken(loginResquest.getUsername(),loginRequest.getPassword()
                );
        )

    }


}
