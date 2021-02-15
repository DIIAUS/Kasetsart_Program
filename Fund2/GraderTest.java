import java.util.Scanner;
public class GraderTest
{
  public static void main(String[] args)
  {
    for(int k=0; k<2 ;k++)
    {
      // input of subjects
      // input number of students
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter course name: ");
      String Cname = sc.nextLine();
      grader data = new grader(Cname);
      System.out.print("Enter number of students: ");
      int numst = sc.nextInt();
      System.out.println("\n");
      System.out.println("Input scores");

      //add scores in ArrayList
      for(int i=0; i < numst;i++)
      {
        double score = sc.nextDouble();
        data.addScores(score);
      }
      //show mean and grade
      System.out.println();
      System.out.printf("Mean for %s = %.2f\n",Cname,data.mean());
      System.out.printf("Below mean = "+data.belowMean()+"\n");
      System.out.printf("Above mean = "+data.aboveMean()+"\n");
      System.out.print("Grade: ");
      data.showGrade();
      System.out.println("#####################\n");



    }
  }
}
