package com.example.demo.service;

import com.example.demo.model.Form;

import java.util.List;

public interface FormService {

    List<Form> getAllForms();
    String saveForm(Form form);


}
