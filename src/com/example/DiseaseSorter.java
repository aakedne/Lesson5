package com.example;

import java.util.ArrayList;
import java.util.List;

public class DiseaseSorter {

    public static void main(String[] args) {
        // initialize
        Disease polio = new Disease("polio", false);
        Disease flu = new Disease("flu", true);
        Disease malaria = new Disease("malaria", true);
        Disease cancer = new Disease("cancer", false);

        //ArrayList
        List<Disease> diseases = new ArrayList<>();
        diseases.add(polio);
        diseases.add(flu);
        diseases.add(malaria);
        diseases.add(cancer);


        cancer.setCurable(true);
        // print all the incurable diseases
        for (Disease disease : diseases) {
            System.out.println("curable diseases: ");
            if (disease.isCurable()) {
                System.out.println(disease.getName() );
            }
        }
    }
}
