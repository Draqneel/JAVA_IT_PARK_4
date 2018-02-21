package ru.itpark.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.app.forms.QueryForm;
import ru.itpark.app.models.Speciality;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class QueryServiceImpl implements QueryService {
    //Last update
    //version 2.0
    @Autowired
    private EntityManager entityManager;

    public Speciality findById(int id) {
        return this.entityManager.find(Speciality.class, id);
    }


    //List<Speciality> list = new ArrayList<>();

    @Override
    public List<Speciality> sendQuery(QueryForm form) {
        int points;
        int needPoints;
        List<Speciality> list = new ArrayList<>();

        if (form.getSc01() != null && form.getSc02() != null && form.getSc08() != null) {
            points = form.getValueOfSc01() + form.getValueOfSc02() + form.getValueOfSc08();

            Speciality speciality = findById(1);
            needPoints = speciality.getPoints();

            if (points > needPoints) {
                list.add(speciality);
            }
            // русский + математика + физика
        }

        if (form.getSc01() != null && form.getSc02() != null && form.getSc04() != null) {
            points = form.getValueOfSc01() + form.getValueOfSc02() + form.getValueOfSc04();
            // add to example
            Speciality speciality = findById(2);
            needPoints = speciality.getPoints();

            if (points > needPoints) {
                list.add(speciality);
            }
            // русский + математика + информатика
        }

        if (form.getSc01() != null && form.getSc02() != null && form.getSc07() != null) {
            points = form.getValueOfSc01() + form.getValueOfSc02() + form.getValueOfSc07();
            Speciality speciality = findById(3);
            needPoints = speciality.getPoints();

            if (points > needPoints) {
                list.add(speciality);
            }
            // русский + математика + химия
        }

        if (form.getSc01() != null && form.getSc02() != null && form.getSc05() != null) {
            points = form.getValueOfSc01() + form.getValueOfSc02() + form.getValueOfSc05();
            Speciality speciality = findById(4);
            needPoints = speciality.getPoints();

            if(points > needPoints) {
                list.add(speciality);
            }
            // русский + математика + биология
        }

        if (form.getSc01() != null && form.getSc02() != null && form.getSc11() != null) {
            points = form.getValueOfSc01() + form.getValueOfSc02() + form.getValueOfSc11();
            Speciality speciality = findById(5);
            needPoints = speciality.getPoints();

            if (points > needPoints) {
                list.add(speciality);
            }
            // русский + математика + обществознание
        }

        if (form.getSc01() != null && form.getSc10() != null && form.getSc11() != null) {
            points = form.getValueOfSc01() + form.getValueOfSc10() + form.getValueOfSc11();
            Speciality speciality = findById(6);
            needPoints = speciality.getPoints();

            if (points > needPoints) {
                list.add(speciality);
            }
            // русский + обществознание + история
        }

        if (form.getSc01() != null && form.getSc11() != null && form.getSc07() != null) {
            points = form.getValueOfSc01() + form.getValueOfSc07() + form.getValueOfSc11();
            Speciality speciality = findById(7);
            needPoints = speciality.getPoints();

            if (points > needPoints) {
                list.add(speciality);
            }
        }
        return list;
    }
}
