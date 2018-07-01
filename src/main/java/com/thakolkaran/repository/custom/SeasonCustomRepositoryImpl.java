package com.thakolkaran.repository.custom;

import java.util.Date;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.thakolkaran.model.entity.Season;
import com.thakolkaran.repository.util.BaseRepository;
import com.thakolkaran.repository.util.DaoRetriever;

@Repository
public class SeasonCustomRepositoryImpl extends BaseRepository implements SeasonCustomRepository {
	
	@PersistenceContext
    EntityManager entityManager;

	@Override
	public Season getSeasonForDuration(Date startDate, Date endDate) {
		Query query = entityManager.createNativeQuery("SELECT s.* FROM Season as s " +
                "WHERE CURRENT_DATE between ? AND ? ", Season.class);
        query.setParameter(1, startDate);
        query.setParameter(2, endDate);
        return (Season) query.getSingleResult();
	}
	
	
	public Optional<Season> getCurrentSeason() {
	    return findOrEmpty(() ->
	    entityManager.createQuery("SELECT s FROM Season as s " +
              "WHERE CURRENT_DATE >= s.startdate  and CURRENT_DATE <= s.enddate  ", Season.class)
	                    //.setParameter("username", username)
	                    .setMaxResults(1)
	                    .getSingleResult());
	}

}
