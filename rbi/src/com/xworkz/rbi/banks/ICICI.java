package com.xworkz.rbi.banks;

import com.xworkz.rbi.RBIGuidlines;

public class ICICI implements RBIGuidlines {
    @Override
    public void loanAgreements() {
        System.out.println("Must be in writing, detailing all terms and conditions, and a copy must be given to the borrower. ");
    }

    @Override
    public void creditAssessment() {
        System.out.println("Banks must perform due diligence on borrowers' creditworthiness rather than relying solely on margin and security. ");

    }

    @Override
    public void largeDemandDraftsTransfers() {
        System.out.println("Issuance of drafts, mail transfers, etc., for amounts of ₹50,000 and above must be done by debit to the customer's account or against a cheque, not cash. ");

    }

    @Override
    public void pANRequirement() {
        System.out.println("Applicants for demand drafts, mail transfers, etc., for amounts over ₹10,000 must provide their permanent account number (PAN). ");

    }

    @Override
    public void depositSsolicitation() {
        System.out.println("Banks cannot pay commission or incentives on deposits, except for specific exceptions like door-to-door collection agents, business facilitators/correspondents, or approved staff incentives. ");

    }

    @Override
    public void accountOpening() {
        System.out.println(" Payments banks can only accept savings and current deposits, with an aggregate limit of ₹100,000 per customer. ");

    }

    @Override
    public void loanAcceptance() {
        System.out.println("Banks must obtain and keep on record the borrower's acceptance of credit terms and conditions, given with full knowledge. ");

    }
}
