package org.example.model;

import lombok.*;
import org.example.interfaces.AccountInterface;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
@Builder
public class Bank {

    List<AccountInterface> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void addAccount(AccountInterface account){
        accounts.add(account);
    };

}
