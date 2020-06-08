package me.divisa.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciudad")
public class Bank {

    @Id
    public String fecha;
    @Column(name = "usd_com")
    public Double usdCompra;
    @Column(name = "usd_ven")
    public Double usdVenta;

    public Bank() {
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getUsdCompra() {
        return usdCompra;
    }
    public void setUsdCompra(Double usdCompra) {
        this.usdCompra = usdCompra;
    }

    public Double getUsdVenta() {
        return usdVenta;
    }
    public void setUsdVenta(Double usdVenta) {
        this.usdVenta = usdVenta;
    }

}