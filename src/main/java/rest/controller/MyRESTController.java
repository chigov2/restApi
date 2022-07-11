package rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import rest.service.EmployeeService;

@RestController
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;
}
