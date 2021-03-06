package results;

import domain.Patient;
import domain.StateOfPatient;

import java.util.List;

import static domain.StateOfPatient.*;

public class PatientStatistics {

    private List<Patient> patients;

    public PatientStatistics(List<Patient> patients){
        this.patients = patients;
    }

    public String getPatients(){

        int fever = numberOfSickPatients(FEVER);
        int healthy = numberOfSickPatients(HEALTHY);
        int diabetes = numberOfSickPatients(DIABETES);
        int tuberculosis = numberOfSickPatients(TUBERCULOSIS);
        int dead = numberOfSickPatients(DEAD);

        return "F:" + fever + ",H:" + healthy + ",D:" + diabetes  + ",T:" + tuberculosis + ",X:" + dead;

    }

    private int numberOfSickPatients(StateOfPatient stateOfPatients){

        long count;
        count = patients.stream()
                .filter(x -> x.getState().equals(stateOfPatients))
                .count();

        return (int) count;
    }

}
