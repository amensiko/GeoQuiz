package com.bignerdranch.android.geoquiz;

/**
 * Created by anastasia on 21/09/2015.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question (int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
