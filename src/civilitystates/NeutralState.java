package civilitystates;
import relations.NpcRelations;
public class NeutralState implements CivilityState {


    @Override
    public void deescalate(NpcRelations relations) {
        //already in default state
    }

    @Override
    public void escalate(NpcRelations relations) {
        relations.setCivilityLevel(new SuspiciousState());
    }

    @Override
    public void sayProximityDialog() {
        System.out.println("Oh, it's you.");
    }
}
