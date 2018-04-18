package com.CompuRed.Store;

import java.util.List;
import com.CompuRed.Store.Info.*;

public class Service implements java.io.Serializable
{
    public Integer id;

    public Customer customer;
    public String description;

    public List<InfoField> extraInfo;

    public bool isDone;

    public Service(Customer customer)
    {
        this.customer = customer;
    }

}

