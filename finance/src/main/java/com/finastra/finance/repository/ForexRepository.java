package com.finastra.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finastra.finance.model.Forex;

@Repository ("forexRepository")
public interface ForexRepository  extends JpaRepository<Forex,Integer>
{

}
