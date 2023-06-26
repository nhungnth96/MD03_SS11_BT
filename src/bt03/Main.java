package bt03;

public class Main {
    public static void main(String[] args) {
        Queuee queuee = new Queuee();
        queuee.enQueue(10);
        queuee.enQueue(20);
        queuee.enQueue(30);
        System.out.println(queuee.deQueue()); // 10
        System.out.println(queuee.deQueue()); // 20

        queuee.enQueue(40);
        queuee.enQueue(50);

        System.out.println(queuee.deQueue()); // 30
        System.out.println(queuee.deQueue()); // 40

        queuee.enQueue(60);

        System.out.println(queuee.deQueue()); // 50

    }
}
