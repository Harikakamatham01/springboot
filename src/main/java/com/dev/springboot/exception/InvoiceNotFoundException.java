package com.dev.springboot.exception;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dev.springboot.exception.InvoiceNotFoundException;
import com.dev.springboot.model.Invoice;
import com.dev.springboot.respository.InvoiceRespository;
import com.dev.springboot.service.InvoiceService;

public class InvoiceNotFoundException extends RuntimeException {
	  

	      private static final long serialVersionUID = 1L;

	      public InvoiceNotFoundException() {
	          super();
	      }

	      public InvoiceNotFoundException(String customMessage) {
	          super(customMessage);
	      }
	  }

