package com.voteo.user.controller;

import com.voteo.user.domain.RandomCity;
import com.voteo.user.repository.RandomCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    // This should ideally be a service instead of a repo
    @Autowired
    private RandomCityRepository randomCityRepository;

    @RequestMapping(value ="/standard/cities")
    @PreAuthorize("hasAuthority('STANDARD_USER')")
    public Iterable<RandomCity> getCities(){
        return randomCityRepository.findAll();
    }


    @RequestMapping(value ="/admin/cities")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public Iterable<RandomCity> getCitiesForAdmin(){
        return randomCityRepository.findAll();
    }




}
