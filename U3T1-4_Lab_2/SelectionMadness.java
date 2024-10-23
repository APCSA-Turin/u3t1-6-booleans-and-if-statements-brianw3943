public class SelectionMadness {


    // no instance variables //
   
    public SelectionMadness() { }
 
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
       /* implement this method */
       int random = (int) (Math.random() * 5) + 1;
       if (random == 1) {
        return "no day but today";
       } else {
        if (random == 2) {
            return "you will have a good day";
        } else {
            if (random == 3) {
                return "it's friday so life is good!";
            } else {
                if (random == 4) {
                    return "the sun will shine on you today";
                } else {
                        return "you will have a good day";
                }
            }
        }
       }
    }
 
    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
       /* implement this method */
       if (num1 >= num2 && num1 >= num3) {
        return num1;
       }
       if (num2 >= num1 && num2 >= num3) {
        return num2;
       } else {
        return num3;
       }
    }
         /* Returns true if the three provided lengths create a right triangle, in
        other words, a2 + b2 = c2, where c is the longest side; returns false
        Otherwise (hint: use the largest() method that you wrote).
        Note the "largest" side could be any of the 3 numbers, i.e. your method
        should work if side1 = 3, side2 = 4, and side3 = 5 and also if
        side1 = 5, side2 = 4, and side3 = 3
        */
         public boolean rightTriangle(int side1, int side2, int side3) {
            /* implement this method */
            if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)||Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2)||Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)) {
                return true;
            } else {
                return false;
            }
        }

    
 
  }
 

