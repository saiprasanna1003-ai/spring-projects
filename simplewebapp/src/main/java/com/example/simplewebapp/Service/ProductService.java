package com.example.simplewebapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simplewebapp.Model.Product;
import com.example.simplewebapp.Repository.ProductRepo;


@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
//	List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,"Iphone",50000),
//			new Product(2,"Laptop",70000),new Product(3,"TV",40000)));
	
	public List<Product> getProducts()
	{
//		return products;
		return repo.findAll();
	}

	public Product getProductById(int prodId) {
		return repo.findById(prodId).orElse(new Product());
//		return products.stream().filter( p -> p.getProdID() == prodId).findFirst().orElse(new Product(100,"No Item",10));
	}
	
	public void addProduct(Product product)
	{
		repo.save(product);
//		System.out.print(product);
//		products.add(product);
	}

	public void updateProduct(Product product) {
		repo.save(product);
//		int index=0;
//		for(int i=0;i<products.size();i++)
//		{
//			if(products.get(i).getProdID() == product.getProdID())
//			{
//				index = i;
//			}
//		}
//		products.set(index, product);
		
	}

	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);
//		int index=0;
//		for(int i=0;i<products.size();i++)
//		{
//			if(products.get(i).getProdID() == prodId)
//			{
//				index = i;
//			}
//		}
//		products.remove(index);
	}
}
