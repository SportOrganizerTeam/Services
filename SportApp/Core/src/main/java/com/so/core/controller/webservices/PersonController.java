/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.core.controller.webservices;

import com.google.gson.Gson;
import com.so.core.controller.dto.PersonDTO;
import com.so.core.services.PersonService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kristián Kačinetz
 */
@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getPersons(@RequestParam(value = "q", required = false) String query) {
        Set<PersonDTO> result;
        Gson gson = new Gson();

        result = personService.findAll();

        return gson.toJson(result);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getPerson(@PathVariable(value = "id") Integer id) {

        PersonDTO result;
        Gson gson = new Gson();

        result = personService.findById(id);

        return gson.toJson(result);
    }

}