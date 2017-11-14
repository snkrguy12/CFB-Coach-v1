package Simulation;

import java.util.Comparator;

/**
 * Created by ahngu on 11/13/2017.
 */

class CompTeamOYPG implements Comparator<Team> {
    @Override
    public int compare(Team a, Team b) {
        return a.teamOppYards / a.numGames() < b.teamOppYards / b.numGames() ? -1 : a.teamOppYards / a.numGames() == b.teamOppYards / b.numGames() ? 0 : 1;
    }
}
