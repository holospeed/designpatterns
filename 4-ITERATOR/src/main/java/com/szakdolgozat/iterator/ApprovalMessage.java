package com.szakdolgozat.iterator;

import com.szakdolgozat.Evaluation;

public class ApprovalMessage {
    private IApprovalIterator iterator;

    public ApprovalMessage(boolean isSuccessRequest, boolean isApproved, Evaluation approveState) {
        if (isSuccessRequest) {
            iterator = new SuccessRequestIterator(isApproved, approveState);
        } else {
            iterator = new NotSuccessRequestIterator(isApproved);
        }
    }

    public String getMessage() {
        StringBuilder builder = new StringBuilder();
        while (iterator.hasNext()) {
            builder.append(iterator.next()).append(" ");
        }
        return builder.toString().trim();
    }
}

class NotSuccessRequestIterator implements IApprovalIterator {
    private final boolean isApproved;
    private int index = 0;

    public NotSuccessRequestIterator(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public boolean hasNext() {
        return index == 0;
    }

    public String next() {
        if (index == 0) {
            index++;
            return isApproved ? "approved off" : "reproved off";
        } else {
            return null;
        }
    }
}
