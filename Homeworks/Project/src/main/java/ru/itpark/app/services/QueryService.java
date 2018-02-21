package ru.itpark.app.services;

import ru.itpark.app.forms.QueryForm;
import ru.itpark.app.models.Speciality;

import java.util.List;

//Last update

public interface QueryService {
    List<Speciality> sendQuery(QueryForm form);
}
