package com.beadando.beadando.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import com.beadando.beadando.beteg.Beteg;

public interface Betegrepo extends JpaRepository<Beteg, Integer>
{
	
}
