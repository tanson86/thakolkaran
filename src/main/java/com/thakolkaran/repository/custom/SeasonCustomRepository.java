package com.thakolkaran.repository.custom;

import java.util.Date;
import java.util.Optional;

import com.thakolkaran.model.entity.Season;

public interface SeasonCustomRepository {
	public Optional<Season> getCurrentSeason();
	public Season getSeasonForDuration(Date startDate,Date endDate);
}
