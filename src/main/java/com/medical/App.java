package com.medical;

import com.medical.config.AppConfig;
import com.medical.domain.Country;
import com.medical.domain.MedicalPoint;
import com.medical.service.CountryService;
import com.medical.service.MedicalPointService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * Hello world!
 *
 */

@Controller
public class App
{
    public static void main(String[] args) throws Exception {

        /*
        SessionFactory sessFact = HibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        org.hibernate.Transaction tr = session.beginTransaction();
        Country emp = new Country();
        emp.setId(0);
        emp.setName("Eeeexss12d");
        Province province = new Province();
        province.setId(0);
        province.setName("EEEsE2s23d5");
        City city = new City();
        city.setId(0);
        city.setName("ebess2d3");
        emp.addProvinces(province);
        province.addCities(city);

        session.save(city);
        session.save(emp);
        session.save(province);

        tr.commit();
        System.out.println("Successfully inserted");
        sessFact.close();

    */

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CountryService service = (CountryService) context.getBean("countryService");

        MedicalPointService medService = (MedicalPointService) context.getBean("medicalPointService");


       Country emp = new Country();
        emp.setId(9);
        emp.setName("Dupolandiaaaa");

        MedicalPoint medPoint = new MedicalPoint();

       medPoint.setId(0);
       medPoint.setName("Szpital");
       medPoint.setPhoneNumber("666");


        service.removeAll();

       // medService.add(medPoint);

       // medService.removeByName("Szpital");
       // service.add(emp1);

    }
}
