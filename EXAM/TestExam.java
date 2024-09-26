/*Assignment 2: Exam Grading System
Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
Requirements:
Use logical operators && and || to combine conditions.
 */
package assignment26;

public class TestExam {

	public static void main(String[] args) {
		Exam exam=new Exam();
		exam.accept();
		exam.display();
		exam.calculateAvg();
		exam.checkPassing();
	}

}
