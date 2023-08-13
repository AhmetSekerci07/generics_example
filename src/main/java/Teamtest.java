public class Teamtest {

    public static void main(String[] args) {


        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team <SoccerPlayer> liverpool = new Team("Liverpool");

        Team<BaseballPlayer> brokenTeam = new Team<>("o");
        //if you have no parameter for team its build default contractor but cuz you build the const you must put name

        // liverpool.addPlayer(joe);
       // liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);


        System.out.println(liverpool.numPlayers());

    }
}
