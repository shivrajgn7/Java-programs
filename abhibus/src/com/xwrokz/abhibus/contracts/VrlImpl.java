package com.xwrokz.abhibus.contracts;

import com.xwrokz.abhibus.AbhiBus;

public class VrlImpl extends SrsImpl implements AbhiBus   {

    @Override
    public int isMinBooking() {
        return 20;
    }


    @Override
    public boolean isGoodCondition() {
        return true;
    }
}
