package state;

import domain.DrugsEffects;
import domain.Patient;
import domain.StateOfPatient;

import java.util.List;

import static domain.StateOfPatient.DEAD;

public class Dead implements Patient {

    @Override
    public StateOfPatient getState() {
        return DEAD;
    }

    @Override
    public Patient reactTo(List<DrugsEffects> drugs) {
        if (drugs.contains(DrugsEffects.RESURRECT)){
            return new Healthy();
        }

        return new Dead();
    }
}
