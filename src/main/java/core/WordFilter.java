package core;

public class WordFilter {

    private boolean isExactWordLengthFilter;
    private boolean isMinWordLengthFilter;
    private boolean isMaxWordLengthFilter;

    private int exactWordLengthFilter;
    private int minWordLengthFilter;
    private int maxWordLengthFilter;

    public WordFilter() {

    }


    /**
     * @param word - String to filter
     * @return - true if word should be retained, false if discarded
     */
    public boolean retain(String word) {

        //  Check for word length first

        if (isExactWordLengthFilter && word.length() != exactWordLengthFilter) {
            return false;
        }
        if (isMinWordLengthFilter && word.length() < minWordLengthFilter) {
            return false;
        }
        if (isMaxWordLengthFilter && word.length() > maxWordLengthFilter) {
            return false;
        }


        return true;
    }

    public void setExactWordLengthFilter(int length) {
        this.isExactWordLengthFilter = true;
        this.exactWordLengthFilter = length;
    }

    public void setMaxWordLengthFilter(int maxLength) {
        this.isMaxWordLengthFilter = true;
        this.maxWordLengthFilter = maxLength;
    }

    public void setMinWordLengthFilter(int minLength) {
        this.isMinWordLengthFilter = true;
        this.minWordLengthFilter = minLength;
    }
}
