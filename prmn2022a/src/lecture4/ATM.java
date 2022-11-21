package lecture4;
import java.util.ArrayList;
import java.util.List;

public class ATM {
    private List<Account> accountList;

    ATM() {
        this.accountList = new ArrayList<>();
    }

    public void registerAccount(String name, String number) {
        accountList.add(new Account(name, number));
        System.out.println(name + " さんのアカウントを口座番号:" + number + " で登録しました。");
    }

    public boolean existsAccount(String name, String number) {
        for (Account account : accountList) {
            if (account.getName()==name && account.getNumber()==number) {
                System.out.println("名前: " + name + " 口座番号: " + number + " は存在します。");
                return true;
            }
        }

        System.out.println("名前: " + name + " 口座番号: " + number + " は存在しません。");
        return false;
    }

    public void deposit(String number,long money){
        for (Account account : accountList) {

            if (account.getNumber() == number) {
                account.setBalance(account.getBalance() + money);
                System.out.println("口座番号: " + number + " に " + money + " 円入金しました。");
                return;
            }

        }

        System.out.println("口座番号: " + number + " は存在しません。");
    }

    public long withdraw(String number, long money) {
        for (Account account : accountList) {

            if (account.getNumber() == number){

                if (account.getBalance() >= money) {
                    account.setBalance(account.getBalance() - money);
                    System.out.print("口座番号: " + number + " から " + money + " 円引き出しました。残高: " + account.getBalance() + " 円です。");
                    return money;
                } else {
                    System.out.print("口座番号: " + number + " から " + money + " 円引き出せませんでした。残高: " + account.getBalance() + " 円です。");
                    return 0;
                }

            }
        }

        System.out.println("口座番号: " + number + " は存在しません。");
        return 0;
    }


}
