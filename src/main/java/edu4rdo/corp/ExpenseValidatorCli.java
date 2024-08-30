package edu4rdo.corp;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class ExpenseValidatorCli implements QuarkusApplication {
    @Inject
    ExpenseValidator validator;

    @Override
    public int run(String... args) throws Exception {
        if (args.length !=1) {
            throw new IllegalArgumentException("O comando requer 1 argumento");    
        }

        try{
            int amountValue = Integer.parseInt(args[0]);
            if (validator.isValidAmount(amountValue)) {
                System.out.println("Valid amount: "+ amountValue);
                return 0;
            }
            System.out.println("Invalid amount " + amountValue);

            return 1;
        } catch(NumberFormatException e){
            throw new IllegalAccessException("O argumento deve ser um inteiro");
        }

    }

    public static void main(String[] args) {
        Quarkus.run(ExpenseValidatorCli.class, "33");
    }

    

    

    
}