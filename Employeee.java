public class Employeee{
    private String firstName;
    private String lastName;
    private int monthlySalary;
    public Employeee(String firstName, String lastName, int monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary: 0;
    }
    public int getYearlySalary(){
        return monthlySalary * 12;
    }
    public void applyRaise(double percentage){
        monthlySalary = (int) (monthlySalary * (1 + percentage/100));
    }
    public static void main(String[] args){
        Employeee emp1 = new Employeee("haji", "ngwali",5000);
        Employeee emp2 = new Employeee("hajis", "mngwali", -3000);

    
        emp1.applyRaise(10);
        emp2.applyRaise(5);
        System.out.println(emp1.getYearlySalary());
        System.out.println(emp2.getYearlySalary());
    }
}