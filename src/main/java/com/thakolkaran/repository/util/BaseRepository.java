package com.thakolkaran.repository.util;

import java.util.Optional;

import javax.persistence.NoResultException;

public class BaseRepository {
	
	public static <T> Optional<T> findOrEmpty(final DaoRetriever<T> retriever) {
	    try {
	        return Optional.of(retriever.retrieve());
	    } catch (NoResultException ex) {
	        //log
	    }
	    return Optional.empty();
	}
	
}
