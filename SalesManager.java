public class SalesManager extends Employee {
    private double sales;

    public SalesManager(String name, double baseSalary, double sales) {
        super(name, baseSalary);
        this.sales = sales;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (sales * 0.05);
    }
}