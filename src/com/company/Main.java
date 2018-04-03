package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        Course newCourse;

        ArrayList<Course> courses = new ArrayList<>();

        for(int i=1; i < 5; i++){
            newCourse = new Course();
            System.out.println("Enter course number ");
            newCourse.setCourseNumber(scan.nextLine());
            System.out.println("Enter course name ");
            newCourse.setCourseName(scan.nextLine());
            System.out.println("Enter course room number ");
            newCourse.setRoomNumber(scan.nextLine());
            System.out.println("Enter course semester ");
            newCourse.setSemester(scan.nextLine());
            System.out.println("Year ");
            newCourse.setYear(scan.nextLine());
            System.out.println("Your course now contains "+newCourse.toString());
            courses.add(newCourse);
        }

for (Course eachCourse: courses)
{
    System.out.println("Course number"+eachCourse.getCourseNumber());
    System.out.println("Course name"+eachCourse.getCourseName());
    System.out.println("Room number"+eachCourse.getRoomNumber());
    System.out.println("semester"+eachCourse.getSemester());
    System.out.println("year"+eachCourse.getYear());


    System.out.println("Course contents: "+eachCourse.toString());
}
        }
    }

