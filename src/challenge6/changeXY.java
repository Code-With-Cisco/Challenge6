/*
Programmer: 5767275
Prof. Charters
COP 3804
Challenge 6 Recursion
 */
package challenge6;

/**
 *
 * @author cisco
 */
public class changeXY {

    String changeXY = "";
    
    public static void main(String[] args) {
        System.out.println(changeXY("codex"));
        System.out.println(changeXY("xxhixx"));
        System.out.println(changeXY("xhixhix"));
        System.out.println(changeXY("asdfghjklpoiutrewqmnbvcz"));
        System.out.println(changeXY("x-ray or is it y-ray?"));
    }
        
public static String changeXY(String str) {

  // when to stop
  if (str.length() == 0)
    return str;
  

  // handle the "special case" using an assumption we can solve str.substring(1)
  if (str.charAt(0) == 'x')
    return 'y' + changeXY(str.substring(1));
  
  // handle the "simple" case using an assumption we can solve str.substring(1)
  return str.charAt(0) + changeXY(str.substring(1));
}


    }
    

