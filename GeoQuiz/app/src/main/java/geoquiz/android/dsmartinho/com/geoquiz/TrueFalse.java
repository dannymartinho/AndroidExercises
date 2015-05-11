package geoquiz.android.dsmartinho.com.geoquiz;

/**
 * Created by daniel.martinho on 11-05-2015.
 */
public class TrueFalse {
    private int mQuestionTextId;
    private boolean mQuestionTrue;

    public TrueFalse(int questionTextId, boolean questionTrue) {
        mQuestionTextId = questionTextId;
        mQuestionTrue = questionTrue;
    }

    public int getQuestionTextId() {
        return mQuestionTextId;
    }

    public void setQuestionTextId(int questionTextId) {
        mQuestionTextId = questionTextId;
    }

    public boolean isQuestionTrue() {
        return mQuestionTrue;
    }

    public void setQuestionTrue(boolean questionTrue) {
        mQuestionTrue = questionTrue;
    }
}
