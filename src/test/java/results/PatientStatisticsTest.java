package results;

import domain.Patient;
import org.testng.annotations.Test;
import state.Diabetes;
import state.Healthy;
import state.Tuberculosis;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class PatientStatisticsTest {

    @Test
    public void healthyPatients() {

        List<Patient> patientResults = Arrays.asList(new Healthy(), new Healthy(), new Healthy());
        String output = "F:0,H:3,D:0,T:0,X:0";

        String result = new PatientStatistics(patientResults).getPatients();

        assertEquals(result, output);

    }

    @Test
    public void patientsWithDisease() {

        List<Patient> patientResults = Arrays.asList(new Diabetes(), new Healthy(), new Tuberculosis());
        String output = "F:0,H:1,D:1,T:1,X:0";

        String result = new PatientStatistics(patientResults).getPatients();

        assertEquals(result, output);
    }

}
