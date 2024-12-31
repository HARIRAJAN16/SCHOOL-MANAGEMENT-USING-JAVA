//basic 
public class person {
    private int id;
    private String name;
    private int age;
    private String city;
    public person(int id,String name,int age,String city){
        this.id=id;
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        if(id>0){
            this.id=id;
        }
        else{
            System.out.println("Invalid Id.");
        }
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name!=null&&!name.isEmpty()){
            this.name=name;
        }
        else{
            System.out.println("Invalid name.");
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(id>0){
            this.age=age;
        }
        else{
            System.out.println("Invalid Age.");
        }
    }
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        if(city!=null&&!city.isEmpty()){
            this.city=city;
        }
        else{
            System.out.println("Invalid city.");
        }
    }
    public void Display(){
        System.out.println("Id : "+id+"Name : "+name+"Age : "+age+"City : "+city);
    }

}
//student 
public class student extends person{
    private int grade;
    private String studentid;
    public student(int id,String name,String city,int age,int grade,String studentid){
        super(id,name,age,city);
        this.grade=grade;
        this.studentid=studentid;
    }
    public String getStudentid(){
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("STUDENT ID: "+studentid+"GRADE: "+grade);
    }
    
}
//teacher
class teacher extends person{
    private String subject;
    private String salary;
    public teacher(int id,String name,int age,String city,String subject,String salary){
        super(id,name,age,city);
        this.subject=subject;
        this.salary=salary;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    @Override
    public void Display(){
        super.Display();
        System.out.print(" Subject : "+subject+" Salary : "+salary);
    }
}
//ADMIN STAFF

class Adminstaff extends person {
    private String dept;
    private String role;
    public Adminstaff(int id,String name,int age,String city,String dept,String role){
        super(id,name,age,city);
        this.dept=dept;
        this.role=role;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public void Display(){
        super.Display();
        System.out.print(" Department : "+dept+" Role : "+role);
        }
}
//main class
public class Schoolmanagement{
    public static void main(String args[]){
        person s1=new student(1,"GIRIVASAN","NAMMAKAL",22,1,"BEC054");
        person s2=new student(2,"GURUKARTHIKEYAN","KARUR",21,3,"BEC062");
        person s3=new teacher(3,"GOKUL",55,"MOHANUR","ECE","40000");
        s3.Display();
        s2.Display();
        s1.Display();

    }
}
