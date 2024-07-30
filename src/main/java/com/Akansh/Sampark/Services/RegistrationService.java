package com.Akansh.Sampark.Services;


import com.Akansh.Sampark.Repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    UserDAO dao;


}
