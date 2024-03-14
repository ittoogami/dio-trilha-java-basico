public class ExemploFor {
    public static void main(String[] args) throws InterruptedException {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {

            System.out.println("Contanto carneirinhos " + carneirinhos);
            Thread.sleep(1000);

        }
    }

}
