package DivisibleBy7;

public class Divisible {

    int minimum;
    int maximum;


static int Countdivisibles(int minimum, int maximum ){

    int counter = 0;
    for( int i = minimum; i <= maximum; i++)
        if(i % 7 == 0)
            counter++;
        return counter;
    }



}



