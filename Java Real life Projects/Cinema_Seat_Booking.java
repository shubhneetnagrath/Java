/*
Scenario

>A theater has 5 rows and 10 seats.
*/
public class Cinema_Seat_Booking {
    public static void main(String[] args) {
        
        int [][] seats = new int[5][10];
        
        seats[2][4] = 1;
        seats[0][7] = 1;
        seats[4][2] = 1;

        for(int row = 0; row <seats.length; row++){
            for(int col = 0; col < seats[row].length ;col++){
                if(seats[row][col] == 0){
                    System.out.print("O ");
                } else{
                    System.out.print("X ");
                }
            }
        System.out.println();
        }
    }
}
