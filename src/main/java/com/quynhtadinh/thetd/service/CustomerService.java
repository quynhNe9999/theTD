package com.quynhtadinh.thetd.service;
import com.quynhtadinh.thetd.entity.Customer;
import com.quynhtadinh.thetd.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Lấy tất cả khách hàng
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Tìm khách hàng theo ID
    public Customer getCustomerById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            throw new RuntimeException("Không tìm thấy khách hàng với ID: " + id);
        }
    }

    // Thêm mới hoặc cập nhật khách hàng
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Xóa khách hàng theo ID
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
