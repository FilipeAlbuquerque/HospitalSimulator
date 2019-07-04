package state;

import domain.DrugsEffects;
import domain.Patient;
import domain.StateOfPatient;

import java.util.List;

import static domain.DrugsEffects.HEALTHY_PEOPLE_CATCH_FEVER;
import static domain.DrugsEffects.KILL;
import static domain.StateOfPatient.HEALTHY;

public class Healthy implements Patient {

    @Override
    public StateOfPatient getState() {
        return HEALTHY;
    }

    @Override
    public Patient reactTo(List<DrugsEffects> drugs) {
        if (drugs.contains(KILL)) {
            return new Dead();
        } else if (drugs.contains(HEALTHY_PEOPLE_CATCH_FEVER)) {
            return new Fever();
        } else {
            return new Healthy();
        }
    }
}
