class demo {
    

    public static void main(String[] args) {
        d obj = new d();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1.0, 2.0));
        System.out.println(obj.add("Hello", "World"));



    }
}

class d {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + " " + b;
    }
}