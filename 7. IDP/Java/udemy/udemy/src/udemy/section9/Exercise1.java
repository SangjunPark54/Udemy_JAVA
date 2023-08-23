package udemy.section9;

import java.math.BigDecimal;

public class Exercise1 {
    /*
    Simple Interest Formula
    Total Amount = principal + principal * interest * noOfYears;
     */

        private BigDecimal principal;
        private BigDecimal interest;

        public Exercise1(String principal, String interest) {
            this.principal = new BigDecimal(principal);
            this.interest = new BigDecimal(interest);
        }

        public BigDecimal calculateTotalValue(int noOfYears) {
            BigDecimal totalValue = principal.add(
                    principal.multiply(interest)
                            .multiply(new BigDecimal(noOfYears))
            );
            return totalValue;
        }

        public static void main(String[] args) {
            SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
            BigDecimal totalValue = calculator.calculateTotalValue(5); //5 years
            System.out.println(totalValue);

            Exercise1 calculator1 = new Exercise1("8500.00", "2.5");
            BigDecimal totalValue1 = calculator1.calculateTotalValue(3);
            System.out.println(totalValue1);
        }
    }

