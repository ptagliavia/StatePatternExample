package relations;

import civilitystates.CivilityState;
import civilitystates.NeutralState;

public class NpcRelations {
    private CivilityState civilityLevel = new NeutralState();

    public void setCivilityLevel(CivilityState civilityLevel) {
        this.civilityLevel = civilityLevel;
    }

    public void deescalateLevel() {
        System.out.println("***DEESCALATING***");
        civilityLevel.deescalate(this);
    }

    public void escalateLevel() {
        System.out.println("***ESCALATING***");
        civilityLevel.escalate(this);
    }

    public void proximityGreeting() {
        civilityLevel.sayProximityDialog();
    }

    public static void main(String[] args) {
        NpcRelations relations = new NpcRelations();

        relations.proximityGreeting();
        relations.escalateLevel();
        relations.proximityGreeting();
        relations.escalateLevel();
        relations.proximityGreeting();
    }
}
