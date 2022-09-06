public class Main {
    public static void main(String[] args) {
        Student DataStudent = new Student("Vladimir","Ivanov","PCS-419", "No");

        DataStudent.getStudentFN();
        DataStudent.getStudentLN();
        DataStudent.getStudentG();
        DataStudent.getStudentRW();

        DataStudent.GetSchoolship(5);
        DataStudent.GetSchoolship(4.9);

        Student DataAspirant = new Aspirant("VLAD","VLADIMIR","PCS-419", "YES");

        DataAspirant.getStudentFN();
        DataAspirant.getStudentLN();
        DataAspirant.getStudentG();
        DataAspirant.getStudentRW();

        DataAspirant.GetSchoolship(5);
        DataAspirant.GetSchoolship(4.5);
    }
}