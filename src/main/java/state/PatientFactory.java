package state;

import domain.Patient;
import domain.StateOfPatient;

public class PatientFactory {

    public static Patient createPatient(StateOfPatient stateOfPatient) {

        switch (stateOfPatient) {

            case FEVER:
                return new Fever();

            case DEAD:
                return new Dead();

            case DIABETES:
                return new Diabetes();

            case TUBERCULOSIS:
                return new Tuberculosis();

            case HEALTHY:
                return new Healthy();

            default: throw new RuntimeException("Cannot create a Patient");

        }
    }
}
