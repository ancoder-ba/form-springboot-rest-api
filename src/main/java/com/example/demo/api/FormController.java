package com.example.demo.api;

import com.example.demo.model.Form;
import com.example.demo.service.implementation.FormServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/formSTS")
public class FormController {

    @Autowired
    FormServiceImp formServiceImp;

    @GetMapping
    public List<Form> getForms() {
        return formServiceImp.getAllForms();
    }

    @PostMapping
    public String saveForms(@RequestBody Form form) {
        return formServiceImp.saveForm(form);
    }
}
