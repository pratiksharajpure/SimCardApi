package com.pratiksha.simCardApi.repository;

import com.pratiksha.simCardApi.model.SimCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SimCardRepo extends JpaRepository<SimCard,String> {
    List<SimCard> findByExpireOnLessThanEqual(long expireOn);
}
