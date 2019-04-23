package com.bankoffer.cloud.debitcardserver.reprository;

import com.bankoffer.cloud.debitcardserver.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankOfferReprository extends JpaRepository<Bank, Integer> {
}
