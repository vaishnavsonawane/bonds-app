package com.db.grad.bondsapp.service;
import com.db.grad.bondsapp.model.Security;
import com.db.grad.bondsapp.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
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

    public List<Security> getSecurityById(long securityId) {
        return securityRepository.findBySecurityId(securityId);
    }
    public List<Security> getSecuritiesByMaturityDate(Date maturityDate) {
        return securityRepository.findByMaturityDate(maturityDate);
    }

    public List<Security> getSecuritiesByMaturityDateBetween(Date fromDate, Date toDate)
    {
        return securityRepository.findByMaturityDateBetween(fromDate,toDate);
    }

    public List<Security> getSecurityByUserId(long userId) {
        return securityRepository.findSecuritiesByUserId(userId);
    }
    public void deleteSecurityById(long securityId){

        List<Security> toDelete = securityRepository.findBySecurityId(securityId);
         if(!toDelete.isEmpty())
         {
             securityRepository.delete(toDelete.get(0));
         }
    }

}
