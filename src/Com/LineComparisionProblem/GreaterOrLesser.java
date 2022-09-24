package Com.LineComparisionProblem;

public class GreaterOrLesser {

	public static void main(String[] args) {
		//printing the welcome message
        System.out.println("Welcome Line Comparision Computation Program");

        //initiating variables
        double x1 = 5.5;
        double x2 = 6.0;
        double y1 = 7.0;
        double y2 = 8.5;
        double X1 = 6.5;
        double X2 = 7.5;
        double Y1 = 8.0;
        double Y2 = 5.0;
        //line 1
        double lengthOfLine1 = Math.sqrt((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))));
        System.out.println("Length of the line 1: " + lengthOfLine1);

        //line 2
        double lengthOfLine2 = Math.sqrt((Math.pow((X2 - X1), 2) + (Math.pow((Y2 - Y1), 2))));
        System.out.println("Length of the line 2: " + lengthOfLine2);

        //Comparison of line
        if (lengthOfLine1 == lengthOfLine2) {
            System.out.println("Length of line 1 is equal to Length of line 2");
        } else if (lengthOfLine1 > lengthOfLine2) {
            System.out.println("Length of line 1 is greater than Length of line 2");
        } else {
            System.out.println("Length of line 1 is lesser than Length of line 2");
        }

	}

}
