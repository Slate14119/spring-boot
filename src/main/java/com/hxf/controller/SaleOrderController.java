package com.hxf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hxf.model.SaleOrder;
import com.hxf.service.SaleOrderService;

@Controller
// @RestController
@RequestMapping("/hxf")

@Component
public class SaleOrderController {
	@Autowired
	private SaleOrderService saleOrderService;

	@RequestMapping("/test")
	List<SaleOrder> test() {
		List<SaleOrder> saleOrders = saleOrderService.findAll();
		return saleOrders;
	}

	@RequestMapping("/show")
	public String show() {
		return "hello";
	}

	@RequestMapping("/index")
	public String index(Model model) {
		List<SaleOrder> saleOrders = saleOrderService.findAll();
		model.addAttribute("hello", saleOrders);
		return "/index";
	}

}
