package com.thakolkaran.repository.util;

import javax.persistence.NoResultException;

@FunctionalInterface
public interface DaoRetriever<T> {
    T retrieve() throws NoResultException;
}
