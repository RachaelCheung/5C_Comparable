/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");
        
        System.out.println( System.lineSeparator()
                          + "Date comparisons");
						  
		// Date comparisons
        Date d0 = new Date(2019,  4,  4);
		Date d1 = new Date(2002,  3, 24);
		Date d2 = new Date(2020,  3, 24);
		
        reportRelationship( "Date vs. itself", d0, d0, "0");
		
		reportRelationship( "Date vs. past date", d0, d1, "positive int");
		
		reportRelationship( "Date vs. future date", d0, d2, "negative int");
		
		//Incomparable
		
		// IncomparableDog dog = new IncomparableDog();
		// reportRelationship("Dog vs. itself", dog, dog, "error");
		
		/*
		UserOfComparability.java:44: error: incompatible types: IncomparableDog cannot be converted to Comparable                              
			reportRelationship("Dog vs. itself", dog, dog, "error"); 
												 ^
		*/
		
		reportRelationship( "Point vs. Date", p0, d0, "error");
		
		/*
		Exception in thread "main" java.lang.ClassCastException: Point cannot be cast to Date
			at Date.compareTo(Date.java:8)
			at UserOfComparability.reportRelationship(UserOfComparability.java:72)
			at UserOfComparability.main(UserOfComparability.java:52)
		*/
		
    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship 
      ( String description
      , Comparable b
      , Comparable a
      , String expect
      ) {
        System.out.println( description);

        // check 
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning: 
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */
          
          + " ...expecting " + expect
          + System.lineSeparator());
     }
}