
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
         // Sort by goals and print top 10
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        // Sort by penalties and print top 10
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(10);

        // Print statistics for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");

        // Print statistics for team PHI
        NHLStatistics.teamStatistics("PHI");

        // Sort by points
        NHLStatistics.sortByPoints();

        // Print statistics for team ANA
        NHLStatistics.teamStatistics("ANA");
    }
}
