package com.xwrokz.abhibus.contracts;

import com.xwrokz.abhibus.AbhiBus;

public class SrsImpl implements AbhiBus {
    @Override
   public int isMinBooking(){
        return 21;
    }
    @Override
   public boolean isGoodCondition(){
        return false;
    }
}
