/* Datoon, Philip Bryan B.
 * 131311399
 * Cluster 3 - Project 1
 */

package Project01;

public class PersonalLoan extends Loan {
    PersonalLoan(String loanNum, String lastName,
            double loanAmt, int term, double primeIntRate) {
        super(loanNum, lastName, loanAmt, term);
        super.interestRate = 0.02 / (primeIntRate / 100);
    }
}
