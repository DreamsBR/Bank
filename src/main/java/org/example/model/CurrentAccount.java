package org.example.model;

import lombok.*;
import org.example.interfaces.AccountInterface;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentAccount implements AccountInterface {

    private double currentBalance;

    private double interesRate = 0.0;

    public CurrentAccount(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public void deposit(double amount) {
        currentBalance = currentBalance - amount;
        System.out.println("Su saldo es : "+currentBalance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount >= currentBalance){
            currentBalance = currentBalance  - amount;
        }else {
            System.out.println("Saldo insuficiente!!");
        }
    }

    @Override
    public double calculateInterest() {
        return interesRate;
    }

    @Override
    public String toString() {
        return "\nCurrentAccount{" +
                "\n     CurrentBalance=" + currentBalance +
                "\n     InteresRate=" + interesRate +
                "\n     Calular Interes= "+ this.calculateInterest() +
                " \n}";
    }
}
