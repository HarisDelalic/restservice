package com.dela.controllers;

import com.dela.models.FilterBean;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping(path = "/filter")
    public MappingJacksonValue getFilterBean() {
        FilterBean filterBean = new FilterBean("filterValue1", "filterValue2", "filterValue3");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(filterBean);
        FilterProvider filters = new SimpleFilterProvider().addFilter("FilterBean", SimpleBeanPropertyFilter.filterOutAllExcept("filterValue1"));
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}
