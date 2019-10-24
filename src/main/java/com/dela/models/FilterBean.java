package com.dela.models;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonFilter("FilterBean")
public class FilterBean {
    private String filterValue1;
    private String filterValue2;
    private String filterValue3;

    public FilterBean(String filterValue1, String filterValue2, String filterValue3) {
        this.filterValue1 = filterValue1;
        this.filterValue2 = filterValue2;
        this.filterValue3 = filterValue3;
    }

    public String getFilterValue1() {
        return filterValue1;
    }

    public void setFilterValue1(String filterValue1) {
        this.filterValue1 = filterValue1;
    }

    public String getFilterValue2() {
        return filterValue2;
    }

    public void setFilterValue2(String filterValue2) {
        this.filterValue2 = filterValue2;
    }

    public String getFilterValue3() {
        return filterValue3;
    }

    public void setFilterValue3(String filterValue3) {
        this.filterValue3 = filterValue3;
    }
}
