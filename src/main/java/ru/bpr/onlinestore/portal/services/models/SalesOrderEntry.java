package ru.bpr.onlinestore.portal.services.models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "sales_order_entries")
public class SalesOrderEntry
{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "count", nullable = false)
    private int count;

    @JoinColumn(name = "offer", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Offer offer;

    @JoinColumn(name = "sales_order", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SalesOrder salesOrder;

    public BigInteger getId()
    {
        return id;
    }

    public void setId(BigInteger id)
    {
        this.id = id;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public Offer getOffer()
    {
        return offer;
    }

    public void setOffer(Offer offer)
    {
        this.offer = offer;
    }

    public SalesOrder getSalesOrder()
    {
        return salesOrder;
    }

    public void setSalesOrder(SalesOrder salesOrder)
    {
        this.salesOrder = salesOrder;
    }
}
