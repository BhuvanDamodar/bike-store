package com.bikestore.Bike.service.auth;

import com.bikestore.Bike.config.JwtService;
import com.bikestore.Bike.entity.Customer;
import com.bikestore.Bike.entity.auth.AuthRequest;
import com.bikestore.Bike.entity.auth.AuthResponse;
import com.bikestore.Bike.entity.enums.Role;
import com.bikestore.Bike.repository.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final CustomerRepo customerRepo;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public void registerCustomer(Customer customer) throws Exception {
        if(!isCustomerExist(customer)){
            String pass = passwordEncoder.encode(customer.getPassword());
            customer.setPassword(pass);
            customer.setRole(Role.CUSTOMER);
            customerRepo.save(customer);
        } else {
            throw new Exception("User already exists");
        }
    }

    public AuthResponse loginCustomer(AuthRequest authRequest){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authRequest.getEmail(),
                        authRequest.getPassword()
                )
        );

        Customer customer = customerRepo.findByEmail(authRequest.getEmail())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        String jwtToken = jwtService.generateToken(customer);

        return AuthResponse.builder()
                .token(jwtToken)
                .build();
    }

    public Boolean isCustomerExist(Customer customer){
        return customerRepo.existsByEmail(customer.getEmail());
    }
}
