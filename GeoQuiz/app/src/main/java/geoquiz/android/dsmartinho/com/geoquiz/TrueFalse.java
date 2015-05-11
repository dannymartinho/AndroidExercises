package geoquiz.android.dsmartinho.com.geoquiz;

/**
 * Created by daniel.martinho on 11-05-2015.
 */
public class TrueFalse {
    private int mQuestion;

    private Boolean mTrueQuestion;

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public Boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(Boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    public TrueFalse(int mQuestion, boolean mTrueQuestion) {
        this.mQuestion = mQuestion;
        this.mTrueQuestion = mTrueQuestion;
    }
}
