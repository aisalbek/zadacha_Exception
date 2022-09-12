public class Phone {
    String model;
    int weight;
    String color;
    int memory;

    public Phone(String model, int weight, String color, int memory) {
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.memory = memory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                '}';
    }
}
