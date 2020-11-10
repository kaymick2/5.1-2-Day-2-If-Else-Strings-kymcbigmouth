import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner Names = new Scanner(System.in);
    System.out.println("Type your three strings here");
    String String1 = Names.next();
    String String2 = Names.next();
    String String3 = Names.next();
    System.out.println("Your strings in alphabetical order are:");
    if (((String1.compareTo(String2) < 0) && (String2.compareTo(String3) < 0))) {
      System.out.println(String1 + " " + String2 + " " + String3);
    } else if (((String2.compareTo(String1) < 0) && (String3.compareTo(String1) > 0))) {
      System.out.println(String2 + " " + String1 + " " + String3);
    } else if ((String3.compareTo(String1) < 0) && (String1.compareTo(String2) < 0)) {
      System.out.println(String3 + " " + String1 + " " + String2);
    } else if ((String1.compareTo(String3) < 0) && (String3.compareTo(String2) < 0)) {
      System.out.println(String1 + " " + String3 + " " + String2);
    } else if ((String2.compareTo(String3) < 0) && (String3.compareTo(String1) < 0)) {
      System.out.println(String2 + " " + String3 + " " + String1);
    } else if ((String3.compareTo(String2) < 0) && (String2.compareTo(String1) < 0)) {
      System.out.println(String3 + " " + String2 + " " + String1);
    }

    else {
      System.out.println("All three strings are the same");
    }

    Scanner yourScore = new Scanner(System.in);
    System.out.println("Enter the grade you got and I'll judge you for it");
    double score = yourScore.nextDouble();
    String grade;
    String message;
    if ((score >= 90) && (score <= 110)) {
      grade = "n A";
      message = "You did it, mate. Even Asian dad is proud.";
      System.out.println("You got a" + grade);
      System.out.println(message);
    }
    if ((score <= 89) && (score >= 80)) {
      grade = " B";
      message = "You'll feel ok about this but won't flex it to your parents.";
      System.out.println("You got a" + grade);
      System.out.println(message);
    }
    if ((score <= 79) && (score >= 70)) {
      grade = " C";
      message = "You're most likely going to get screamed at by your parents for this one. You still passed, though.";
      System.out.println("You got a" + grade);
      System.out.println(message);
    }
    if ((score <= 69) && (score >= 60)) {
      grade = " D";
      message = "Yikes! You're probably going to be grounded for a while, but you kind of passed?";
      System.out.println("You got a" + grade);
      System.out.println(message);
    }
    if (score <= 59) {
      grade = "n F";
      message = "CERTAIN DEATH FROM ASIAN DAD";
      System.out.println("You got a" + grade);
      System.out.println(message);
    }



  }
}
