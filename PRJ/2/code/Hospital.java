import java.util.ArrayList;
import java.util.List;

public class Hospital {

List <Doctor> doctorList = new ArrayList<Doctor>();
List <Patient> patientList = new ArrayList<Patient>();
String hospitalName;
void addDoctor(Doctor o)
{
    doctorList.add(o);

}
void addPatient(Patient o)
{
    patientList.add(o);
}
Hospital(String name)
{
    this.hospitalName=name;
}

public List<Doctor> showDoctors()
{
    return doctorList;
}
public List<Patient> showPatients()
{
    return patientList;
}

public void assignDoctor()
{
    for (Patient x: patientList){
    		for (Doctor y: doctorList){
    			if (x.getDisease().equals("brain"))
                        {
                            if (y.getDoctorspeciality().equals("Brain Surgeon"))
                            {
                                y.addPatientsToDoctor(x);
                             }
                     }
         if (x.getDisease().equals("spine"))
         {
             if (y.getDoctorspeciality().equals("Spine Surgeon"))
                 {
                    y.addPatientsToDoctor(x);
                 }
         }

         if (x.getDisease().equals("ear")||x.getDisease().equals("nose")||x.getDisease().equals("throat"))
         {
             if (y.getDoctorspeciality().equals("ENT Doctor"))
                 {
                    y.addPatientsToDoctor(x);
                 }
         }

         }
     }

}


}