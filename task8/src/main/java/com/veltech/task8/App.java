package com.veltech.task8;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.veltech.task8.service.EmployeeService;


public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
//        BeanFactory factory = context;
//        EmployeeService service = context.getBean(EmployeeService.class);
        EmployeeService service = context.getBean(EmployeeService.class);
        service.createEmployee(1, "Manoj", 50000);
        service.createEmployee(2, "Rakesh", 60000);
        service.createEmployee(3, "Charan", 70000);
        service.displayEmployees();
        context.close();
    }
}