public class Main {
    public static void main(String[] args) {
        HumanDataStorage humanDataStorage = new HumanDataStorage("jdbc:postgresql://localhost:5432/draqneel_db", "postgres", "sbprt9991");
        humanDataStorage.addNewHuman(28,"Roman","Russia");
        System.out.println(humanDataStorage.getHumanByID((long) 3));
        System.out.println(humanDataStorage.getHumanList());

    }
}
