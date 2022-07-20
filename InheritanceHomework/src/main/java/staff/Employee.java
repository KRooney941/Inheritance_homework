package staff;

public class Employee {


    private String name;
    private int niNum;


    public int salary;

    public Employee(String name, int niNum, int salary){
        this.name = name;
        this.niNum = niNum;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getNiNum(){
        return niNum;
    }

    public int getSalary(){
        return salary;
    }

    public double raiseSalary(double raise){
       if (raise > 0) {
           return salary = (int) (salary + raise);
        }
        return salary;
    }

    public double getBonus() {
        return salary * 0.01;
    }

    public String setName(String name) {
        if (this.name == null || this.name.isEmpty()){
            return ("Invalid name");
        }
        return this.name = name;
    }

}
