public class Start {
    public static void main(String[] args) throws Exception {
        Risorsa r = new Risorsa();
        Produttore p = new Produttore("Prod1", r);
        Produttore p2 = new Produttore("Prod2", r);
        Consumatore c = new Consumatore("Cons1", r);
        Consumatore c2 = new Consumatore("Cons2", r);

        p.start();
        p2.start();
        c.start();
        c2.start();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        c.arresta();
        c2.arresta();
        p.arresta();
        p2.arresta();

        System.out.println("THread MAIN FINE");
    }
}
