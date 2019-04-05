/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    
	public int compareTo( Object otherObj){
		Date otherDate = (Date) otherObj;
		
		if (Integer.compare(otherDate.y, this.y) == 0){
			if (Integer.compare(otherDate.m, this.m) == 0)
				return Integer.compare(otherDate.d, this.m);
			else 
				return Integer.compare(otherDate.m, this.m);					
		}
		
		else 
			return Integer.compare(otherDate.y, this.y);			
	}

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // someday: ISO 8601
        return y + "-" + m + "-" + d;
    }

}