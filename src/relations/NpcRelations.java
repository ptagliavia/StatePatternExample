package relations;

import civilitystates.CivilityState;
import civilitystates.NeutralState;

public class NpcRelations {
    private CivilityState civilityLevel = new NeutralState();

    public civilitystates.CivilityState getCivilityLevel() {
        return civilityLevel;
    }

    public void setCivilityLevel(CivilityState civilityLevel) {
        this.civilityLevel = civilityLevel;
    }
// getter, setter

    public void deescalateLevel() {
        civilityLevel.deescalate(this);
    }

    public void escalateLevel() {
        civilityLevel.escalate(this);
    }

    public void proximityGreeting() {
        civilityLevel.sayProximityDialog();
    }

    public static void main(String[] args) {
        NpcRelations test = new NpcRelations();

        test.proximityGreeting();

        test.escalateLevel();

        test.proximityGreeting();

        test.escalateLevel();

        test.proximityGreeting();
    }
}
