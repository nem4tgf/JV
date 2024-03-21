/**
 * Lớp Client Sử dụng lớp Student để xây dựng chương trình java theo kịch bản
 *
 * @author(Nam)
 * @version 1.0
 */


public class Client {
    public static void main(String[]agrs){
        Student studentA;
        Student studentB;
        Student studentC;
        studentA=new Student();
        studentB=new Student(1,"Nguyen Van A",true);
        studentC = new Student(2, "Le Ho", false);
        studentB.printInfo();
        studentC.printInfo();
        studentC.setId(3);
        studentC.printInfo();
        studentB.setName("Nguyen Van B");
        studentB.printInfo();
    }
}
