package model.entities;

import java.math.BigDecimal;

public class Periodical {

    private int id;
    private int issueIndex;
    private String name;
    private BigDecimal monthlyPrice;

    public Periodical() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIssueIndex() {
        return issueIndex;
    }

    public void setIssueIndex(int issueIndex) {
        this.issueIndex = issueIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(BigDecimal monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public static class Builder {

        private Periodical instance = new Periodical();

        private Builder setId(int id) {
            instance.id = id;
            return this;
        }

        private Builder setIssueIndex(int issueIndex) {
            instance.issueIndex = issueIndex;
            return this;
        }

        private Builder setName(String name) {
            instance.name = name;
            return this;
        }

        private Builder setMonthlyPrice(BigDecimal monthlyPrice) {
            instance.monthlyPrice = monthlyPrice;
            return this;
        }

        public Periodical build() {
            return instance;
        }


    }

    @Override
    public String toString() {
        return "Periodical{" +
                "id=" + id +
                ", issueIndex=" + issueIndex +
                ", name='" + name + '\'' +
                ", monthlyPrice=" + monthlyPrice +
                '}';
    }
}
