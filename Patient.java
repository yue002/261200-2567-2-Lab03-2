public class Patient {
    private int id ;
    private String name;
    private int birthYear ;
    private double height ;
    private double weight ;
    private String bloodGroup;
    private String phoneNumber ;
    Patient( int id,String name, int birthYear,double height,double weight,String bloodGroup, String phoneNumber ){
        this.name = name;
        this.id = id;
        if(birthYear <= 0){
            System.out.println("Invalid Input");
        }
        else {
            this.birthYear = birthYear;
        }
        if(height <= 0){
           System.out.println("Invalid Input");
           this.height = height*(-1);

        }
        else {
            this.height = height;
        }
        if(weight <= 0){
            System.out.println("Invalid Input");
            this.weight = weight*(-1);
        }
        else {
            this.weight = weight;
        }
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;

    }
    public int getAge(int currentYear){
        int age = currentYear - this.birthYear;
        return age;

    }
    public double getBMI(){
        double BMI;
        if(weight >= 0 || height >= 0) {
            BMI = weight / ((height/100)*(height/100)) ;
        }
        else {
            System.out.print("Invalid Input");
            return BMI = 0.0;
        }
        return BMI ;
    }


    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient BMI : " + getBMI());
    }
    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "AB","0968073126" );
        patient.displayDetails(currentYear);
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0,"B","0816512559");
        invalidPatient.displayDetails(currentYear);
    }


}
