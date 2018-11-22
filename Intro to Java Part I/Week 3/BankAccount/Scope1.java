import comp102x.IO;

public class Scope1 {
    public static void printNumberDiamond(int diaCenter) {
    int sizeOfBox = diaCenter * 2 + 1;

    //print widening rows
    for(int row = 1; row <= diaCenter; row++)
    {
        printNumberLine(row - 1, sizeOfBox);
    }

    //print middle
    printNumberLine(diaCenter, sizeOfBox);

    //print tightening rows
    for(int row = diaCenter; row >= 1; row--)
    {   
        printNumberLine(row - 1, sizeOfBox);
    }
}

public static void printNumberLine(int seqCenter, int length)
   {
    int expectedStringLength = 2 * seqCenter + 1;
    int blankSpaces = length - expectedStringLength;

    //print spaces before
    for (int i = 1; i <= blankSpaces / 2; i++)
    {
        IO.output(" ");
    }

    //print ascending numbers
    for (int i = 0; i < seqCenter; i++) {
        IO.output(i);
    }

    //print seqCenter
    IO.output(seqCenter);

    //print decending numbers
    for (int i = seqCenter - 1; i >= 0; i--) {
        IO.output(i);
    }

    //print spaces after
    for (int i = 1; i <= blankSpaces / 2; i++) {
        IO.output(" ");
    }
    IO.output("\n");
    
   }
}