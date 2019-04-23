package com.bankoffer.cloud.debitcardserver.reprository;

import com.bankoffer.cloud.debitcardserver.domain.DebitCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardOfferReprository extends JpaRepository<DebitCard, Integer> {
}
