package dog;

class SoftlyState implements DogState {

    @Override
    public void showState() {
        System.out.println("在主人面前，听主人的命令");
    }
}
