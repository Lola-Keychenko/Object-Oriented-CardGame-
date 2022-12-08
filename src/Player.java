import java.util.ArrayList;

public class Player {
    protected int score;
    protected String name;
    ArrayList<Observer> observerList;

    Player(String myname){
        score = 0;
        name = myname;
    }

    int getScore() {
        return score;
    }
    void setScore(int myScore) {
        score = myScore;
        //notify();
    }

    String getName(){
        return name;
    }
    void setName(String myName){
        name = myName;
    }

    void registerObserver(Observer obs) {
        observerList.add(obs);
    }

    void removeObserver(Observer obs) {
        int index = -1;
        for(int i = 0; i <= observerList.size(); i++){
            if(observerList.get(i) == obs){
                index = i;
            }
        }
        observerList.remove(index);
    }
    void notifyObserver(){
        for(int i = 0; i <= observerList.size(); i++){
            observerList.get(i).Update();
        }
    }
}

