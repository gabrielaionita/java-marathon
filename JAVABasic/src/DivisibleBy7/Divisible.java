package DivisibleBy7;

public class Divisible {

    int minimum;
    int maximum;
    int counter;


public  int Divisible(int minimum, int maximum ){

    counter = 0;
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



