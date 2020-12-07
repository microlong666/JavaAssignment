package dog;

class MeetFriendState implements DogState {

    @Override
    public void showState() {
        System.out.println("遇到朋友晃动尾巴，表示欢迎");
    }
}