/* Datoon, Philip Bryan B.
 * 131311399
 * Cluster 3 - Project 1
 */

package Project01;

public class BusinessLoan extends Loan {
    BusinessLoan(String loanNum, String lastName,
            double loanAmt, int term, double primeIntRate) {
        super(loanNum, lastName, loanAmt, term);
        super.interestRate = 0.01 / (primeIntRate / 100);
    }
}
