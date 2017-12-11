package com.medical.dao;

import com.medical.domain.MedicalPoint;
import com.medical.domain.MedicalUnit;
import com.medical.domain.MedicalUnitType;
import com.medical.domain.Specialty;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Transactional
@Repository("medicalPointDao")
public class MedicalPointDaoImpl extends AbstractGenericDao<MedicalPoint> implements MedicalPointDao {

    MedicalPointDaoImpl(){super("medical_point");};
    public MedicalUnit FindMedicalUnitWithSpecialty(String specialtyName){
        Query query = currentSession().createQuery("from MedicalUnit.specialties S where S.name=:name");
        query.setParameter("name", specialtyName);
        return (MedicalUnit) query.uniqueResult();
    }

    public void addMedicalUnit(String medicalUnitName, MedicalUnitType medicalUnitType, MedicalPoint medicalPoint, Specialty... specialties){
        MedicalUnit medicalUnit = new MedicalUnit();
        medicalUnit.setName(medicalUnitName);
        medicalUnit.setMedicalUnitType(medicalUnitType);
        medicalUnit.setMedicalPoint(medicalPoint);
        Set<Specialty> specialtyList = new HashSet<Specialty>();
        for(Specialty specialty : specialties)
            specialtyList.add(specialty);

        medicalUnit.setSpecialties(specialtyList);
    }

}
