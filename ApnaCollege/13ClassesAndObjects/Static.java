public class Static {
  public static void main() {
  Student s1= new Student();
  s1.schoolName = "JMV";
  // Student s2 = new Student();
  System.out.println(s1.schoolName);

  } 
}

class Student {
  static int returnPercentage(int m1, int m2, int m3){
    return (m1+m2+m3)/3;
  }
  String name;
  int rollNumber;
  static String schoolName;

  void getName(String name) {
    this.name = name;
  }
  String getName(){
    return this.name;
  }
}
