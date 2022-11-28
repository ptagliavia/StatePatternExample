package civilitystates;

import relations.NpcRelations;

public class HostileState implements CivilityState {

    @Override
    public void deescalate(NpcRelations relations) {
        relations.setCivilityLevel(new SuspiciousState());
    }
    @Override
    public void escalate(NpcRelations relations) {
        //already in highest state
    }
    @Override
    public void sayProximityDialog() {
        System.out.println("Guard says \"Stop right there, criminal scum!\"");
    }
}
