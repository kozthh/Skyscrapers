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
        double max = 0;
        if (grades[0] > grades[1] && grades[0] > grades[2]) {
            max = grades[0];
        }
        if (grades[1] > grades[0] && grades[1] > grades[2]) {
            max = grades[1];
        }
        if (grades[2] > grades[0] && grades[2] > grades[1]) {
            max = grades[2];
        }
        std::cout << max << std::endl;
    }
};

#endif //SKYSCRAPERS_STUDENTGRADE_H
