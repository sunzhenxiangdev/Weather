package com.xiang.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by jose on 2016/12/25-15:18.
 * EMAIL:sunzhenxiangvip@126.com
 */

public class Province extends DataSupport {
    private int id;
    //省名称
    private String provinceName;
    //省代码
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
