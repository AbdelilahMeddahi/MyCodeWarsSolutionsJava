public class BouncingBall {
	
	public static int bouncingBall(double h, double bounce, double window) {
	    // your code
      if ((h<=0) || (bounce >= 1) || (bounce <= 0) || (window >= h)) return -1;
      int bounceCount = 1;
      double bounceHeight = h*bounce;
      while (bounceHeight > window){
        bounceCount += 2;
        bounceHeight = bounceHeight * bounce;
      }
    return bounceCount;
	}
}
