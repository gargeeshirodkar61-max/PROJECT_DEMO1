class UI1 {
    void display() {
        System.out.println("UI1 is displayed.");
    }

    UI1(){
        System.out.println("UI1 is initialized.");
    }

    public static void main(String[] args) {
        UI1 ui1 = new UI1();
        ui1.display();
    }
}
