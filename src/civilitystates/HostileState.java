package civilitystates;

import relations.NpcRelations;

public class HostileState implements CivilityState {

    @Override
    public void deescalate(NpcRelations relations) {
        relations.setCivilityLevel(new SuspiciousState());
    }
    @Override
    public void escalate(NpcRelations relations) {
        //already in default state
    }
    @Override
    public void sayProximityDialog() {
        System.out.println("Stop right there, criminal scum!");
    }
}
