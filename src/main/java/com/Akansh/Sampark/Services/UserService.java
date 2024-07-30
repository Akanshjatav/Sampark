package com.Akansh.Sampark.Services;

import com.Akansh.Sampark.Models.User;
import com.Akansh.Sampark.Repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

}
