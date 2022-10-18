package org.report;

import java.util.List;

public class SimpleReportGenerator extends AbstractReportGenerator {
    public boolean customerReportCondition(Customer customer) {
        return true;
    }

    public String getReportHeader(List<Customer> customers) {
        return "고객의 수 : "+ customers.size()+" 명\n";
    }

    public String getReportForCustomer(Customer customer) {
        return customer.getName()+": "+customer.getPoint()+"\n";
    }

    public String getReportFooter(List<Customer> customers) {
        return "\n";
    }
}
