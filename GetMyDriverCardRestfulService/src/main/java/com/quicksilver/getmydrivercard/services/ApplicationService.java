package com.quicksilver.getmydrivercard.services;

import com.quicksilver.getmydrivercard.entities.Application;
import com.quicksilver.getmydrivercard.entities.User;
import com.quicksilver.getmydrivercard.utils.ApplicationStatus;

import java.util.List;

public interface ApplicationService {

    List<Application> getAllByUserEmailOrderById(String email);

    List<Application> getAllByStatus(ApplicationStatus status);

    List<Application> getAllOrderById();

    List<Application> getAllOrderByDateOfSubmission();

    List<Application> getAllOrderByPersonName();

    Application getById(Long id);

    Application save(Application application);
}