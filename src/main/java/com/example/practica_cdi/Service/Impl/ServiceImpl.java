package com.example.practica_cdi.Service.Impl;


import com.example.practica_cdi.Repository.Repositorio;
import com.google.protobuf.*;
import jakarta.inject.Inject;
import jakarta.inject.Named;

public class ServiceImpl implements Service
{
    @Inject
    @Named("jdbcRepositorio")
    private Repositorio repositorio;

    @Override
    public Descriptors.ServiceDescriptor getDescriptorForType() {
        return null;
    }

    @Override
    public void callMethod(Descriptors.MethodDescriptor methodDescriptor, RpcController rpcController, Message message, RpcCallback<Message> rpcCallback) {

    }

    @Override
    public Message getRequestPrototype(Descriptors.MethodDescriptor methodDescriptor) {
        return null;
    }

    @Override
    public Message getResponsePrototype(Descriptors.MethodDescriptor methodDescriptor) {
        return null;
    }
}
