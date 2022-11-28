package civilitystates;

import relations.NpcRelations;

public class SuspiciousState implements CivilityState {
    @Override
    public void deescalate(NpcRelations relations) {
        relations.setCivilityLevel(new NeutralState());
    }

    @Override
    public void escalate(NpcRelations relations) {
        relations.setCivilityLevel(new HostileState());
    }

    @Override
    public void sayProximityDialog() {
        System.out.println("Guard says \". . . I'm  watching you.\"");
    }
}
