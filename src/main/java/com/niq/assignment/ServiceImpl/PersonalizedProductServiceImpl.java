package com.niq.assignment.ServiceImpl;

import com.niq.assignment.model.PersonalizedProduct;
import com.niq.assignment.repositories.PersonalizedProductRepository;
import com.niq.assignment.service.PersonalizedProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalizedProductServiceImpl implements PersonalizedProductService {

    @Autowired
    private PersonalizedProductRepository personalizedProductRepository;

    @Override
    public void ingestPersonalizedProducts(PersonalizedProduct personalizedProduct) {

        personalizedProductRepository.save(personalizedProduct);
    }

}
