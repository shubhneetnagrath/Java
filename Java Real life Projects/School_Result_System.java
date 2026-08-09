public class School_Result_System {
    public static void main(String[] args) {
        int[][] marks = {
    {85, 90, 78, 88},
    {67, 75, 70, 80},
    {92, 88, 95, 91},
    {45, 50, 55, 60},
    {78, 82, 85, 80}
};
      double topperMarks = 0;
      for(int row = 0;row<marks.length;row++){
          double TotalMarks =0;
        for(int col = 0;col<marks[row].length;col++){
            TotalMarks = TotalMarks + marks[row][col];  
        }
        
        System.out.println("Total Marks of Student "+(row+1)+" = "+TotalMarks);
        System.out.println("Percentage of Student "+(row+1)+" = "+(TotalMarks/4));
          if(TotalMarks > topperMarks){
            topperMarks = TotalMarks;
          }
    
        }
        System.out.println("Topper Marks = "+ topperMarks);
    // Calculate total marks for each subject (column-wise)
    double totalSub1 = 0;
    double totalSub2 = 0;
    double totalSub3 = 0;
    double totalSub4 = 0;
    for(int row = 0; row < marks.length; row++){
        totalSub1 += marks[row][0];
        totalSub2 += marks[row][1];
        totalSub3 += marks[row][2];
        totalSub4 += marks[row][3];
    }
    System.out.println("Average marks for Subject 1 = " + (totalSub1/5));
    System.out.println("Average marks for Subject 2 = " + (totalSub2/5));
    System.out.println("Average marks for Subject 3 = " + (totalSub3/5));
    System.out.println("Average marks for Subject 4 = " + (totalSub4/5));
    }
    
}
