public class Bus extends Vehicle{
    int money = 0;
    int peopleUp = 0;
    int peopleDown = 0;
    int people = 30;
    int busState = 0;
    public Bus(int num) {
        super(num);
        System.out.println(number + " 버스 객체 생성 완료!");
    }

    public void Run() {
        busState = (int)(Math.random() * 2);

        if (PeopleState() == 1 || GasState() == 1) {
            System.out.println("멈춤!");
        } else if (busState == 1) {
            State(busState);
        } else {
            peopleUp = (int)(Math.random() * 10);
            peopleDown = (int)(Math.random() * 10);
            if (peopleDown > people) {
                peopleDown = people;
            }
            PeopleUp(peopleUp);
            PeopleDown(peopleDown);
            Accel((int)(Math.random() * 10));

            System.out.println("현재 속도 : " + speed );
            System.out.println("탑승 승객 수 : " + peopleUp);
            System.out.println("하차 승객 수 : " + peopleDown);
            System.out.println("현재 승객 수 : " + people);
            System.out.println("잔여 승객 수 : " + (limitPeople - people));
            System.out.println("요금 확인 : " + money);

            gas -= 5;
            State((int)(Math.random() * 2));

            if (gas <= 5) {
                System.out.println("쥬유량 : " + gas);
                System.out.println("주유가 필요합니다");
            }
        }

    }

    public void Accel(int num) {
        accel = num;
        speed += num;
    }

    public void State(int num) {
        if (num == 1) {
            System.out.println("주유량 : " + gas);
            System.out.println("상태 : 차고지 행");
            gas += 10;
            System.out.println("주유량 : " + gas);
        } else {
            System.out.println("운행중");
        }
    }

    public int GasState() {
        if (gas <= 0) {
            System.out.println("주유량 : " + gas);
            return 1;
        }

        return 0;
    }

    public void PeopleUp(int num) {
        people += num;
        money += num*1000;
    }
    public void PeopleDown(int num) {
        people -= num;
    }

    public int PeopleState() {
        if (people > limitPeople) {
            System.out.println("최대 승객 수를 초과했습니다.");
            System.out.println("정원 : " + limitPeople);
            System.out.println("현재 인원 : " + people);
            return 1;
        }

        return 0;
    }
}
