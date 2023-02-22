package Java_Basics.Uni;

public class main {
    public static void mainClass(String[] args){
        student S = new student();
        S.setMarks(71);
        S.setRegNo("R1");
        S.setFaculty("F1");System.out.println("First Name:"+S.getFirstName()+"Last Name:"+S.getLastName()+"Marks: "+S.getMarks()+"Faculty: "+S.getFaculty()+"RegNo: "+S.getRegNo());
        S.setFirstName("Billy");
        S.setLastName("Bits");
    
    System.out.println("First Name:"+S.getFirstName()+"Last Name:"+S.getLastName()+"Marks: "+S.getMarks()+"Faculty: "+S.getFaculty()+"RegNo: "+S.getRegNo());
        
        staff T = new staff();
        T.setStaffNo(1562);
        T.setSalary(10000);
        T.setEmail("example@example.com");
        T.setFirstName("Bin");
        T.setLastName("Wallah");

    System.out.println("First Name:"+T.getFirstName()+"Last Name:"+T.getLastName()+"Email: "+T.getEmail()+"Salary: "+T.getSalary()+"StaffNo: "+T.getStaffNo());

        lecturer L = new lecturer();
        L.setUnitName("Calculus");
        L.setFirstName("Dr. Bitok");
        L.setLastName("Diasco");
        L.setEmail("email@gmail.com");

    System.out.println("First Name: "+L.getFirstName()+"Last Name: "+L.getLastName()+"Email: "+L.getEmail()+"Unit: "+L.getUnitName());

    }

}
