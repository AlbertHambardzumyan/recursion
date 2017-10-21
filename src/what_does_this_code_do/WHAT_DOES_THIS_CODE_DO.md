# What Does This Code Do

- 1
 ``` java
  public int mystery( int a, int b ) {
     if ( b == 1 )
        return a;
     else
        return a + mystery( a, b - 1 );
  }
 ```

- 2
 ``` java
  public class MysteryClass {
     public static int mystery( int[] array, int size ) {
        if ( size == 1 )
            return array[ 0 ];
        else
            return array[ size - 1 ] + mystery( array, size - 1 );
    }
    
     public static void main( String[] args ) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
        
        int result = mystery( array, array.length );
        System.out.printf( "Result is: %d\n", result );
     }
  }
 ```
