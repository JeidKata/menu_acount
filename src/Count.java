public class Count {
    private float amount;

    public Count(){
        this.amount = 0;
    }

    public float getAmount() {
        return amount;
    }

    private void setAmount(float amount) {
        this.amount = amount;
        System.out.println("Su nuevo saldo es: " + this.amount);
    }

    public void addAmount(float value){
        if(value>0){
            setAmount(this.amount + value);
        }
        else {
            System.out.println("Ingrese un valor válido.");
        }
    }

    public void retrieveAmount(float value){
        if(this.amount>=value & value>=0){
            setAmount(this.amount - value);
        }
        else {
            System.out.println("No tiene saldo suficiente.");
        }
    }
}
