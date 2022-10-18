package org.report;

import java.util.List;

public class ComplexReportGenerator extends AbstractReportGenerator{
    public boolean customerReportCondition(Customer customer) {
        if(customer.getPoint() > 50)
            return true;
        else
            return false;
    }

    public String getReportHeader(List<Customer> customers) {
        return "고객의 수 : "+ customers.size()+" 명 입니다"+"\n";
    }

    public String getReportForCustomer(Customer customer) {
        return customer.getPoint()+": "+customer.getName()+"\n";
    }

    public String getReportFooter(List<Customer> customers) {
        int sum = 0;
        for (Customer customer : customers) {
            sum += customer.getPoint();
        }
        return "점수 합계: "+sum+"\n";
    }
}
