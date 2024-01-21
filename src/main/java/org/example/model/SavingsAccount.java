package org.example.model;

import lombok.*;
import org.example.interfaces.AccountInterface;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SavingsAccount implements AccountInterface {

    private double balance;

    private double interesRate;

    private int yearsWIthSave;

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Mondo depositop " + amount + " su saldo Acuual es : " + balance);

    }

    @Override
    public void withdraw(double amount) {
        if(amount >= balance){
            System.out.println("Saldo insuficiente!!");

        }else {
            balance = balance - amount;
            System.out.println("Monto retirado " + amount + " Su saldo retante es : " + balance);
        }
    }

    @Override
    public double calculateInterest() {
        if(interesRate >= 10.0){
            return (balance * interesRate/100 * yearsWIthSave) - balance ;
        }else {
            return (balance * interesRate/10 * yearsWIthSave) - balance;
        }
    }

    public double calulateInteresRate(){
       return interesRate;
    }
    @Override
    public String toString() {
        return "\nCurrentAccount{" +
                "\n     CurrentBalance=" + balance +
                "\n     InteresRate=" + interesRate +
                "\n     Calular Interes= "+ this.calculateInterest() +
                " \n     Calular Interes= "+ this.calulateInteresRate() +
                " \n}";
    }
}
