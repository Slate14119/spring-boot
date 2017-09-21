package com.hxf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hxf.dao.SaleOrderDao;
import com.hxf.model.SaleOrder;

@Service
@Component
public class SaleOrderServiceImpl implements SaleOrderService{
	@Autowired
	private SaleOrderDao saleOrderDao;
	public List<SaleOrder>  findAll(){
		int id1=6502;
		int id2=6502;
		return  saleOrderDao.findSomeOrder();
//		return saleOrderDao.findTwo(id1,id2);
	}
}
