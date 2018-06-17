package dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import dao.CommoditiesDao;
import entity.Commodities;

@Repository //为了包扫描的时候这个Dao被扫描到  
public class CommoditiesDaoImpl extends BaseDaoImpl<Commodities> implements CommoditiesDao{  
    public CommoditiesDaoImpl(){  
        //设置命名空间  
        super.setNs("mapper.CommoditiesMapper");
    }
    //实现接口自己的方法定义
	public int count(Map map) {
		return this.getSqlSession().selectOne(this.getNs() + ".count", map);
	}
}
