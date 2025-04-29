public class Employee{
    String name;
    int id;
    double salary;
    String address;

    public Employee(String name,int id,double salary,String address){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.address=address;
    }

    public void displayinfo(){
        System.out.println("employee id:"+ id );
        System.out.println( "employee name:"+ name);
        System.out.println( "salary:"+ salary);
        System.out.println("employee:$" +address);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("ramya",101,5000.0,"Hubbali");
        emp1.displayInfo();
    }
}