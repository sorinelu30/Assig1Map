import java.util.Arrays;

public class Aufgabe1 {
    //Ex 1
    public static int[] getFailingGrades(int[] grades) {
        return Arrays.stream(grades).filter(grade -> grade < 40).toArray();
    }
    //Ex 2
    public static double getAverageGrade(int[] grades) {
        return Arrays.stream(grades).average().orElse(0.0);
    }
    //Ex 3
    public static int[] getRoundedGrades(int[] grades) {
        return Arrays.stream(grades).map(grade -> {
            if (grade < 38) return grade;
            int multiOf5 = (grade + 4) / 5 * 5;
            return (multiOf5 - grade < 3) ? multiOf5 : grade;
        }).toArray();
    }
    //Ex 4
    public static int getMaxRoundedGrade(int[] grades) {
        return Arrays.stream(getRoundedGrades(grades)).max().orElse(0);
    }

    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};

        System.out.println("The failing grade are: " + Arrays.toString(getFailingGrades(grades)));
        System.out.println("The average grade of the class is: " + String.format("%.2f", getAverageGrade(grades)));
        System.out.println("The rounded grades are: " + Arrays.toString(getRoundedGrades(grades)));
        System.out.println("The highest rounded grade is: " + getMaxRoundedGrade(grades));
    }
}
