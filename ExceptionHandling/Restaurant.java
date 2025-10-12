package ExceptionHandling;

public class Restaurant {
    final int totalTables=5;
    int occupiedTables=5;
    public void reserveTable() throws NoTableAvailableException{
        if (occupiedTables<totalTables){
            occupiedTables++;
            System.out.println("Reserved table number "+occupiedTables);
        }
        else{
            throw new NoTableAvailableException("No tables avaliable!");

        }
    }
}
