/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author <change to your name>
 * @version <today's date>
 */
import java.util.Scanner;
public class PizzaPalace {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
      double numPeople = 0.0;
      double numSliceperson = 0.0;
      double numPizzaslice = 0.0;
      double numTotal = 0.0;
      
      System.out.println("How many people are there? ");
      numPeople = scnr.nextDouble();
      System.out.println("How many slices is each person allowed?");
      numSliceperson = scnr.nextDouble();
      System.out.println("How many slices are in each pizza? ");
      numPizzaslice = scnr.nextDouble();
      numTotal = (numPeople*numSliceperson)/numPizzaslice;
      System.out.println("You need to buy " + Math.ceil(numTotal) + " pizzas.");


      // TODO Replace this section with your own code
		// NOTE
		// The Math class provides a function, ceil(), which will take a double
		// and return the next higher integer value.
		// For example, Math.ceil(4.125) would evaluate to 5

	}

}
