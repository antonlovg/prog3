import java.util.*;

class Hej {
    public static void main(String[] args) {
        System.out.println("Datum och tid:");
        System.out.print(Calendar.getInstance().getTime().toString());

        var scan = new Scanner(System.in);
        String dat = scan.nextLine();
        String tid = dat.substring(11, 19);
        System.out.print("Klockan är " + tid);
    }
}

