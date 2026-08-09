public class Percentage {
    public static void main(String[] args) {
        int phy = 78, chem = 74, maths = 86, english = 96, PHE = 89;
        double marksobtained =(phy+chem+maths+PHE+english);

        System.out.println("Subject       Marks Obtained  Total Marks");
System.out.println();
        System.out.println("Physics       " + phy +"               "  + (100));
        System.out.println("Chemistry     " + chem +"               "  + (100));
        System.out.println("Maths         " + maths +"               "  + (100));
        System.out.println("Physical Edu. " + PHE +"               "  + (100));
        System.out.println("English       " + english +"               "  + (100));
        System.out.println();
        System.out.println("Marks Obtained " + "= " + marksobtained + "   " + "Percentage " +"= "+ ((marksobtained*100)/500));
        






    }
}
