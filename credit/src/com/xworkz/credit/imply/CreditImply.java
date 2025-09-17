package com.xworkz.credit.imply;

import com.xworkz.credit.Credit;

public class CreditImply  implements Credit {
    public long creditCardNo(long creditCardNo){
        return creditCardNo;
    }
    public String holderName(String holderName){
        return  holderName;
    }
    public boolean isCredited(int amt){
        if(amt>10)
            return true;
        else
            return false;
    }

}
