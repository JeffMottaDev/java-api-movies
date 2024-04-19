package com.example.screemmatch.services;

public interface IMAppper {
    <T> T toMapper(String json, Class<T> classe);
}
