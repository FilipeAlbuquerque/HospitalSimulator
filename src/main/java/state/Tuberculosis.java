package state;

import domain.DrugsEffects;
import domain.Patient;
import domain.StateOfPatient;

import java.util.List;

import static domain.DrugsEffects.CURES_TUBERCULOSIS;
import static domain.DrugsEffects.KILL;
import static domain.StateOfPatient.TUBERCULOSIS;

public class Tuberculosis implements Patient {

    @Override
    public StateOfPatient getState() {
        return TUBERCULOSIS;
    }

    @Override
    public Patient reactTo(List<DrugsEffects> drugs) {
        if (drugs.contains(KILL)) {
            return new Dead();
        } else if (drugs.contains(CURES_TUBERCULOSIS)) {
            return new Healthy();
        } else {
            return new Tuberculosis();
        }
    }
}
