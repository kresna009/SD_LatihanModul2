import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> hewan = new LinkedList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Hewan :" + hewan);

        LinkedList<String> delete_hewan = new LinkedList<>();
        delete_hewan.add("Kelinci");
        delete_hewan.add("Kambing");
        delete_hewan.add("Unta");

        System.out.println("Hewan yang didelete : " + delete_hewan);
        hewan.removeAll(delete_hewan);

        System.out.println("Output : " + hewan);
    }
}