package com.example.tecnical.test.impl;

import com.example.tecnical.test.entity.TestData;
import com.example.tecnical.test.repository.TestDataRepository;
import ex.deadman.crudservice.schema.GetTestDataRequest;
import ex.deadman.crudservice.schema.GetTestDataResponse;
import ex.deadman.crudservice.schema.SaveTestDataRequest;
import ex.deadman.crudservice.schema.SaveTestDataResponse;
import ex.deadman.crudservice.wsdl.CrudServicePort;
import org.apache.cxf.annotations.SchemaValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@SchemaValidation(type = SchemaValidation.SchemaValidationType.REQUEST)
public class CrudServiceImpl implements CrudServicePort {

    private TestDataRepository testDataRepository;

    @Autowired
    public CrudServiceImpl(TestDataRepository testDataRepository) {

        this.testDataRepository = testDataRepository;
    }

    @Override
    public GetTestDataResponse getTestData(GetTestDataRequest parameters) {
        GetTestDataResponse response =  new GetTestDataResponse();

        Optional<TestData> data= testDataRepository.findById(parameters.getId());

        response.setId(data.get().getId());
        response.setNameData(data.get().getNameData());
        response.setDescriptionData(data.get().getDescriptionData());

        return response;
    }

    @Override
    public SaveTestDataResponse saveTestData(SaveTestDataRequest parameters) {
        SaveTestDataResponse response= new SaveTestDataResponse();

        TestData data= new TestData(parameters.getId(),parameters.getNameData(),parameters.getDescriptionData());

        TestData dataResponse= testDataRepository.save(data);

        response.setId(data.getId());
        response.setNameData(data.getNameData());
        response.setDescriptionData(data.getDescriptionData());

        return response;
    }
}
