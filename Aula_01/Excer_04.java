public class Excer_04 {
    public static void main(String[] args) {

        int centímetros;
        int metros;
        int counter;

        counter = 0;

        for (metros = 1; metros <= 50; metros++) {
            centímetros = metros * 100;
            System.out.println(metros + " Metros e " + centímetros + " centímetros ");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }

    }
}