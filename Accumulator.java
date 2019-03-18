/**
  Represent accumulating data from the elements in a
  List_inArraySlots that are of a particular type.
 */

public class Accumulator {

    /**
      @return the concatenation of all the Strings
      in the \list that begin with \prefix,
      each followed by a space.
     */
     public static String isFinite(
         List_inArraySlots list,
         int index) {
       String output = "";
        for( int el = 0; el < list.size(); el++){
         if (list.get(el) instanceof Double) {
           output += list.get(el);
         }
       }
       return output;
     }

    public static String catElementsStartingWith(
        List_inArraySlots list
      , String prefix
      ) {
        String result = "";

        for( int el = 0; el < list.size(); el++){
          if (list.get(el) instanceof String){
            String currentString = list.get(el).toString();
            if (currentString.startsWith(prefix))
              result += list.get(el) + ", "; // dummy for incremental development
          }
        }
        //list.get( el) + " ";
        return result;
    }







            /* 3.  Stumbling block 0
               Java protects a programmer against applying a method to
               elements in list when some elements of the list might
               omit support for a particular operation.

               This protection is implemented by the compiler. (compiler? JVM?)
               The following code violates the restriction:
              */
        /*
        public static boolean stumblingBlockZero(List_inArraySlots list,
                                        int index) {
          Integer example = 2;
          return example > list.get(index);
        }

             predicted error message:
             I do not know the exact wording but it will inform me that
             the array contains Objects which are not always Integers.
             actual error message:
             "Bad operand types for binary operator >"
             "first type: Integer"
             "second type: Object"
             */

             /*
              4.  Workaround 0
               A programmer should expect there to be a way to
               work around the stumbling block, because
               the JVM (compiler? JVM?)
               knows the type of an element.

               Java's instanceof operator identifies the type
               of an element to the compiler (compiler? JVM?).

             public static boolean stumblingBlockZero(List_inArraySlots list,
                                             int index) {
              Integer example = 2;
              if (list.get(index) instanceof Integer)
                return example > list.get(index);
             }
             */

            /* 5.  Stumbling block 1
               However, use of the operator alone is insufficient,
               because the JVM (compiler? JVM?)
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:

            public static boolean stumblingBlockOne(List_inArraySlots list,
                                           int index) {
              Integer example = 2;
              return example > list.get(index);
           }

             predicted error message:
             "Bad operand types for binary operator >"
             "first type: Integer"
             "second type: Object"

             actual error message:
             "Bad operand types for binary operator >"
             "first type: Integer"
             "second type: Object"
             */


            /* 6. Workaround 1
               Programmers use Java's casting operator
               to tell the JVM (compiler? JVM?)
               that code uses a subclass's method on an object,
               even though the reference to the object is stored
               in a super-class variable.


             public static boolean stumblingBlockOne(List_inArraySlots list,
                                            int index) {
               Integer example = 2;
               return example > (Integer) list.get(index);
            }
            */


            /* 7. Stumbling block 2
               However, use of this operator alone is insufficient,
               because the ___________ (compiler? JVM?)
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:

               public static boolean stumblingBlockTwo(List_inArraySlots list,
                                              int index) {
                 Integer example = 2;
                 return example > list.get(index);
              }

            /*
             predicted error message:

             actual error message:
             */


            /* 8. Workaround 2
               A programmer can combine use of both operators
               to apply a method to exactly those
               elements in the list that support the method.
             */

             public static boolean stumblingBlockTwo(List_inArraySlots list,
                                            int index) {
               Integer example = 2;
               if (list.get(index) instanceof Integer)
                  return example > (Integer) list.get(index);
            }



    /**
      @return a list of each of the Double elements
      from the \list whose value is "finite".
     */
    // public static List_inArraySlots finites(
        // List_inArraySlots list
      // ) {
    // }
}
