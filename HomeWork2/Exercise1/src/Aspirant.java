public class Aspirant extends Student {
public Aspirant(String firstName,String lastName,String group,String researchWork){
     super(firstName, lastName, group, researchWork);

 }

    @Override
    public void GetSchoolship(double averageMark){
    if(averageMark == 5) {
            SS = 20000;
            System.out.println(SS);}
        else {
            SS = 18000;
            System.out.println(SS);}
    }
    public void getStudentFN(){System.out.println(firstName);}
    void getStudentLN(){System.out.println(lastName);}
    void getStudentG(){System.out.println(group);}
    void getStudentRW(){System.out.println(researchWork);}


}
