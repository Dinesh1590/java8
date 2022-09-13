package practise;

public class Player {


    int id;
    int matches;
    int num1;
    String name;
    String name1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }


    public Player(int id, int mat, int num1, String name, String name1) {
        this.id = id;
        this.matches = mat;
        this.num1 = num1;
        this.name = name;
        this.name1 = name1;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", matches=" + matches +
                ", num1=" + num1 +
                ", name='" + name + '\'' +
                ", name1='" + name1 + '\'' +
                '}';
    }
}
