package model.entities;

public class SubscriptionEntry {

    private int id;
    private Periodical periodical;
    private int subscription_id;
    private int quantity;

    public SubscriptionEntry() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubscription_id() {
        return subscription_id;
    }

    public void setSubscription_id(int subscription_id) {
        this.subscription_id = subscription_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Periodical getPeriodical() {
        return periodical;
    }

    public void setPeriodical(Periodical periodical) {
        this.periodical = periodical;
    }

    public static class Builder {

        private SubscriptionEntry instsnce = new SubscriptionEntry();

        private Builder setId(int id) {
            instsnce.id = id;
            return this;
        }

        private Builder setPeriodicals_issue_id(Periodical periodical) {
            instsnce.periodical = periodical;
            return this;
        }

        private Builder setSubscription_id(int subscription_id) {
            instsnce.subscription_id = subscription_id;
            return this;
        }

        private Builder setQuantity(int quantity) {
            instsnce.quantity = quantity;
            return this;
        }
    }

    @Override
    public String toString() {
        return "SubscriptionEntry{" +
                "id=" + id +
                ", periodicals_issue_id=" + periodical.getId() +
                ", subscription_id=" + subscription_id +
                ", quantity=" + quantity +
                '}';
    }
}
