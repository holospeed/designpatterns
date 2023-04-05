package com.szakdolgozat.iterator;

import com.szakdolgozat.Evaluation;

public class SuccessRequestIterator implements IApprovalIterator {
    private final boolean isApproved;
    private final Evaluation approveState;
    private int index = 0;

    public SuccessRequestIterator(boolean isApproved, Evaluation approveState) {
        this.isApproved = isApproved;
        this.approveState = approveState;
    }

    public boolean hasNext() {
        return index < 2;
    }

    public String next() {
        if (index == 0) {
            index++;
            return isApproved
                    ? approveState == Evaluation.approvedOn
                            ? "approved on"
                            : "approved off"
                    : approveState != Evaluation.approvedOn
                            ? "preapproved on"
                            : "preapproved off";
        } else if (index == 1) {
            index++;
            return isApproved
                    ? "approved off"
                    : "reproved off";
        } else {
            return null;
        }
    }
}
