package com.db.grad.bondsapp.controller;

import com.db.grad.bondsapp.model.Security;
import com.db.grad.bondsapp.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/securities")
public class SecurityController {
    @Autowired
    private SecurityService securityService;

    @Autowired
    public SecurityController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @GetMapping(value = "get")
    public ResponseEntity getSecurities() {

        List<Security> response = securityService.getSecurities();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/add")
    public Security addSecurity(@RequestBody Security security) {
        Security newSecurity = securityService.addSecurity(security);
        return newSecurity;
    }

}
