package com.hxf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hxf.model.SaleOrder;



//CrudRepository 为最基础的
@Mapper
public interface SaleOrderDao {
//	@Query("select m from SaleOrder m where m.id=:6502 union "
//			+ " select n from SaleOrder n where m.id=6503")
//	@Query("select m from  SaleOrder m ")
//	@Query(value="select * from  sale_order m limit 10",nativeQuery=true)
//	List<SaleOrder>  findSome();
	
	@Select("select * from  sale_order limit 10")
	List<SaleOrder>  findSomeOrder();
	
//	List<SaleOrder> findFirst10();
	
//	@Query("select m from SaleOrder m where m.id=:id")
//	SaleOrder findOne(int id);
	
	
//	@Query("select m from SaleOrder m where m.id=:id1 union "
//			+ " select n from SaleOrder n where m.id=:id2")
//	List<SaleOrder> findTwo(int id1,int id2);
	 
}
