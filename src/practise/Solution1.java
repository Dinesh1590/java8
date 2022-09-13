package practise;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1 {

    public static void main(String[] args) {

        Player player=new Player(1,3,2,"abc","hello");
        Player player1=new Player(2,4,2,"abc","hello");
        Player player2=new Player(3,1,2,"abc","hello");
        Player player3=new Player(4,0,2,"abc","hello");

        Player[] pr=new Player[]{player,player1,player2,player3};

        if(findPlayerWithMinimumMatchesPlayed(pr)==null)
        {
            System.out.println("No Player Found With Mentioned Attibutes");
        }else {
            System.out.println(findPlayerWithMinimumMatchesPlayed(pr));
        }

        if(searchPlayerById(pr,2)==null)
        {
            System.out.println("No Player Found With Mentioned Attibutes");
        }else {
            System.out.println(searchPlayerById(pr,2));
        }
    }
    static Player findPlayerWithMinimumMatchesPlayed(Player[] pr)
    {
        Arrays.sort(pr, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if(o1.matches>o2.matches){
                    return -1;
                }else
                    return 1;
            }
        });
        return pr[pr.length-1];
    }

    static Player searchPlayerById(Player[] pr,int id)
    {
        for (Player player:pr) {
            if(player.id==id)
            {
                return player;
            }
        }
        return null;
    }
}
