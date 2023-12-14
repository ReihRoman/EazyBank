package com.eazybytes.loans.mapper;

import com.eazybytes.loans.dto.LoansDto;
import com.eazybytes.loans.entity.Loans;

public class LoansMapper {

    public static LoansDto mapToLoansDto(Loans loans,LoansDto loansDto){
        loansDto.setLoanNumber(loans.getLoanNumber());
        loansDto.setLoanType(loans.getLoanType());
        loansDto.setAmountPaid(loans.getAmountPaid());
        loansDto.setMobileNumber(loans.getMobileNumber());
        loansDto.setTotalLoan(loans.getTotalLoan());
        loansDto.setOutstandingAmount(loans.getOutstandingAmount());
        return loansDto;
    }
    public static Loans mapToLoans(LoansDto loansDto,Loans loans){
      loans.setMobileNumber(loansDto.getMobileNumber());
      loans.setLoanType(loansDto.getLoanType());
      loans.setTotalLoan(loansDto.getTotalLoan());
      loans.setOutstandingAmount(loansDto.getOutstandingAmount());
      loans.setAmountPaid(loansDto.getAmountPaid());
      loans.setAmountPaid(loansDto.getAmountPaid());

        return loans;
    }
}
