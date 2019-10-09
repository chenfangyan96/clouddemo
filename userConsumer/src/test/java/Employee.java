//02_1
import java.util.ArrayList;
public class Employee {
    private int ID;
    private String name;
    private double height;
    private double weight;
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getBMI(){
        double v = weight/(height*height);
        return v;
    }
    public  static void  searchEmployee(Employee[] employees, String name){
        for (Employee employee1:employees
             ) {
            if (name.equals(employee1.getName())){
                System.out.println("名字是"+name+"的人是:");
                System.out.println(employee1.getName());
            }

        }
    }
    public  static  void searchContainNameEmployee(Employee[] employees, String containName){
        ArrayList<Employee> employeeArraylist = new ArrayList<Employee>();
        for (Employee employ:employees
             ) {
            if (employ.getName().contains(containName)){
                employeeArraylist.add(employ);
            }
        }
        if (employeeArraylist.size()>0){
            System.out.println("名字包含"+containName+"的人是:");
            for (Employee e:employeeArraylist){
                System.out.println(e.getName());
            }
        }
    }
    public  static void searchStartNameEmployee(Employee[] employees, String startName){
        ArrayList<Employee> employeestartWith = new ArrayList<Employee>();
        for (Employee employ:employees
        ) {
            if (employ.getName().startsWith(startName)){
                employeestartWith.add(employ);
            }
        }
        if (employeestartWith.size()>0){
            System.out.println("名字以"+startName+"开头的人是:");
            for (Employee e:employeestartWith){
                System.out.println(e.getName());
            }
        }
    }
    public  static void searchEndNameEmployee(Employee[] employees, String endName){
        ArrayList<Employee> employeeendWith = new ArrayList<Employee>();
        for (Employee employ:employees
        ) {
            if (employ.getName().endsWith(endName)){
                employeeendWith.add(employ);
            }
        }
        if (employeeendWith.size()>0){
            System.out.println("名字以"+endName+"结尾的人是:");
            for (Employee e:employeeendWith){
                System.out.println(e.getName());
            }
        }
    }
    public static void showEmployeeBMI(Employee[] employees){
        for (Employee e:employees
             ) {
            if (e.getBMI()>=18&&e.getBMI()<25){
                System.out.println(e.getName()+":"+"正常体重");
            }else if (e.getBMI()>=25 && e.getBMI()<30){
                System.out.println(e.getName()+":"+"超重");
            }else if(e.getBMI()>=40){
                System.out.println(e.getName()+":"+"重度肥胖");
            }else if(e.getBMI()>=35){
                System.out.println(e.getName()+":"+"中度肥胖");
            }else if(e.getBMI()>=30){
                System.out.println(e.getName()+":"+"轻度肥胖");
            }else if (e.getBMI()<18){
                System.out.println(e.getName()+":"+"偏瘦");
            }
        }
    }

    public Employee(int ID, String name, double height, double weight) {
        this.ID = ID;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Employee[] employees=  new Employee[]{new Employee(123,"John",1.55,200),
                new Employee(456,"John hello",1.77,78),
                new Employee(15,"John what",1.5,99),
                new Employee(77,"MR.chen",1.6,55),
                new Employee(2,"Mr. lsy",1.9,50)
        };
        searchContainNameEmployee(employees,"John");
        searchEmployee(employees,"John");
        searchEndNameEmployee(employees,"John");
        searchStartNameEmployee(employees,"Mr");
        showEmployeeBMI(employees);
    }
}
