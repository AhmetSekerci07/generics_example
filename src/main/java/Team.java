import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;
    private ArrayList<T> memebers = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (memebers.contains(player)) {
            System.out.println((player).getName() + " is already on this team");
            return false;
        } else {
            memebers.add(player);
            System.out.println((player).getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.memebers.size();
    }
}
