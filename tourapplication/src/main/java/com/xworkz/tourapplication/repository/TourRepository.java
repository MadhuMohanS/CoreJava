package com.xworkz.tourapplication.repository;

import java.util.List;

import com.xworkz.tourapplication.dto.TourDto;

public interface TourRepository {
public void save(TourDto t);
public void saveAll(List<TourDto> t);
public void update(int id,double cost);
public void deleteByCost(double cost);
public TourDto findByCost(double cost); 
}
