
/**
 * Write a description of class MedalCount here.
 *
 * @author mcallaghan
 * @version 26nov2019
 */
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    
    /*
     * Can use array literals to create 2D arrays by nesting curly brackets.
     */
    
    private int[][] counts = 
        {
            { 1, 0, 1 },
            { 1, 1, 0 },
            { 0, 1, 0 },
            { 1, 1, 0 },
            { 0, 1, 1 },
            { 0, 0, 0 },
            { 1, 1, 1 }
        };
        
    public MedalCount()
    
    {
        /*
         * Alternate way to create a 2D array. The initialization would be followed by
         *      nested loops to initialize each element.
         */
        //this.counts = new int[COUNTRIES][MEDALS];
        //for ...
    }
    
    /**
     * Prints the entrie table
     */
    public void printTable()
    
    {
        // good: for(int row = 0; row < COUNTRIES; row++)
        // better:
        for(int row = 0; row < this.counts.length; row++)
        {
            // good: for(int col = 0; col < MEDALS; col++)
            // better: for(int col = 0; col < this.counts[0].length; col++)
            // best:
            for(int col = 0; col < this.counts[row].length; col++)
            {
                System.out.print(this.counts[row][col] + "\t");
            }
            System.out.println();
        }
    }


    
    
    
    
    
    
}
