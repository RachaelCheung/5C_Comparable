/**
  Represent a point, using Cartesian coordinates
 */
public class Point{
    private double xcor;
    private double ycor;
    
    public int compareTo( Object otherObj){
        // Fix this. Double.compare helped me.
		Point otherPoint = (Point) otherObj;
		
		return Double.compare(distToOrigin(this), distToOrigin(otherPoint));
    }

	private int distToOrigin (Point somePoint){
		return (int) Math.sqrt( Math.pow(somePoint.xcor, 2) 
						+ Math.pow(somePoint.ycor,2));
	}
	
    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}