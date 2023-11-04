public class CodeCoverageExamples {

    // 1. Statement Code Coverage Example
    private void performActionStatement(int x, int y) {
        doSomething();
        if (x > 3 && y < 6) {
            doSomethingElse();
        } else {
            System.out.println(x + y);
        }
        doSomething();
        // Call: performActionStatement(4, 5);
        // Statement Coverage = (Number of executed statements)/(Total Number of Statements)* 100%
    }

    // 2. Branch Code Coverage Example
    private void performActionBranch(int x, int y) {
        doSomething();
        if (x > 3 && y < 6) {
            doSomethingElse();
        } else {
            System.out.println(x + y);
        }
        doSomething();
        // Calls: performActionBranch(2, 3); performActionBranch(4, 7);
        // Branch Coverage = (Number of Branches)/(Total Number of Branches)* 100%
    }

    // 3. Branch Condition Coverage Example
    private void performActionBranchCondition(int x, int y) {
        doSomething();
        if (3 <= x && x < 5) {
            doSomethingElse();
        } else {
            System.out.println(x + y);
        }
        doSomething();
        // Calls: performActionBranchCondition(2, 3); performActionBranchCondition(4, 7);
    }

    // 4. Branch Condition Combination Coverage Example
    private void performActionBranchConditionCombination(int x, int y) {
        doSomething();
        if (3 <= x && x < 5) {
            doSomethingElse();
        } else {
            System.out.println(x + y);
        }
        doSomething();
        // Calls: performActionBranchConditionCombination(2, 3); performActionBranchConditionCombination(4, 3);
        //        performActionBranchConditionCombination(4, 7); performActionBranchConditionCombination(2, 7);
    }

    // 5. Condition Determination Coverage Example
    private void performActionConditionDetermination(int x, int y) {
        doSomething();
        if (4 <= x || y < 6) {
            doSomethingElse();
        } else {
            System.out.println(x + y);
        }
        doSomething();
        // Calls: performActionConditionDetermination(2, 3); performActionConditionDetermination(4, 7);
    }

    private void doSomething() {
        // Some code
    }

    private void doSomethingElse() {
        // Some code
    }
}