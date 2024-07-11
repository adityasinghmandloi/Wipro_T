/**
 * InnerEhealthrsys
 */
interface Doctor {
    void accept_appointments();
    void reject_appointments();
    void view_patients();
    void prescribe();    
}

interface Patient{

    void book_appointment();
    void cancel_appointment();
    void view_records();
    void view_doctors();
    
}

interface Healthcare {

    void view_records();
    void view_patients();

}

class Admin implements Doctor, Patient, Healthcare{
    public void accept_appointments(){
        System.out.println("Accept");

    }
    public void reject_appointments(){
        System.out.println("Reject");
    }
    public void view_patients(){
        System.out.println("view Patient");

    }
    public void prescribe(){
        System.out.println("Prescribe");

    }
    public void book_appointment(){
        System.out.println("Book");

    }
    public void cancel_appointment(){
        System.out.println("Cancel");

    }
    public void view_records(){
        System.out.println("View Records");

    }
    public void view_doctors(){
        System.out.println("View Doctors");

    }
}


public class Ehealthrsys extends Admin {
    public static void main(String[] args) {

        Ehealthrsys obj= new Ehealthrsys();
        System.out.println(" Accept "+ obj.accept_appointments());
        obj.book_appointment();
        obj.cancel_appointment();
        obj.prescribe();
        obj.reject_appointments();
        obj.view_doctors();
        obj.view_records();
        obj.view_patients();
        
    }

}
