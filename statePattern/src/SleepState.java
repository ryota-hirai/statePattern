public class SleepState extends DogState {
    private static SleepState s = new SleepState();

    private SleepState() {
    }

    public static DogState getInstance() {
        return s;
    }

    public void tukareta(Dog moto) {
    }

    public void tabeta(Dog moto) {
        moto.changeState(TanoshiiState.getInstance());
    }

    public String toString() {
        return "睡眠状態";
    }
}