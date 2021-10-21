 class Calculator {
    void area(int a, int b){
        int area_of_rec = a*b;
        System.out.println(area_of_rec);
    }
    void area(int r){
        double pie= 3.14;
        int area_of_circle= (int) (pie*r*r);
        System.out.println(area_of_circle);

    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.area(10,20);
        c.area(45);
    }
}
