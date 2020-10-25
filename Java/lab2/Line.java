public class Line {
    double a,b,c;

    boolean contains(Point P)
    {
        return a*P.x+b*P.y==c;
    }
    
    boolean isParallelWith(Line that)
    {
      return (this.a * that.b == this.b * that.a);   
    }
    boolean isOrthogonalTo(Line that)
    {
        double Slopethis = -this.a/this.b;
        double Slopethat = -that.a/that.b;

        return(Slopethis==-1/Slopethat);
    }
}