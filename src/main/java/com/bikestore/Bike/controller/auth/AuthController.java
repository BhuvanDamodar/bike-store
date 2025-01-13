package com.bikestore.Bike.controller.auth;

import com.bikestore.Bike.entity.Customer;
import com.bikestore.Bike.entity.auth.AuthRequest;
import com.bikestore.Bike.entity.auth.AuthResponse;
import com.bikestore.Bike.service.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> registerCustomer(@RequestBody Customer customer) throws Exception {
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> loginCustomer(@RequestBody AuthRequest authRequest){
        return ResponseEntity.ok(authService.loginCustomer(authRequest));
    }
}
