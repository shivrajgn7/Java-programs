package com.xworkz.rbi;

import com.xworkz.rbi.banks.*;

public class RBIRunner {
    public static void main(String[] args) {
        RBIGuidlines rbiGuidlines=new HDFC();
        rbiGuidlines.loanAgreements();
        rbiGuidlines.creditAssessment();

        RBIGuidlines icic=new ICICI();
        icic.loanAcceptance();
        icic.depositSsolicitation();

        RBIGuidlines canara=new CanaraBank();
        canara.creditAssessment();
        canara.largeDemandDraftsTransfers();


        RBIGuidlines kotak=new KotakBank();
        kotak.largeDemandDraftsTransfers();
        kotak.loanAgreements();


        RBIGuidlines bob=new BOB();
        bob.depositSsolicitation();
        bob.creditAssessment();

        RBIGuidlines karnataka=new KarnatakaBank();
        karnataka.creditAssessment();
        karnataka.pANRequirement();

        RBIGuidlines union=new UnionBank();
        union.accountOpening();
        union.creditAssessment();


    }
}
