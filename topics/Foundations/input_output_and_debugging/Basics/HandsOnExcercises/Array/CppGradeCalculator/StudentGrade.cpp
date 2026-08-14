//
// Created by kenne on 8/13/2026.
//

#ifndef SKYSCRAPERS_STUDENTGRADE_H
#define SKYSCRAPERS_STUDENTGRADE_H

#include <iostream>

class StudentGrade {

    double grades[3] = {1.79, 1.81, 1.59};
//basic if else operator
public:
    void findMax() {
        double max = grades[0];
        for (int i = 1; i < 3; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        std::cout << max << std::endl;
    }
};

#endif //SKYSCRAPERS_STUDENTGRADE_H
