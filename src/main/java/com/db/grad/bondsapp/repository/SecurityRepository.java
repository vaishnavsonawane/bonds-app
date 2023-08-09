package com.db.grad.bondsapp.repository;

import com.db.grad.bondsapp.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long>{
    List<Security> findBySecurityId(long securityId);
    List<Security> findByMaturityDate(Date maturityDate);
    List<Security> findByMaturityDateBetween(Date startDate, Date endDate);
    @Query("SELECT s FROM Security s " +
            "INNER JOIN Trade t ON t.securityId = s.securityId " +
            "INNER JOIN BookUser bu ON bu.bookId = t.bookId " +
            "WHERE bu.userId = ?1 " +
            "ORDER BY s.maturityDate DESC")
    List<Security> findSecuritiesByUserId(long userId);

    @Query(value = "SELECT s FROM Security s WHERE ?1 <= s.maturityDate ORDER BY s.maturityDate DESC")
    List<Security> findSecuritiesMaturing(Date date);

    @Query(value = "SELECT s FROM Security s WHERE s.maturityDate < ?1 ORDER BY s.maturityDate DESC")
    List<Security> findSecuritiesMatured(Date date);

}