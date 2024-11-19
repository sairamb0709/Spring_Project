package org.mycompany.webproject.Breeds;

public class Main{
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        int k = 0;

        try {
            j = 16/i;
            System.out.println("K value is" + (16/j));

        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {


            int result = 10 / 0;// Potential code that can throw different exceptions
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);  // This will throw ArrayIndexOutOfBoundsException
             // This will throw ArithmeticException
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e)
        {
            System.out.println("General error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("This block will always execute.");
        }


            }
        }








