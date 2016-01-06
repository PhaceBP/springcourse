package hu.ericsson.springcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hu.ericsson.springcourse.dao.CustomerDao;
import hu.ericsson.springcourse.listeners.CustomerCreationEvent;
import hu.ericsson.springcourse.model.Customer;


@Service
public class DefaultCustomerService implements CustomerService
{
  
  @Autowired
  private CustomerDao dao;
  
  
  @Autowired
  private ApplicationEventPublisher publisher;
 

  @Transactional
  public Long createCustomer(Customer customer)
  {
    dao.create(customer);
    CustomerCreationEvent evt = new CustomerCreationEvent(this);
    evt.setMessage("Customer created$$");
    publisher.publishEvent(evt);
    String v = null;
    v.toString();
    return 1L;
  }

}
