package model.entity;

public class Subscription {

    private int id;
    private String name;
    private int duration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static class Builder {

        private Subscription instance = new Subscription();

        private Builder setId(int id) {
            instance.id = id;
            return this;
        }

        private Builder setName(String name) {
            instance.name = name;
            return this;
        }

        private Builder setDuration(int duration) {
            instance.duration = duration;
            return this;
        }

        public Subscription build() {
            return instance;
        }
    }
}
