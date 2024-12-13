package com.java.Advanced;
/* enums provide a way to define a set of named constants. used to rep a fixed set of
values and are often used to define categories states or modes*/
public class Enum {
    public  enum Day{
        MONDAY("start of work week"),
        TUESDAY("second day"),
        WEDNESDAY("Mid week"),
        THURSDAY("almost there"),
        FRIDAY("end of work week"),
        SATURDAY("weekend"),
        SUNDAY("weekend");

        private String  description; //define a private member variable inside enum i.e description

        private  Day(String description){ //define a constructor
            this.description=description;
        }
        public String getDescription(){ //define getter method
            return description;
        }
    }

    public static void main(String[] args) {
        Day today=Day.FRIDAY;

        System.out.println("Today is: " + today);
        System.out.println("Description: " + today.getDescription());

        System.out.println("All Days:");
        for (Day day : Day.values()){
            System.out.println(day + ": " + day.getDescription());
        }
    }
}
