package dog;

class Dog {

    public void setState(DogState state) {
        // 接口回调
        state.showState();
    }
}
