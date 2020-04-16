package com.zufrost.learn;

class Course {}
class BaseCourse extends Course {}
class FreeCourse extends BaseCourse {}
class OptionalCourse extends Course {}
public class LearnMainInstanceof {
    public static void doAction(Course c) {
        if (c instanceof BaseCourse) { /*for BaseCourse and FreeCourse*/
            System.out.println("for BaseCourse and FreeCourse");
        } else if (c instanceof OptionalCourse) { /*for OptionalCourse*/
            System.out.println("for OptionalCourse");
        } else { /*for Course or null*/
            System.out.println("for Course or null");
        }
    }

    public static void main(String[] args) {
//        BaseCourse course = new BaseCourse();
//        FreeCourse course = new FreeCourse();
//        OptionalCourse course = new OptionalCourse();
//        OptionalCourse course = null;
//        Course course = new Course();
        Course course = new FreeCourse();
        doAction(course);
    }

}




