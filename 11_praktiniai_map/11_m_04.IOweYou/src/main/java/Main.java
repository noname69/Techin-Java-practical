
public class Main {

    public static void main(String[] args) {
        IOU iou = new IOU();

        iou.setSum("Jonas", 10);

        System.out.println(iou.howMuchDoIOweTo("Jonas"));

    }
}
