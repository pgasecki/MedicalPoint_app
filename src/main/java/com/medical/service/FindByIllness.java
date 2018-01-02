package com.medical.service;

import com.medical.domain.Illness;
import com.medical.domain.MedicalPoint;

import java.util.List;

public interface FindByIllness extends GenericService<Illness> {

    //public List<MedicalPoint> getMedicalPoints(String illnessName);

    public MedicalPoint getNearestMedicalPoint(double latitude, double longitude, String illnessName,
                                               String cityName, String provinceName);
}
