package com.db.grad.bondsapp.service;
import com.db.grad.bondsapp.model.Security;
import com.db.grad.bondsapp.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityService {

    @Autowired
    private SecurityRepository securityRepository;

    public List<Security> getSecurities() {
        return securityRepository.findAll();
    }

    public Security addSecurity(Security security){
        return securityRepository.save(security);
    }

}
