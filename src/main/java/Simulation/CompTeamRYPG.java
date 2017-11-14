package Simulation;

import java.util.Comparator;

/**
 * Created by ahngu on 11/13/2017.
 */

class CompTeamRYPG implements Comparator<Team> {
    @Override
    public int compare(Team a, Team b) {
        return a.teamRushYards / a.numGames() > b.teamRushYards / b.numGames() ? -1 : a.teamRushYards / a.numGames() == b.teamRushYards / b.numGames() ? 0 : 1;
    }
}
