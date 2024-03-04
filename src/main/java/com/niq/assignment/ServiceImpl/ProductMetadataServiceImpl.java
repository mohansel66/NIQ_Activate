package com.niq.assignment.ServiceImpl;

import com.niq.assignment.model.ProductMetadata;
import com.niq.assignment.repositories.ProductMetadataRepository;
import com.niq.assignment.service.ProductMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductMetadataServiceImpl implements ProductMetadataService {

    @Autowired
    private ProductMetadataRepository productMetadataRepository;

    @Override
    public void addProductMetadata(ProductMetadata productMetadata) {

        productMetadataRepository.save(productMetadata);
    }

}
