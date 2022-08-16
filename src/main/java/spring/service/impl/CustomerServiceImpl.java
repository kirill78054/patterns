package spring.service.impl;

import org.springframework.stereotype.Service;
import spring.service.CustomerService;

import javax.annotation.PostConstruct;

@Service
public class CustomerServiceImpl implements CustomerService {

    @PostConstruct
    private void init() {
        System.out.println("Init method CustomerServiceImpl");
    }

    @Override
    public void printName(String name) {
        System.out.println("Name = " + name);
    }

}
