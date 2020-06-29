package com.altimetrik.app.busreservation.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altimetrik.app.busreservation.entity.BusDetails;

@Repository
public interface QuoteSearchRepository extends JpaRepository<BusDetails, Long> {

	@Query("SELECT B FROM BusDetails B WHERE B.sourceCity = :sourceCity and B.destinationCity = :destinationCity and B.deparcherTime = :deparcherTime")
	public List<BusDetails> getQuoteSearchResult(@Param("sourceCity") String sourceCity,
			@Param("destinationCity") String destinationCity, @Param("deparcherTime") Date deparcherTime);
}
