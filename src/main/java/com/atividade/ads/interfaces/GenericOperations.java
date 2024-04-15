package com.atividade.ads.interfaces;

import java.util.List;

public interface GenericOperations<T, N> {

    public T create(T entity);
    public T read(N id);
    public List<T> readAll();
    public T updatePart(N id, T entity);
    public T updateAll(N id, T entity);
    public void delete(N id);

}
