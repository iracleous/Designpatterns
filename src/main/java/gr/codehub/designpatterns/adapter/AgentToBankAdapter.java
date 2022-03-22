package gr.codehub.designpatterns.adapter;

public class AgentToBankAdapter implements Agent{
    private Bank bank;

    public AgentToBankAdapter(Bank bank)
    {
        this.bank = bank;
    }
    @Override
    public String makeTransaction(int amount) {
        if (amount <0 )    {
            return bank.withdraw( -amount)+"";
         }
        else if (amount >0){
            return bank.deposit(amount)+"";
        }

        else {
            return bank.getBalance()+"";
        }


    }
}


