package com.muhendishane.smartmenu.cucumber.stepdefs;

import com.muhendishane.smartmenu.SmartMenuApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SmartMenuApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
