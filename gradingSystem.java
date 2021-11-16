import java.util.Scanner;

public class gradingSystem{
	public static void main(String[] args) {
		System.out.println("Welcome to the Grading System.");
		int examScore, assessmentScore, totalScore, schoolFeePaid;
		boolean schoolFeesVerify, examPassed, assessmentPassed, condoned = false;
		Scanner getMark = new Scanner(System.in);
		Scanner getFee = new Scanner(System.in);
		System.out.println("Enter Examination Mark: ");
		examScore = getMark.nextInt();
		System.out.println("Enter Assessment Mark: ");
		assessmentScore = getMark.nextInt();
		System.out.println("Enter School Fees Paid: ");
		schoolFeePaid = getFee.nextInt();
		totalScore = examScore + assessmentScore;
		schoolFeesVerify = true;
		if(examScore > 24 && assessmentScore > 14) {
			examPassed = true;
			assessmentPassed = true;
		}
		else if(totalScore > 38){
			if(examScore < 25) {
				examPassed = false;
				assessmentPassed = true;
				condoned = true;
			}
			else {
				examPassed = true;
				assessmentPassed = false;
				condoned = true;
			}
		}
		else {
			examPassed = false;
			assessmentPassed = false;
		}
		
		if(schoolFeePaid >= 100) {
			schoolFeesVerify = true;
		}
		else {
			schoolFeesVerify = false;
		}
		
		if(examPassed == true && assessmentPassed == true && schoolFeesVerify == true) {
			System.out.println("Student passed in both Examination and Assessment");
			System.out.println("Student has paid School Fees in full.");
			System.out.println("Issue certificate to student.");
		}
		else if(examPassed == true && assessmentPassed == true && schoolFeesVerify == false) {
			System.out.println("Student passed in both Examination and Assessment.");
			System.out.println("Student has not paid School Fees in full.");
			System.out.println("Certificate will not be issued.");
		}
		else if(examPassed == false && assessmentPassed == true && condoned == true && schoolFeesVerify == true) {
			System.out.println("Student failed in Examination but passed in Assessment.");
			System.out.println("Student is condoned.");
			System.out.println("Student has paid school fees in full.");
			System.out.println("Issue certificate to student.");
		}
		else if(examPassed == true && assessmentPassed == false && condoned == true && schoolFeesVerify == true) {
			System.out.println("Student passed in Examination but failed in Assessment.");
			System.out.println("Student is condoned.");
			System.out.println("Student has paid school fees in full.");
			System.out.println("Issue certificate to student.");
		}
		else if(examPassed == false && assessmentPassed == true && condoned == false && schoolFeesVerify == true) {
			System.out.println("Student failed in Examination but passed in Assessment.");
			System.out.println("Student is not condoned.");
			System.out.println("Student has paid school fees in full.");
			System.out.println("Certificate will not be issued.");
		}
		else if(examPassed == true && assessmentPassed == false && condoned == false && schoolFeesVerify == true) {
			System.out.println("Student passed in Examination but failed in Assessment.");
			System.out.println("Student is not condoned.");
			System.out.println("Student has paid school fees in full.");
			System.out.println("Certificate will not be issued.");
		}
		else if(examPassed == true && assessmentPassed == false && condoned == true && schoolFeesVerify == false) {
			System.out.println("Student passed in Examination but failed in Assessment.");
			System.out.println("Student is condoned.");
			System.out.println("Student has not paid school fees in full.");
			System.out.println("Certificate will not be issued.");
		}
		else if(examPassed == false && assessmentPassed == true && condoned == true && schoolFeesVerify == false) {
			System.out.println("Student failed in Examination but passed in Assessment.");
			System.out.println("Student is condoned.");
			System.out.println("Student has not paid school fees in full.");
			System.out.println("Certificate will not be issued.");
		}
		else if(examPassed == true && assessmentPassed == false && condoned == false && schoolFeesVerify == false) {
			System.out.println("Student passed in Examination but failed in Assessment.");
			System.out.println("Student is not condoned.");
			System.out.println("Student has not paid school fees in full.");
			System.out.println("Certificate will not be issued.");
			System.out.println("Student has to be repeated.");
		}
		else if(examPassed == false && assessmentPassed == true && condoned == false && schoolFeesVerify == false) {
			System.out.println("Student failed in Examination but passed in Assessment.");
			System.out.println("Student is not condoned.");
			System.out.println("Student has not paid school fees in full.");
			System.out.println("Certificate will not be issued.");
			System.out.println("Student has to be repeated.");
		}
		else if(examPassed == false && assessmentPassed == false && condoned == false && schoolFeesVerify == true){
			System.out.println("Student failed in both Examination and Assessment.");
			System.out.println("Student has paid school fees in full.");
			System.out.println("Certificate will not be issued.");
			System.out.println("Student has to be repeated.");
		}
		else if(examPassed == false && assessmentPassed == false && condoned == false && schoolFeesVerify == false) {
			System.out.println("Student failed in both Examination and Assessment.");
			System.out.println("Student has not paid school fees in full.");
			System.out.println("Certificate will not be issued.");
			System.out.println("Student has to be repeated.");
		}
		else {
			System.out.println("There has been a mistake somewhere... Error...Error...Er...");
		}
	}
}