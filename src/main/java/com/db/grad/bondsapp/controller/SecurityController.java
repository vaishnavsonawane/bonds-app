package com.db.grad.bondsapp.controller;

import com.db.grad.bondsapp.model.Security;
import com.db.grad.bondsapp.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/securities")
@CrossOrigin(origins = "*")
public class SecurityController {
    @Autowired
    private SecurityService securityService;

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

    @GetMapping(value = "get", params = "securityId")
    public ResponseEntity getSecurityBySecurityId(@RequestParam(value = "securityId") long securityId) {

        List<Security> response = securityService.getSecurityById(securityId);
        return ResponseEntity.ok().body(response);
    }
    @GetMapping(value = "get", params = "maturityDate")
    public ResponseEntity getSecurityByMaturityDate(@RequestParam(value = "maturityDate") String maturityDate) {

        try {
            LocalDate.parse(maturityDate);
        } catch (DateTimeParseException dateTimeParseException) {
            return ResponseEntity.badRequest().body("Date format incorrect, give Date in format YYYY-MM-DD");
        }
    List<Security> response = securityService.getSecuritiesByMaturityDate(Date.valueOf(LocalDate.parse(maturityDate)));
        return ResponseEntity.ok().body(response);
    }
    @GetMapping(value = "get", params = {"fromDate", "toDate"})
    public ResponseEntity getSecuritiesByMaturityDateInPeriod(@RequestParam(value = "fromDate") String fromDate, @RequestParam(value = "toDate") String toDate) {
        if (fromDate != null && validateDate(fromDate) && toDate != null  && validateDate(toDate)) {

            List<Security> response = securityService.getSecuritiesByMaturityDateBetween(Date.valueOf(LocalDate.parse(toDate)), Date.valueOf(LocalDate.parse(fromDate)));
            return ResponseEntity.ok().body(response);
        }
        else {
            return ResponseEntity.badRequest().body("Please provide both and accurate fromDate and toDate");
        }
    }
    @GetMapping(value = "get", params = "userId")
    public ResponseEntity getSecurityByUserId(@RequestParam(value = "userId") long userId) {

        List<Security> response = securityService.getSecurityByUserId(userId);
        return ResponseEntity.ok().body(response);
    }
    @DeleteMapping("/delete/{securityId}")
    public void deleteSecurityById(@PathVariable long securityId){

        securityService.deleteSecurityById(securityId);

    }
    Boolean validateDate(String Date)
    {
        try{
            LocalDate.parse(Date);
        }
        catch(DateTimeParseException dateTimeParseException){
            return false;
        }
        return true;
    }

}
