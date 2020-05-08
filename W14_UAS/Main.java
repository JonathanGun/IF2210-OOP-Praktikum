public class Main {
    public static void main(String[] args) {
        Position A = new Position(1, 2);
        Position B = new Position(2, 2);
        Position C = new Position(4, 2);

        Courier P = new Courier(5, A);
        Product G = new Product(30000, 5, B);
        P.addToQueue(new HasPosition() {

            @Override
            public Position getPosition() {
                return new Position(5,4);
            }

            @Override
            public void setPosition(Position p) {
                // TODO Auto-generated method stub

            }
        }, new HasPosition() {

            @Override
            public Position getPosition() {
                return new Position(5,4);
            }

            @Override
            public void setPosition(Position p) {
                // TODO Auto-generated method stub

            }
        }, G);

        TransactionHandler T = new TransactionHandler(new Buyer("Tony", C, 30000), G, P);
        try {
            T.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("Harusnya 5 & ada exception: ");
        System.out.println(T.product.stock);

        TransactionHandler TA = new TransactionHandler(new Buyer("RicherTony", C, 50000), G, P);
        try {
            TA.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("Harusnya 4: ");
        System.out.println(TA.product.stock);
    }
}