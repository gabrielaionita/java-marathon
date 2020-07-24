/**Tema pentru acasa
 *
 */


package DivisibleBy7;

public class Divisible {

    public static int counter;
    int minimum;
    int maximum;



public static int Divisible(int minimum, int maximum ){

    //counter = 0;
    for( int i = minimum; i <= maximum; i++)
        if(i % 7 == 0)
            counter++;
        return counter;

    }

    public int getCounter() {
        return counter;
    }
    public void setName(String name) {
        this.counter = counter;
    }


}



