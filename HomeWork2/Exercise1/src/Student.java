public class Student {
    public String firstName, lastName, group, researchWork;
   public double averageMark, SS;
    Student(){}
    Student(String firstName,String lastName, String group, String researchWork){
      this.firstName = firstName;
      this.lastName = lastName;
      this.group = group;
      this.researchWork = researchWork;
    }
    public void GetSchoolship(double averageMark){
    if(averageMark == 5) {
        SS = 10000;
        System.out.println(SS);}
    else {
        SS = 8000;
        System.out.println(SS);
    }
    }
    void getStudentFN(){System.out.println(firstName);}
    void getStudentLN(){System.out.println(lastName);}
    void getStudentG(){System.out.println(group);}

    void getStudentRW(){System.out.println("NO RW");}

/*    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    public void setGroup(String group) {
        this.group = group;
    }*/
}
