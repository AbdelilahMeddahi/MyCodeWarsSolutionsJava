class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
      int yearsNeeded = 0;
      int population = p0;
      while (population<p){
        population += population*percent/100 + aug;
			  yearsNeeded++;
      }
      return yearsNeeded;
    }
}
