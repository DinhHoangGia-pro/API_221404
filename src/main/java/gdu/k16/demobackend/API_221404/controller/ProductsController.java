package gdu.k16.demobackend.API_221404.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gdu.edu.studentk16.demo_221402.model.Student;
import gdu.k16.demobackend.API_221404.model.IMyDAO;
import gdu.k16.demobackend.API_221404.model.Product;


@RestController
public class ProductsController 
{
	
	@Autowired
	IMyDAO myDAO;
	
	@GetMapping("/listProducts")
	public List<Product> listProducts()
	{
		return myDAO.findAll();
		
		
	}
	
	@PostMapping("/insertProduct")
	public String insertStudent(@RequestBody Product newproduct)
	{		
		myDAO.save(newproduct);		
		return "Thêm sản phẩm thành công!";	
		
	}
	
	@PutMapping("/updateProduct")
	public String updateStudent(@RequestBody Product product)
	{
		
		myDAO.save(product);		
		return "Sửa sản phẩm thành công!";
			
		
	}
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable Integer id)
	{
		
		myDAO.deleteById(id);		
		return "Xóa thành công!";
			
	}

}
