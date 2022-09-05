package ru.sberbank.shopping.service.serviceImpl;

import org.springframework.stereotype.Service;
import ru.sberbank.shopping.entity.Employee;
import ru.sberbank.shopping.service.AccountingService;

@Service
public class AccountingServiceImpl implements AccountingService {

    @Override
    public Long calculatePay(Employee employee) {
        return null;
    }
}
