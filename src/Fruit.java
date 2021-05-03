class Fruit implements Comparable<Fruit>{

    String name;
    double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int compareTo(Fruit fruit) {
        if(price== fruit.price)
        return 0;
        else if(price> fruit.price)
            return 1;
        else
            return -1;
    }
}
