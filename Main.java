/*
 * Gary Henry
 * CIS221
 * 3/8/2022
 * Tuesdays and Thrusdays (2:10pm to 4:00pm)
 * Professor: Mr.Swinarski
 * CIS221 Homework_5
 */

class Colors { // create class colors
    String color, paint;

    public Colors() { // Colors constructor
        color = "red";
        paint = "acryllic";
    }

    private class Paper { // create private class Paper
        private String paper = "Letter";
    }

    String innerPaper(String paperGetter) { // method that creates instance of the private class paper
        Paper newPaper = new Paper(); // create object of private class Paper
        System.out.println(newPaper.paper); // print the private attributes to the screen
        return paperGetter;
    }
}

public class Main {
    public static void main(String[] args) { // main method

        Colors outer = new Colors(); // create object of outer class
        System.out.println("Paint type: " + outer.color + " " + outer.paint + "." + " Paper Type:");
        outer.innerPaper(""); // call method from private inner class using an object of outer class to call
                              // the method

    }
}
