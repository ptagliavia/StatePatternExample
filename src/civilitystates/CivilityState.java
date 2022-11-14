package civilitystates;

import relations.NpcRelations;

public interface CivilityState {
    void escalate(NpcRelations relations);
    void sayProximityDialog();
    void deescalate(NpcRelations relations);
}
