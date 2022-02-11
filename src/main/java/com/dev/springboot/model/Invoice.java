package com.dev.springboot.model;
import java.util.List;
import com.dev.springboot.model.Invoice;

public  interface Invoice {

	    public Invoice saveInvoice(Invoice invoice);
	    public List<Invoice> getAllInvoices();
	    public Invoice getInvoiceById(Long id);
	    public void deleteInvoiceById(Long id);
	    public void updateInvoice(Invoice invoice);
		public Long getId();

	}


