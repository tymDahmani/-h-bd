
public class you {
    // mood + status + hope + age
    
    String mood;
    String status;
    String hope;
    int age;
    boolean alive;

    you() {
        this.mood = mood;
        this.status = status;
        this.hope = hope;
        this.age = age;
        this.alive = alive;

    }

    public String makeHappy() {
        this.mood = "happy";
        return this.mood;
    }

    void highHopes() {
        this.hope = "high";
    }

    void getEnergetic() {
        this.status = "energetic";
    }

    void nextLevel() {
        this.age ++;
    }

    boolean isAlive() {
        this.alive = true;
        return alive;
    }
    
}
