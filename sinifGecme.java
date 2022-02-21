import java.util.Scanner;

public class sinifGecme {

  public static void main(String[] args) {

    double mat, phy, tr, che, mus, total = 0, average;
    int count = 0;

    Scanner not = new Scanner(System.in);

    System.out.println("Enter Your Grades:");
    System.out.println("**************************");
    System.out.println("Remember: If your grade is not between '0' to '100', your grade will not be averaged");
    System.out.println("**************************");
    
    System.out.print("Maths Grade: ");
    mat = not.nextDouble();
    if (mat >= 0 && mat <= 100){
      total += mat; 
      count ++;
    }

    System.out.print("Physics Grade: ");
    phy = not.nextDouble();
    if (phy >= 0 && phy <= 100){
      total += phy; 
      count ++;
    }

    System.out.print("Turkish Grade: ");
    tr = not.nextDouble();
    if (tr >= 0 && tr <= 100){
      total += tr; 
      count ++;
    }

    System.out.print("Chemistry Grade: ");
    che = not.nextDouble();
    if (che >= 0 &&che <= 100){
      total +=che; 
      count ++;
    }

    System.out.print("Music Grade: ");
    mus = not.nextDouble();
    if (mus >= 0 && mus <= 100){
      total += mus; 
      count ++;
    }

    average = total / count;
    
    if (average >= 55){
      System.out.println("You passed.");

    }

    else{
      System.out.println("You failed.");
    }

    System.out.println("Your average: " + average);

    not.close();
  }
  
}
