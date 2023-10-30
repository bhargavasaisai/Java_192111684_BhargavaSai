class Bank 
{
    double getRateOfInterest() 
    {
        return 0.0;
    }
}
class SBI extends Bank 
{
    @Override
    double getRateOfInterest() 
    {
        return 8.4;
    }
}
class ICICI extends Bank 
{
    @Override
    double getRateOfInterest() 
    {
        return 7.3;
    }
}
class AXIS extends Bank 
{
    @Override
    double getRateOfInterest() 
    {
        return 9.7;
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println("Rate of interest in SBI: " + sbi.getRateOfInterest() + "%");
        System.out.println("Rate of interest in ICICI: " + icici.getRateOfInterest() + "%");
        System.out.println("Rate of interest in AXIS: " + axis.getRateOfInterest() + "%");
    }
}