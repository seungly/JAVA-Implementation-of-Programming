public class DoctorLauncher {

    public static void main(String[] args) {
        //Create an object
        Doctor a = new Doctor();
        FamilyDoctor b = new FamilyDoctor();
        Surgeon c = new Surgeon();

        //Initialize the 'workAtHospital' variable
        a.workAtHospital = true;
        b.workAtHospital = false;
        c.workAtHospital = true;

        //print the 'workAtHospital' variable
        System.out.println("Doctor - work at Hospital?: " + a.workAtHospital);
        System.out.println("Family Doctor - work at Hospital?: " + b.workAtHospital);
        System.out.println("Surgeon - work at Hospital?: " + c.workAtHospital);

        //execute each method
        a.treatPatient();
        b.treatPatient();
        b.giveAdvice();
        c.treatPatient();
    }
}