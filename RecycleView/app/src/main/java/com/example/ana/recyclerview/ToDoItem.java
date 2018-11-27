package com.example.ana.recyclerview;

import java.util.UUID;

public class ToDoItem {

    enum Status{
        DONE, NOT_DONE;
    }

    private UUID mId; //universal unique identifier
    private ToDoItem.Status mStatus;
    private String mText;

    public ToDoItem(String mText) {
        this.mText = mText;
    }

    public UUID getmId() {
        return mId;
    }

    public ToDoItem.Status getmStatus() {
        return mStatus;
    }

    public String getmText() {
        return mText;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public void setmStatus(ToDoItem.Status mStatus) {
        this.mStatus = mStatus;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}
