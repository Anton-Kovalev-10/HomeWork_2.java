public class Cup {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Cup(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void FillThePlate(int addFood) {
        if (addFood >= 0) {
            this.food += addFood;
        }
    }

}