public class Vehicle {
    int number;
    int gas = 100;
    int speed = 0;
    int accel;
    int limitPeople = 30;

    public Vehicle(int num) {
        this.number = num;
    }
    public void Run() {
        System.out.println("차량이 달립니다");
    }

    public void Accel(int num) {
        System.out.println("차량이 가속합니다");
    }

    public void State(int num) {
        System.out.println("차량의 상태");
    }


    public void PeopleUp(int num) {
        System.out.println("승객이 탑승합니다");
    }
    public void PeopleDown(int num) {
        System.out.println("승객이 하차합니다.");
    }
}
