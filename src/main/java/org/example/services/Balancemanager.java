package org.example.services;
import jakarta.inject.Inject;
import org.example.accounts.BaseAccount;
import org.example.storages.AccountStorage;
import org.example.cards.PaymentCard;

public class Balancemanager {
    @Inject
    TransactionDater transactionDater;
        Balancecheck Kontrola = new Balancecheck();
        Logger logger = new Logger();
        public boolean cardTransaction(AccountStorage accountStorage, PaymentCard paymentcard, double amount, boolean action) {
            BaseAccount account = accountStorage.findAccountByPaymentCard(paymentcard);
            if (account == null) return false;

            if (action) {
                return addBalance(account, amount,true) ;
            }
            else
            {
                return decreaseBalance(account, amount,true) ;
            }

        }
        public boolean addBalance(BaseAccount account, double amount) {
            return addBalance(account, amount, false);
        }
        public boolean addBalance(BaseAccount account, double amount,boolean card) {
            if(Kontrola.depositcheck(account,amount) == true)
                {
                account.setBalance(account.getBalance()+amount);
                transactionDater.addTransactionInfo(account,amount,"Add Balance",card);
                logger.Success();
                return  true;
                }
                logger.Error();
                return   false;
        }

        public boolean decreaseBalance(BaseAccount account, double amount) {
            return decreaseBalance(account, amount, false); // default = false
        }
        public boolean decreaseBalance(BaseAccount account, double amount,boolean card) {
            if(Kontrola.withdrawcheck(account,amount) == true && account.getBalance()>amount)
            {
                account.setBalance(account.getBalance() - amount);
                transactionDater.addTransactionInfo(account,amount,"Decrease Balance",card);
                logger.Success();
                return true;
            }
            logger.Error();
            return false;
        }
    }


