class Solution {
    public boolean isValid(String s) {
        char[] branches = s.toCharArray();
        boolean result = branches.length % 2 == 0;
        int openRoundCount = 0;
        int closeRoundCount = 0;
        int openCurlyCount = 0;
        int closeCurlyCount = 0;
        int openSquareCount = 0;
        int closeSquareCount = 0;


        for (int i = 0; i < branches.length; i++) {
            char branch = branches[i];
            if (result) {
                if ('{' == branch) {
                    openCurlyCount++;
                    result = checkCloseBranch(branches, i, '}');
                    if (result) {
                        result = branches[i + 1] != ')' && branches[i + 1] != ']';
                    }
                } else if ('(' == branch) {
                    openRoundCount++;
                    result = checkCloseBranch(branches, i, ')');
                    if (result) {
                        result = branches[i + 1] != '}' && branches[i + 1] != ']';
                    }
                } else if ('[' == branch) {
                    openSquareCount++;
                    result = checkCloseBranch(branches, i, ']');
                    if (result) {
                        result = branches[i + 1] != '}' && branches[i + 1] != ')';
                    }
                } else if ('}' == branch) {
                    closeCurlyCount++;
                } else if (')' == branch) {
                    closeRoundCount++;
                } else if (']' == branch) {
                    closeSquareCount++;
                }
            }
        }


        if (result && (openRoundCount != closeRoundCount
                || openCurlyCount != closeCurlyCount
                || openSquareCount != closeSquareCount)) {
            result = false;
        }
        return result;
    }


    private boolean checkCloseBranch(char[] branches, int i, char c) {
        boolean result;
        result = false;
        int j = i + 1;
        while (!result && j < branches.length) {
            result = branches[j] == c;
            j += 2;
        }
        return result;
    }
}