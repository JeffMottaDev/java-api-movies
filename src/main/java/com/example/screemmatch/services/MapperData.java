package com.example.screemmatch.services;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperData implements IMAppper
{
    private ObjectMapper mapper = new ObjectMapper();
    @Override
    public <T> T toMapper(String json, Class<T> classe) {
        try {
            return  mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }
}
