package dog;

class MeetEnemyState implements DogState {

    @Override
    public void showState() {
        System.out.println("遇到敌人狂叫，并冲向去狠咬敌人");
    }
}
