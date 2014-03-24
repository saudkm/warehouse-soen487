/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell_SKM
 */
@Entity
@Table(name = "ON_TRANSIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OnTransit.findAll", query = "SELECT o FROM OnTransit o"),
    @NamedQuery(name = "OnTransit.findById", query = "SELECT o FROM OnTransit o WHERE o.id = :id"),
    @NamedQuery(name = "OnTransit.findByDate", query = "SELECT o FROM OnTransit o WHERE o.date = :date"),
    @NamedQuery(name = "OnTransit.findByZip", query = "SELECT o FROM OnTransit o WHERE o.zip = :zip"),
    @NamedQuery(name = "OnTransit.findByType", query = "SELECT o FROM OnTransit o WHERE o.type = :type"),
    @NamedQuery(name = "OnTransit.findByAmount", query = "SELECT o FROM OnTransit o WHERE o.amount = :amount")})
public class OnTransit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private BigInteger date;
    @Size(max = 255)
    @Column(name = "zip")
    private String zip;
    @Size(max = 255)
    @Column(name = "type")
    private String type;
    @Column(name = "amount")
    private Integer amount;

    public OnTransit() {
    }

    public OnTransit(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getDate() {
        return date;
    }

    public void setDate(BigInteger date) {
        this.date = date;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OnTransit)) {
            return false;
        }
        OnTransit other = (OnTransit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.OnTransit[ id=" + id + " ]";
    }
    
}
