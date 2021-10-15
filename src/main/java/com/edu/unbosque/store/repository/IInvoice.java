package com.edu.unbosque.store.repository;

import com.edu.unbosque.store.model.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IInvoice extends CrudRepository <Invoice, Long> {

}
