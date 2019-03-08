package com.company.BMI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class BmiController {
    BmiCounter bm1 = new BmiCounter();

    DecimalFormat df = new DecimalFormat("##");

    @GetMapping("/bmi")
    public String getParam(

    ) {
        return "bmi";
    }

    @GetMapping("/result")
    public String getResult(@RequestParam Double height,
                            @RequestParam Double weight,
                            DecimalFormat df,
                            ModelMap map) {

        BmiCounter  bmiCounter = new BmiCounter(height, weight);
        map.put("yourBMI", df.format(bmiCounter.getBMI()));
        map.put("yourBM", bmiCounter.getMessage());

        return "result";
    }


}


//    double bmiResult = bm1.getBMI(height, weight);
//
//    String wynik = "";
//        if (bmiResult < 18.5) {
//        wynik = "Masz niedowagę, przytyj trochę!";
//        } else if (bmiResult >= 18.6 && bmiResult <= 24.9) {
//        wynik = "Bardzo dobrze! Masz odpowiednią wagę dla swojego wzrostu!";
//        } else if (bmiResult >= 25 && bmiResult <= 29.9) {
//        wynik = "Twoje BMI wynosi : " + bmiResult +
//        "\n Masz lekka nadwagę, poćwicz!";
//        } else if (bmiResult > 30) {
//        wynik = "Niestety jesteś otyły, zrzuć trochę kilogramów!";
//        }
//        map.put("yourBMI", df.format(bmiResult));
//        map.put("yourBM", wynik);
//
//        return "result";
//        }
