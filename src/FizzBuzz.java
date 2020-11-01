import java.util.Iterator;

public class FizzBuzz implements Iterator<String> {
    private int pocet = 0;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public String next() {
        pocet++;

        if ((pocet % 3 == 0) && (pocet % 5 == 0))
            return "Fizz-Buzz";

        else if (pocet % 5 == 0)
            return "Buzz";

        else if (pocet % 3 == 0)
            return "Fizz";

        else return pocet + " ";

    }

}

