package ru.sberbank.shopping.service;

import ru.sberbank.shopping.entity.Employee;

public interface AccountingService {

    Long calculatePay(Employee employee);
}
