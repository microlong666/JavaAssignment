package dog;

/**
 * 上机实践：接口回调实现狗的不同状态
 *
 * @author MicroLOONG
 */

public class CheckDogState {

    public static void main(String[] args) {
        Dog yellowDog = new Dog();
        yellowDog.setState(new SoftlyState());
        yellowDog.setState(new MeetEnemyState());
        yellowDog.setState(new MeetFriendState());
        yellowDog.setState(new MeetAnotherDog());
    }
}
