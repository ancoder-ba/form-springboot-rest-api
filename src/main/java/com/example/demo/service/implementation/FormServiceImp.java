package com.example.demo.service.implementation;

import com.example.demo.dao.FormRepository;
import com.example.demo.model.Form;
import com.example.demo.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormServiceImp implements FormService {

    @Autowired
    FormRepository formRepository;

    @Override
    public List<Form> getAllForms() {
        return formRepository.findAll();
    }

    @Override
    public String saveForm(Form form) {
        formRepository.save(form);
        return "The form was successfully saved";
    }
}
