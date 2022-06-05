package bankSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransactionHistory {
        private long id;
        private LocalDate dayTrading;
        private String description;
        private String beneficiaryAccount;
        private long money;

        public TransactionHistory(String description, String beneficiaryAccount, long money){
                this.id = IdGenerate.getNewID();//Id để tự động tăng
                this.dayTrading = LocalDate.now();//Lay ngay hien tai
            this.description = description;
            this.beneficiaryAccount = beneficiaryAccount;
            this.money = money;
        }
        public String getBeneficiaryAccount(){
            return  beneficiaryAccount;
        }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public LocalDate getDayTrading() {
        return dayTrading;
    }

    public String getDescription() {
        return description;
    }

    public long getMoney() {
        return money;
    }

    public Long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        return "TransactionHistory{" +
                "id=" + id +
                ", dayTrading=" + dayTrading +
                ", description='" + description + '\'' +
                ", beneficiaryAccount='" + beneficiaryAccount + '\'' +
                ", money=" + money +
                '}';
    }
}


