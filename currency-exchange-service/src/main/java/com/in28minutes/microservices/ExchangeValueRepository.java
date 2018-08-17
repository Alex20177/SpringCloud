package com.in28minutes.microservices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long>{

	ExchangeValue findByFromAndTo(String from, String to);
	
}//Close ExchangeValueRepository class.
