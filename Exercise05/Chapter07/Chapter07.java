package Exercise05.Chapter07;

interface Mineral {
    int valMineral();
}

class Gold implements Mineral {
    public int valMineral() {
        return 100;
    }
}

class Silver implements Mineral {
    public int valMineral() {
        return 90;
    }
}

class Bronze implements Mineral {
    public int valMineral() {
        return 80;
    }
}

class MineralCalculator {
    int value = 0;

    public void add(Mineral mineral) {
        this.value += mineral.valMineral();
    }

    public int getValue() {
        return this.value;
    }
}
public class Chapter07 {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }
}
