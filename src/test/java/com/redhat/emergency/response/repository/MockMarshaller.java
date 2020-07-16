package com.redhat.emergency.response.repository;

import java.io.IOException;

import org.infinispan.commons.dataconversion.MediaType;
import org.infinispan.commons.io.ByteBuffer;
import org.infinispan.commons.marshall.BufferSizePredictor;
import org.infinispan.commons.marshall.Marshaller;
import org.infinispan.commons.marshall.ProtoStreamMarshaller;

public class MockMarshaller implements Marshaller {

    private Marshaller delegate = new ProtoStreamMarshaller();

    @Override
    public byte[] objectToByteBuffer(Object obj, int estimatedSize) throws IOException, InterruptedException {
        return delegate.objectToByteBuffer(obj, estimatedSize);
    }

    @Override
    public byte[] objectToByteBuffer(Object obj) throws IOException, InterruptedException {
        return delegate.objectToByteBuffer(obj);
    }

    @Override
    public Object objectFromByteBuffer(byte[] buf) throws IOException, ClassNotFoundException {
        return delegate.objectFromByteBuffer(buf);
    }

    @Override
    public Object objectFromByteBuffer(byte[] buf, int offset, int length) throws IOException, ClassNotFoundException {
        return delegate.objectFromByteBuffer(buf, offset, length);
    }

    @Override
    public ByteBuffer objectToBuffer(Object o) throws IOException, InterruptedException {
        return delegate.objectToBuffer(o);
    }

    @Override
    public boolean isMarshallable(Object o) throws Exception {
        return delegate.isMarshallable(o);
    }

    @Override
    public BufferSizePredictor getBufferSizePredictor(Object o) {
        return delegate.getBufferSizePredictor(o);
    }

    @Override
    public MediaType mediaType() {
        return delegate.mediaType();
    }
}
