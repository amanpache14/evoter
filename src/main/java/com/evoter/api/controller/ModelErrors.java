package com.evoter.api.controller;

import org.springframework.validation.BindingResult;

import java.util.HashMap;

public class ModelErrors extends HashMap {
    public ModelErrors(BindingResult bindingResult) {
    }
}
