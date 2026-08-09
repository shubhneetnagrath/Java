/*
Scenario

>Store temperatures for 7 days and 3 cities.
*/ 
public class Weather_Data_Analysis {
    public static void main(String[] args) {
         int[][] temp = {
            {32, 35, 30},
            {34, 36, 31},
            {33, 37, 29},
            {35, 38, 32},
            {36, 39, 33},
            {37, 40, 34},
            {38, 41, 35}
        };
        
        int total = 0;
        int count = 0;

        for(int i = 0; i < temp.length;i++){

            for(int j = 0; j < temp[i].length;j++){

                total += temp[i][j];
                count++;
            }
        }
        System.out.println("Average Temperature: " +
                (double) total / count);
    }
}

/*
Real World

Weather apps and analytics systems process data in similar structures.
*/
