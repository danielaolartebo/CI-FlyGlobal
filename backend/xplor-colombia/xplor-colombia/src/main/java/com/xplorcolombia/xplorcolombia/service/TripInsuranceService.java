package com.xplorcolombia.xplorcolombia.service;


import com.xplorcolombia.xplorcolombia.domain.TripInsurance;
import com.xplorcolombia.xplorcolombia.dto.TripInsuranceDTO;

import java.util.List;

public interface TripInsuranceService  extends GenericService<TripInsurance, Integer>{

    public List<TripInsuranceDTO> seeTripInsurancebyDestination(Integer idDestination);

}
